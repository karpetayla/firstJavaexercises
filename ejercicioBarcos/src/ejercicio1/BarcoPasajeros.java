package ejercicio1;

//Creo la clase hija que hereda los atributos del padre Barco
//De esta manera podemos seguir identificando por los mismos atributos que el padre y añadirle los propios de la hija

public class BarcoPasajeros extends Barco implements calcularCapacidad{
	
	//Declaro los atributos de la clase hija
	int numCamarotes,pasajerosPorCamarote;

	//Creo el constructor
	protected BarcoPasajeros(String id, String nombre, int velocidadMaxima, int numCamarotes,
			int pasajerosPorCamarote) {
		super(id, nombre, velocidadMaxima);
		this.numCamarotes = numCamarotes;
		this.pasajerosPorCamarote = pasajerosPorCamarote;
	}
	
	//Creo el metodo ToString para llevar a cabo la herencia

	@Override
	public String toString() {
		return "BarcoPasajeros [numCamarotes=" + numCamarotes + ", pasajerosPorCamarote=" + pasajerosPorCamarote
				+ ", id=" + id + ", nombre=" + nombre + ", velocidadMaxima=" + velocidadMaxima + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	//Incorporo el metodo mostrarInformacion de la clase padre
	@Override
	public void mostrarInformacion() {
		System.out.println();
		
	}
	
	
	

}
