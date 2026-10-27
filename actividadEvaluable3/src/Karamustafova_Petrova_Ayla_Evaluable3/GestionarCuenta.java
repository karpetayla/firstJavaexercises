package Karamustafova_Petrova_Ayla_Evaluable3;
	import java.util.ArrayList;
	import java.util.Scanner;
//Creo la clase GestionCuenta en la que se mostrará el menú de opciones al usuario para gestionar sus redes sociales
	public class GestionarCuenta {
	    //Creo un ArrayList para guardar a mi fichero las cuentas de usuario nuevas que se creen
	    private ArrayList<CuentaUsuario> listaCuentas = new ArrayList<>();
	    //Introduzco Scanner para recoger los datos del usuario
	    private Scanner sc = new Scanner(System.in);
	    private GestionFicheros ficherocuentas = new GestionFicheros();

	  
	    public void ejecutarMenu() {
	        int opcion = 0;
	        //Introduzco bucle con do while para que sea el usuario quien elija salir del programa
	        do {
	            System.out.println("====MENU DE OPERACIONES====");
	            System.out.println("1. Dar de alta cuenta");
	            System.out.println("2. Mostrar todas las cuentas");
	            System.out.println("3. Guardar en fichero");
	            System.out.println("4. Leer desde fichero");
	            System.out.println("5. Salir");
	            System.out.print("Elige una opción: ");
	            //Implemento el control de excepciones con try catch y separo las excepciones de EdadInvalidad y TelefonoInvalido en 2 clases
	            try {
	                opcion = sc.nextInt();
	                sc.nextLine(); 
	                //Introduzco el switch, para cada caso he utilizado métodos
	                switch (opcion) {
	                    case 1: darAlta(); 
	                    break;
	                    case 2: mostrarCuentas(); 
	                    break;
	                    case 3: guardarDatos(); 
	                    break;
	                    case 4: ficherocuentas.leerUsuarios(); 
	                    break;
	                    case 5: System.out.println("¡Hasta pronto!"); 
	                    break;
	                    default: System.out.println("Opción no válida.");
	                }
	            } catch (Exception e) {
	                System.out.println("Error: Introduce un número válido.");
	                sc.nextLine(); 
	            }
	        } while (opcion != 5);
	    }

	    private void darAlta() {
	        try {
	            System.out.print("Nombre de usuario: ");
	            String nombre = sc.nextLine();
	            System.out.print("Email: ");
	            String email = sc.nextLine()
;	            System.out.print("Edad (Mínimo 16): ");
				//He parseado la variable de edad porque a partir del décimo dígito me saltaba un error
	            int edad = Integer.parseInt(sc.nextLine());
	            System.out.println("Introduce tu telefono (min 10 digitos)");
	            String tel = sc.nextLine().trim();
	           

	            System.out.println("¿Tipo de cuenta? (1. Básica / 2. Premium): ");
	            int tipo = sc.nextInt();
	            sc.nextLine();

	            CuentaUsuario nueva;
	            if (tipo == 2) {
	                nueva = new CuentaPremium(nombre, email, tel, edad);
	            } else {
	                nueva = new CuentaBasica(nombre, email, tel, edad);
	            }

	            listaCuentas.add(nueva); 
	            System.out.println("Bienvenid@. Tu cuenta ha sido creada con éxito.");

	        } catch (Exception e) {
	            System.out.println(e.getMessage()); 
}
	    }

	   
	    private void mostrarCuentas() {
	        if (listaCuentas.isEmpty()) {
	            System.out.println("No hay cuentas registradas en memoria.");
	        } else {
	            for (CuentaUsuario c : listaCuentas) {
	                c.mostrarInformacion(); 
	            }
	        }
	    }

	    
	    private void guardarDatos() {
	        for (CuentaUsuario c : listaCuentas) {
	            ficherocuentas.guardarUsuario(c); 
	        }
	    }
	}

