package simulacro;

public class barcoCarga extends Barco implements capacidad{
	
	int capacidadPorBodega, numBodegas, cargaTotal;
	

	
	protected barcoCarga(String id, String nombre, double velocidadMaxima, int capacidadPorBodega, int numBodegas) 
			throws barcoInvalidoexception {
		
		super(id, nombre, velocidadMaxima);
		if (capacidadPorBodega < 0 || numBodegas < 0 || velocidadMaxima < 0) {
            throw new barcoInvalidoexception("Valores negativos no permitidos en BarcoPasajeros"); 
        }
		this.capacidadPorBodega = capacidadPorBodega;
		this.numBodegas = numBodegas;
		
		
	}

	@Override
	public String toString() {
		return "barcoCarga [capacidadPorBodega=" + capacidadPorBodega + ", numBodegas=" + numBodegas + ", cargaTotal="
				+ cargaTotal + ", id=" + id + ", nombre=" + nombre + ", velocidadMaxima=" + velocidadMaxima
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	@Override
	public void calcularCapacidad() {
		cargaTotal=capacidadPorBodega*numBodegas;
		
		
	}

	@Override
	public void mostrarInformacion() {
		
		System.out.println(this.toString());
	}
	

}
