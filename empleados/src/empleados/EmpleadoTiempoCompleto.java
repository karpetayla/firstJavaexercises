package empleados;

//Creo mi clase EmpleadoTiempoCompledo que hereda de la clase Empleado
public class EmpleadoTiempoCompleto extends Empleado{
	//Le añado el parametro unico de sueldofijo
	protected double sueldofijo=1400;

	//Creo el constructor que añade el parametro unico, y hereda los parametros del padre
	protected EmpleadoTiempoCompleto(String nombre, String apellidos, String dni, double sueldofijo) {
		super(nombre, apellidos, dni);
	}

	//Sobreescribo el metodo y le indico que devuelva el sueldo fijo
	@Override
	public double calcularSueldo() {
		return sueldofijo;
	}
	
	
	

}
