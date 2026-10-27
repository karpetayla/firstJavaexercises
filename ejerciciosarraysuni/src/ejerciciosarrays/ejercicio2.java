package ejerciciosarrays;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		/*2.- Programa Java para leer la altura de N personas y calcular la altura media. 
		 * Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media. 
		 * El valor de N se pide por teclado y debe ser entero positivo.*/
		
		// Declaracion de variables
		
		
		int personas=0, altos=0, bajos=0, media=0, htotal=0;
		int arrayAlturas[];
		
		Scanner sc = new Scanner (System.in);
		while (personas<=0) {
			System.out.println("Dime el número de personas");
			personas=sc.nextInt();
			if (personas<0) System.out.println("Valor incorrecto");
		}
		//Bucle para recorrer el array Alturas
		arrayAlturas = new int [personas];
		for (int i=0;i<arrayAlturas.length;i++) {
			System.out.println("Introduce la altura en centimetros: ");
			arrayAlturas[i]=sc.nextInt();
		}
		//Bucle para calcular la media
		for (int i=0;i<arrayAlturas.length;i++) {
			htotal+=arrayAlturas[i];
		}
		media=htotal/personas;
		//Bucle para calcular las personas que superan la altura media y los que no
		
		for (int i=0;i<arrayAlturas.length;i++) {
			if (arrayAlturas[i]>media) altos++;
			else bajos++;
		}
		System.out.println("La altura media es de "+media);
		System.out.println("Personas que superan la altura media: "+altos);
		System.out.println("Personas que no superan la altura media: "+bajos);
	}

}
