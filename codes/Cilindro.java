class Cilindro extends Circulo{
	private float altura;

	public Cilindro(){
		super();
		this.altura = 0;
	}

	public Cilindro(float raio, float altura){
		super(raio);
		this.altura = altura;
	}

	public void setAltura(float altura){
		this.altura = altura;
	}

	public float getAltura(){
		return(this.altura);
	}

	public double areaLateral(){
		return(super.perimetro() * this.altura);
	}

	public double area(){
		return(2 * super.area() * this.areaLateral());
	}

	public double volume(){
		return(super.area() * this.altura);
	}

	public void mostrarDados(){
		System.out.print("\nRaio: " + super.getRaio() +
						"\nAltura: " + this.altura +
						"\nArea da base: " + super.area() +
						"\nPerimetro da base: " + super.perimetro() +
						"\nDiametro da base: " + super.diametro() +
						"\nArea Lateral: " + this.areaLateral() +
						"\nArea: " + this.area() +
						"\nVolume: " + this.volume());
	}
}