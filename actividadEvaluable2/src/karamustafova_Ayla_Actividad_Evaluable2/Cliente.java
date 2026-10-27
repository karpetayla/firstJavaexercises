package karamustafova_Ayla_Actividad_Evaluable2;

public class Cliente {
	
	//Introduzco mis atributos

	protected String nombre, apellidos, dni;
	protected int movil;
	
	protected final int MOVIL=600000000;
	
	protected Cliente () {
		movil=MOVIL;
		
		
	}
	//Introduzco constructores
	

	protected Cliente(String nombre, String apellidos, String dni, int movil) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.movil = movil;
	}

	protected Cliente(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		movil=MOVIL;
		
		
	}
	
	//Getters and setters

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected int getMovil() {
		return movil;
	}

	protected void setMovil(int movil) {
		this.movil = movil;
	}

	protected int getMOVIL() {
		return MOVIL;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", movil=" + movil
				+ ", MOVIL=" + MOVIL + "]";
	}
	
	
	
	
	
	
}
