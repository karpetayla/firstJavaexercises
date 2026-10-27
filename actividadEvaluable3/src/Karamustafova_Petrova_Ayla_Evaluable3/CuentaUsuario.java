package Karamustafova_Petrova_Ayla_Evaluable3;
//Creación de la clase abstracta CuentaUsuario con sus respectivos atributos
public abstract class CuentaUsuario {
	protected String nombreUsuario;
	protected String email;
	protected String telefono;
	protected int edad;

public CuentaUsuario(String nombreUsuario, String email, String telefono, int edad)
throws TelefonoInvalido, EdadInvalida {
	
	
	
	if (!telefono.matches("^[0-9]{10}$")) {
        throw new TelefonoInvalido("Error: El teléfono debe tener 10 dígitos."); 
    }

   
    if (edad < 16) {
        throw new EdadInvalida("Error: Debes ser mayor de 16 años.");
    }

    this.nombreUsuario = nombreUsuario;
    this.email = email;
    this.telefono = telefono;
    this.edad = edad;
}
	//Creo el método abstracto mostrarInfprmación
	public abstract void mostrarInformacion();
}
