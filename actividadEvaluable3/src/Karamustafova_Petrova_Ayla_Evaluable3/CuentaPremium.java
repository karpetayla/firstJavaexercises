package Karamustafova_Petrova_Ayla_Evaluable3;


/*Creo la clase de CuentaPremium para que hereden con extends de CuentaUsuario
*y funcionen en OperacionesCuenta*/
public class CuentaPremium extends CuentaUsuario implements OperacionesCuenta {


	public CuentaPremium(String nombreUsuario, String email, String telefono, int edad)
			throws TelefonoInvalido, EdadInvalida {
		super(nombreUsuario, email, telefono, edad);
		// TODO Auto-generated constructor stub
	}
	//A cada cuenta le asigno tareas diferentes

	@Override
	public void actualizarPerfil(String nuevoEmail, String nuevoTelefono) {
		this.email = nuevoEmail;
		this.telefono = nuevoTelefono;
		System.out.println("Perfil premium actualizado correctamente.");
		
	}

	@Override
	public void publicarMensaje(String mensaje) {
		System.out.println("Publicación premium: "+mensaje);
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Cuenta Premium - Usuario: " + nombreUsuario);
		
	}

}
