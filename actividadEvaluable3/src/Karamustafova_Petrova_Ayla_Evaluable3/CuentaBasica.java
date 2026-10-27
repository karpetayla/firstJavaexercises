package Karamustafova_Petrova_Ayla_Evaluable3;

/*Creo la clase de CuentaBasica para que hereden con extends de CuentaUsuario
*y funcionen en OperacionesCuenta*/
public class CuentaBasica extends CuentaUsuario implements OperacionesCuenta{
	public CuentaBasica(String nombreUsuario, String email,String telefono, int edad) throws TelefonoInvalido, EdadInvalida {
        super(nombreUsuario, email, telefono, edad);
	}
	
	//A cada cuenta le asigno tareas diferentes
	@Override
	public void actualizarPerfil(String nuevoEmail, String nuevoTelefono) {
		this.email = nuevoEmail;
		this.telefono = nuevoTelefono;
		System.out.println("Cuenta básica actualizada correctamente");
	}

	@Override
	public void publicarMensaje(String mensaje) {
		System.out.println("Publicación estándar: "+mensaje);
		
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Cuenta Básica - Usuario: " + nombreUsuario);
		
	}

}
