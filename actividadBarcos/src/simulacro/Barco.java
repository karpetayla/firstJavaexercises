package simulacro;

public abstract class Barco {
	String id, nombre;
	double velocidadMaxima;

protected Barco(String id, String nombre, double velocidadMaxima) {
	
		this.id = id;
		this.nombre = nombre;
		this.velocidadMaxima = velocidadMaxima;
	}

public abstract void mostrarInformacion();
}
