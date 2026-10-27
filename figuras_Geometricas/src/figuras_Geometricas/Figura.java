package figuras_Geometricas;

public abstract class Figura {
	//Paso los parametros que quiero aplicar a ambas clases que van a heredar
	public double area, perimetro;
	
	//Creo mi constructor
	
	
	protected Figura(double area, double perimetro) {
		super();
		this.area = area;
		this.perimetro = perimetro;
	}
	//Creo un constructor vacio para poder inicializar los objetos en la clase principal
	protected Figura() {
		super();
	}

	//Creo los métodos abstractos
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
}
