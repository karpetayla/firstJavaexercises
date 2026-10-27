package figuras_Geometricas;


//Genero la clase Circulo que hereda de la clase padre Figura
public class Circulo extends Figura{

	//Le paso los parametros unicos que quiero que utilice para el circulo
	protected double radio;
	
	//Genero el constructor
	
	protected Circulo(double radio) {
		super();
		this.radio = radio;
	}
	//Sobreescribo los metodos indicando lo que quiero que realicen

	@Override
	public double calcularArea() {
		this.area = Math.PI * Math.pow(radio, 2);
		return this.area;
	}

	

	@Override
	public double calcularPerimetro() {
		this.perimetro = 2 * Math.PI *radio;
		return this.perimetro;
	}
	
//Genero el ToString para que hereden los metodos del padre

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", calcularArea()=" + calcularArea() + ", calcularPerimetro()="
				+ calcularPerimetro() + "]";
	}
	
	
}
