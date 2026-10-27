package karamustafova_Ayla_Actividad_Evaluable2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	/*Desarrollar una aplicación que me permita gestionar la compra y venta de tablets
	en la tienda.
	Debes de guardar diferentes tipos de tablets y clientes. TÚ decides qué
	propiedades tienen las tablets y cuáles los clientes.
	Debes de tener una o varias arrays para guardar las tables que están disponibles
	para vender y realizar las ventas a los clientes.
	Haz un menú para que el usuario vea las diferentes opciones que puede realizar:
	1.- Dar de alta una tablet. Comprobar que esa tablet no exista.
	2.- Dar de alta un cliente. Comprobar que ese cliente no existe.
	3.- Vender una tablet a un cliente.
	4.- Mostrar tablets disponibles para la venta.
	5.- Mostrar tablets compradas por un cliente en concreto.
	6.- Salir*/

		
		//Declaración de variables e inialización de scanner
	
	Scanner sc = new Scanner (System.in);
	int opcion;
	
	//Introducción de ArrayList para guardar los datos
	
	ArrayList<Altatablet> listatablets = new ArrayList<>();
	ArrayList<Cliente> listaclientes = new ArrayList<>();
	ArrayList<Tabletipad> listatabletsdispo = new ArrayList<>();
	
	//Introducción del bucle do while para crear un menú en el que el usuario elija cuando salir
	do {
		System.out.println("=====MENU DE OPCIONES=====");
		System.out.println("1. Dar de alta una tablet");
		System.out.println("2. Dar de alta un cliente");
		System.out.println("3. Vender una tablet");
		System.out.println("4. Mostrar tablets disponibles para la venta");
		System.out.println("5. Mostrar tablets compradas por un cliente");
		System.out.println("6. Salir");
		opcion=sc.nextInt();
		sc.nextLine();
		
		//Introduzco el switch para aplicar a cada caso una instrucción
		
			switch(opcion) {
			case 1: //Dar de alta una tablet
					 //Creo un objeto del tipo AltaTablet
					System.out.println("Introduce la marca de la tablet"); //ASigno el valor marca al atributo
					String marca = sc.nextLine();
					System.out.println("Introduce el modelo");
					String modelo = sc.nextLine();
					System.out.println("Introduce el sistema de la tablet");
					String sistema = sc.nextLine();
					System.out.println("Introduce la capacidad de memoria");
					String memoria = sc.nextLine();
					System.out.println("Introduce las pulgadas de pantalla");
					String pantalla = sc.nextLine();
					System.out.println("Introduce el numero de serie");
					int numserie=sc.nextInt();
					sc.nextLine();
					Altatablet at = new Altatablet(marca, modelo,sistema, memoria, pantalla, numserie);
					listatablets.add(at);
					System.out.println(at.toString());
				break;
			case 2: //Dar de alta un cliente
					System.out.println("Introduce nombre"); //Asigno el valor nombre al atributo
					String nombre = sc.nextLine();
					System.out.println("Introduce los apellidos");
					String apellidos = sc.nextLine();
					System.out.println("Introduce el DNI");
					String dni = sc.nextLine();
					System.out.println("Introduce el movil");
					int movil = sc.nextInt();
					sc.nextLine();
					Cliente c = new Cliente(nombre, apellidos, dni, movil); //Creo un objeto del tipo Cliente
					System.out.println(c.toString());
					listaclientes.add(c);
					
				break;
			case 3: //Vender una tablet
					System.out.println("Introduce el DNI del cliente:");
					dni = sc.nextLine();
					System.out.println("Introduce el numero de serie de la tablet:");
					int numventa=sc.nextInt();
					//No he conseguido realizar este apartado porque no sabía como vincular una tablet con un cliente.
					
				break;
			case 4: //Mostrar tablets disponibles para la venta
					System.out.println("Indica la marca de la tablet");
					marca=sc.nextLine();
					sc.nextLine();
					for (Tabletipad t1 : listatabletsdispo) {
						if(t1.getMarca()==marca) {
							System.out.println("La tablet está disponible");
						}
						else {
							System.out.println("La tablet no está disponible");
						}
					}
	
				break;
			case 5: // Mostrar tablets compradas por un cliente
					System.out.println("Indica el DNI del cliente");
					dni=sc.nextLine();
					for (Cliente c1 : listaclientes) {
						if(c1.getDni().equalsIgnoreCase(dni)){
							System.out.println("Se ha registrado una tablet");
							}
						if (c1.getDni()!=null) {
							System.out.println("No se han encontrado tablets registradas");
							}
					}
					
				break;
			case 6: //Salir
					System.out.println("Saliendo del programa...");
				break;
				default: System.out.println("Has marcado una opcion no valida. Por favor, marca una opción");
			}
		
		
	}while (opcion!=6);


	}
}
