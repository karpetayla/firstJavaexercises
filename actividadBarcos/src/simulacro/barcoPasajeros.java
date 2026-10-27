package simulacro;

public class barcoPasajeros extends Barco implements capacidad{
	int numCamarotes, pasajerosPorCamarote, pasajerostotal;
	
	protected barcoPasajeros(String id, String nombre, double velocidadMaxima, int numCamarotes,
			int pasajerosPorCamarote) throws barcoInvalidoexception {
		super(id, nombre, velocidadMaxima);
		this.numCamarotes = numCamarotes;
		this.pasajerosPorCamarote = pasajerosPorCamarote;
		
		if (numCamarotes < 0 || pasajerosPorCamarote < 0 || velocidadMaxima < 0) {
            throw new barcoInvalidoexception("Valores negativos no permitidos en BarcoPasajeros"); 
        }
	}

	@Override
	public String toString() {
		return "barcoPasajeros [numCamarotes=" + numCamarotes + ", pasajerosPorCamarote=" + pasajerosPorCamarote
				+ ", pasajerostotal=" + pasajerostotal + ", id=" + id + ", nombre=" + nombre + ", velocidadMaxima="
				+ velocidadMaxima + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	@Override
	public void calcularCapacidad() {
		pasajerostotal=numCamarotes*pasajerosPorCamarote;
		
	}

	@Override
	public void mostrarInformacion() {
		System.out.println(this.toString());

		
	}
	

	
}
