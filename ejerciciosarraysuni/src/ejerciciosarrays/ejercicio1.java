package ejerciciosarrays;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		/* 1.- Programa Java que guarda en un array 10 números enteros que se leen por teclado. 
		A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos
		y cuántos ceros.*/
		
		
		//Declaración de variables e incialización del scanner
		Scanner sc = new Scanner (System.in);
		final int COLUMNAS = 10;
		int positivos=0, negativos=0, ceros=0;
		int arrayEnteros[] = new int [COLUMNAS];
		
		//Inserto bucle para recorrer el array con array.length
		
		for (int i=0;i<arrayEnteros.length;i++) {
			System.out.println("Introduce el numero que vas a guardar: ");
			arrayEnteros[i]=sc.nextInt();
		}
		
		for (int i=0;i<arrayEnteros.length;i++) {
			//Introducción de condicionales para contar los numeros positivos, negativos y ceros
			if (arrayEnteros[i]>0) positivos++;
			else if (arrayEnteros[i]<0) negativos++;
			else ceros++;
		}
		System.out.println("Cantidad de números positivos: "+positivos);
		System.out.println("Cantidad de números negativos: "+negativos);
		System.out.println("Cantidad de ceros:				   "+ceros);
	}

}
