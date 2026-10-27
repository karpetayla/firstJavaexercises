
public class Gestionformulario {

	//Introduzco mis atributos
	protected String nombre, apellidos, dni, email;

	
	//Introduzco los constructores 
	protected Gestionformulario(String nombre, String apellidos, String dni, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
	}

	//Inserto Getters and Setters
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
	
	
	
	
	
	
	
	
}
