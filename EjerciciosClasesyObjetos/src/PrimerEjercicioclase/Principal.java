package PrimerEjercicioclase;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Coches c = new Coches ("assas", "374jdj", "Ayla","6483929");
		int opcion;
		Scanner sc = new Scanner (System.in);
		String bastidor, modelo, matricula, marca;
		//Va ha contener objetos, hay que poner el nombre de la clase que va a contener
		ArrayList <Coches> listaCoches = new ArrayList<>();
		
		do {
			System.out.println("1. Dar de alta un coche");
			System.out.println("2. Dar de alta una persona");
			System.out.println("3. Realizar una venta");
			System.out.println("0. Salir");
			opcion = sc.nextInt();
			
			switch (opcion){
			
			case 1: System.out.println("Dime el bastidor");
					bastidor = sc.nextLine();
					System.out.println("Dime la matricula");
					matricula = sc.nextLine();
					System.out.println("Dime el modelo");
					modelo = sc.nextLine();
					System.out.println("Dime la marca");
					marca = sc.nextLine();
					Coches c = new Coches(bastidor, matricula, modelo, marca);
					//Para añadir una posicion más;
					listaCoches.add(c);
					//Solo hay que acceder a la posicion
				break;
			}
			
		} while (opcion!=0);
		
		
		

	}

}
