package empleados;

public class EmpleadoPorHoras extends Empleado{
	//Le paso los parametros unicos para mi clase Empleadoporhoras que hereda de la clase Empleado
	protected double preciohora;
	protected double horastrabajadas;
	

	protected EmpleadoPorHoras(String nombre, String apellidos, String dni, double horastrabajadas, double preciohora) {
		super(nombre, apellidos, dni);
		this.preciohora = preciohora;
		this.horastrabajadas = horastrabajadas;
	}

//Sobreescribo el metodo para poder calcular el sueldo
	@Override
	public double calcularSueldo() {
		return this.horastrabajadas*this.preciohora;
		
		
	}
	
	

}
