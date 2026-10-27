package figuras_Geometricas;


//Creo la clase Restangulo que hereda de Figura
public class Rectangulo extends Figura{

	//Le paso los parametros propios del rectangulo que quiero clacular
	protected double base, altura;
	
//Creo mi constructor
	protected Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
//Sobreescribo los metodos indicando lo que quiero que realicen
	@Override
	public double calcularArea() {
		this.area = base * altura;
		return this.area;
	}

	@Override
	public double calcularPerimetro() {
		this.perimetro = 2 * (base + altura);
		return this.perimetro;
	}
	
	//Genero el ToString para que hereden los metodos del padre
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", calcularArea()=" + calcularArea()
				+ ", calcularPerimetro()=" + calcularPerimetro() + "]";
	}

	
	
}
