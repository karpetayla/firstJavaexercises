package ejercicio1;

public class BarcoCarga extends Barco implements calcularCapacidad{
	
	int capacidadPorPlanta,numPlantas;

	protected BarcoCarga(String id, String nombre, int velocidadMaxima, int capacidadPorPlanta, int numPlantas) {
		super(id, nombre, velocidadMaxima);
		this.capacidadPorPlanta = capacidadPorPlanta;
		this.numPlantas = numPlantas;
	}

	@Override
	public String toString() {
		return "BarcoCarga [capacidadPorPlanta=" + capacidadPorPlanta + ", numPlantas=" + numPlantas + ", id=" + id
				+ ", nombre=" + nombre + ", velocidadMaxima=" + velocidadMaxima + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void mostrarInformacion() {
		
		
	}
	
	
	
	
	
	

}
