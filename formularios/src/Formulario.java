import java.util.ArrayList;
import java.util.Scanner;


public class Formulario {

	public static void main(String[] args) {
		// Defino variables e introduzco el scanner
		Scanner sc = new Scanner (System.in);
		int opcion;
		//Para poder recoger los datos voy a utilizar los strings
		
		String nombre=null;
		String apellidos=null;
		String dni=null;
		String email=null;
		Boolean esVerdad=false;
		
		//Introducción de ArrayList para guardar los datos
		
		ArrayList<Gestionformulario> datosnuevos = new ArrayList<>();
		
		//Introduzco el bucle do while para que se repita el menú de opciones
		do {
			System.out.println("====MENU DE OPCIONES====");
			System.out.println("1. Rellenar nombre ");
			System.out.println("2. Rellenar apellidos ");
			System.out.println("3. Rellenar DNI ");
			System.out.println("4. Rellenar email ");
			System.out.println("5. Salir ");
			opcion=sc.nextInt();
			sc.nextLine();
			
			//Introduzco el switch para determinar las opciones           
			switch (opcion) {
			case 1: nombre=sc.nextLine();
				break;
			case 2: apellidos=sc.nextLine();
				break;
			case 3: dni=sc.nextLine();
				break;
			case 4: email=sc.nextLine();
				break;
			case 5: 
				//Introduzco condicional para que no se queden datos sin rellenar en el formulario
				
				if (nombre==null||apellidos==null||dni==null||email==null) {
					esVerdad=false;
					System.out.println("Error: faltan datos en el formulario");
				}
				else {
					esVerdad=true;
					System.out.println("Datos guardados con éxito. ¡Hasta pronto!");
				} 
				break;
				default: System.out.println("Has marcado una opcion incorrecta. Elige una opcion");
			}
			
		}while (!esVerdad);

	}

}
