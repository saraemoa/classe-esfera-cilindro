abstract class Circulo{
	private float raio;

	public Circulo(){
		this.raio = 0;
	}

	public Circulo(float raio){
		this.raio = raio;
	}
	
	public void setRaio(float raio){
		this.raio = raio;
	}

	public float getRaio(){
		return(this.raio);
	}

	public float diametro(){
		return(2 * this.raio);
	}

	public double area(){
		return(Math.PI * Math.pow(this.raio, 2));
	}

	public double perimetro(){
		return(2 * Math.PI * this.raio);
	}

	public void mostrarDados(){
		System.out.print("\nRaio: " + this.raio +
						"\nArea: " + this.area() + 
						"\nDiametro: " + this.diametro() +
						"\nPerimetro: " + this.perimetro());
	}
}