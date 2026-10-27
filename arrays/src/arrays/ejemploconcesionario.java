package arrays;

import java.util.Scanner;

public class ejemploconcesionario {

	public static void main(String[] args) {
		/*La aplicación debe ofrecer un menú al usuario para poder realizar las siguientes tareas:

			1.- Insertar vehículo.

			2.- Eliminar el vehículo y dejar dicho hueco vacío.

			3.- Modificar vehículo.

			4.- Salir.

			El ejercicio debe de controlar que no se repiten matrículas dentro del array.

			Una vez terminado el ejercicio podemos añadir funcionalidades. 
			Por ejemplo realizar la venta de un  vehículo a un cliente con su DNI, 
			mostrar vehículos para la venta disponibles, mostrar los vehículos vendidos, 
			mostrar los vehículos de un cliente en concreto*/
		
		//Variables
		int opcion;
		final int FILAS = 100;
		final int COLUMNAS = 5;
		
		Scanner sc = new Scanner (System.in);
		String vehiculos [][] = new String [FILAS][COLUMNAS];
		
		do {
			System.out.println("== MENU DE OPCIONES ==");
			System.out.println("1. INSERTAR VEHICULO");
			System.out.println("2. ELIMINAR VEHICULO");
			System.out.println("3. MODIFICAR VEHICULO");
			System.out.println("4. SALIR");
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1: for (int i=0; i<vehiculos.length;i++) {
						if(vehiculos[i][0]==null)
							System.out.println("Dime el bastidor ");
							vehiculos[i][0]=sc.nextLine();
							System.out.println("Dime la marca ");
							vehiculos[i][1]=sc.nextLine();
							System.out.println("Dime el modelo ");
							vehiculos[i][2]=sc.nextLine();
							System.out.println("Dime el precio ");
							vehiculos[i][3]=sc.nextLine();
							System.out.println("Dime el DNI ");
							vehiculos[i][4]=sc.nextLine();
							break;
							
			}
				break;
			case 2: System.out.println("Dime el bastidor");
						String bastidor=sc.nextLine();
						for (int i=0;i<vehiculos.length;i++) {
							if (vehiculos[i][0]!=null && vehiculos[i][0].equalsIgnoreCase(bastidor)) {
								vehiculos[i][0]=null;
								
							}
						}
				break;
			case 3:
				break;
			case 4: System.out.println("Hasta pronto");
				break;
				default: System.out.println("Has introducido una opción incorrecta");
			}
			
		}while(opcion!=4);
				

	}

}
