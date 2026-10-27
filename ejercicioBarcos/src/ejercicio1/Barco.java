package ejercicio1;

//Creo la clase abstracta Barcp
public abstract class Barco {
	//Declaro sus atributos
	String id, nombre;
	int velocidadMaxima;
	
	
//Creo el constructor
	protected Barco(String id, String nombre, int velocidadMaxima) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.velocidadMaxima = velocidadMaxima;
	}


//Creo el método mostrarInformacion
	public abstract void mostrarInformacion();

}
