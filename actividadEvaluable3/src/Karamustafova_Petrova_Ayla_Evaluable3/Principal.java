package Karamustafova_Petrova_Ayla_Evaluable3;

public class Principal {
	/*Desarrollar una aplicación que me permita administrar cuentas de usuario en una
	red social.
	El programa debe utilizar:
	• Clases y métodos abstractos: La clase abstracta se llama CuentaUsuario,
	la cual contendrá:
		o Los atributos nombreUsuario, email, teléfono y edad.
		o El método abstracto se llamará mostrarInformación.
		•	 Interfaces: La interfaz se llamará OperacionesCuenta y contendrá dos métodos:
		o El primero se llama actualizarPerfil, el cual recibe el nuevo email y
		teléfono como parámetros
		o El segundo método publicarMensaje, que recibe el mensaje como parámetro.
	• Polimorfismo: Tienes que crear dos clases
		o CuentaBasica y CuentaPremium, que hereden de CuentaUsuario.
			Ambas clases deben implementar los métodos con comportamientos diferentes, TÚ DECIDES.
	• Control de excepciones: Debes de implementar dos excepciones que deben de saltar a la hora de crear las cuentas:
		o TelefonoInvalido: si no tiene 10 dígitos.
		o EdadInvalida: si es menor de 16 años.
	• Ficheros: Crea una clase para manejar el/los archivo/s, donde las tareas a realizar son:
		o Guardar información de los usuarios.
		o Leer y mostrar la información de los usuarios
	Implementa la clase principal para poder trabajar con todos estos requisitos.*/
	
	//Creación del método main y gestión como clase principal

	public static void main(String[] args) {
		
		//Instancio la clase de gestion
		
		GestionarCuenta gestion = new GestionarCuenta();
        
			
		        GestionarCuenta miSistema = new GestionarCuenta();
		        
		     //Llamo al método para que se ejecute el menú
		        miSistema.ejecutarMenu();
		    
		
    }

	}


