package biblioteca;

public class Alumnos {
	
	//Introduzcp constructores y atributos
	protected String nombre, apellidos, dni, email;
	protected int numexpediente;
	
	
	protected Alumnos(String nombre, String apellidos, String dni, String email, int numexpediente) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.numexpediente = numexpediente;
	}


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


	protected String getEmail() {
		return email;
	}


	protected void setEmail(String email) {
		this.email = email;
	}


	protected int getNumexpediente() {
		return numexpediente;
	}


	protected void setNumexpediente(int numexpediente) {
		this.numexpediente = numexpediente;
	}
	
	//Getters and setters
	
	
	

}
