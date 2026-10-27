package empleados;

import java.util.ArrayList;

//Creacion de clase abstracta

public abstract class Empleado {
	
//Inserto los parametros que quiero aplicar
	protected String nombre, apellidos, dni;
	
	
//Inserto mi constructor
	protected Empleado(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		
	}

//Creo mi metodo abstracto
	public abstract double calcularSueldo();
}
