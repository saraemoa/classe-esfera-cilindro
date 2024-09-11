class LerEsferaCilindro{
	public static char lerTipo() throws Exception{
		char tipo;
		do{System.out.print("\n============= MENU =============" + 
						"\nE - Esfera" + 
						"\nC - Cilindro" +
						"\nF - Fim" + 
						"\n\nQual a opcao do tipo desejado? ");
			tipo = JUtil.readChar();
			}while((tipo != 'E') && (tipo != 'C') && (tipo != 'F'));
			return (tipo);
	}

	public static void main(String[] args) throws Exception{
		Circulo forma;
		char tipo = lerTipo();
		while(tipo != 'F'){
			switch(tipo){
				case 'E':
					forma = new Esfera();
					System.out.print("\nInforme o raio: ");
					((Esfera)forma).setRaio(JUtil.readFloat());
					((Esfera)forma).mostrarDados();
					System.out.print("\n");
					break;
				case 'C':
					forma = new Cilindro();
					System.out.print("\nInforme o raio: ");
					((Cilindro)forma).setRaio(JUtil.readFloat());
					System.out.print("\nInforme a altura: ");
					((Cilindro)forma).setAltura(JUtil.readFloat());
					((Cilindro)forma).mostrarDados();
					System.out.print("\n");
					break;
			}
			tipo = lerTipo();
		}
	}
}