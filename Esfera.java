class Esfera extends Circulo{
	public Esfera(){
		super();
	}

	public Esfera(float raio){
		super(raio);
	}

	public double area(){
		return(4 * super.area());
	}

	public double volume(){
		return(4/3 * Math.PI * Math.pow(super.getRaio(), 3));
	}

	public void mostrarDados(){
		System.out.print("\nRaio: " + super.getRaio() +
						"\nArea: " + this.area() +
						"\nVolume: " + this.volume());
	}
}