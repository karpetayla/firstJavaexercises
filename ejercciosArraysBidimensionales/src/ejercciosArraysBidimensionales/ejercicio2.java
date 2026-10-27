package ejercciosArraysBidimensionales;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		//Crear una matriz de 5 filas y n columnas (se pide al usuario). 
		//Rellenarlo con números aleatorios entre 0 y 10.
		
		//Introducción del scanner y declaración de variables
		Scanner sc = new Scanner (System.in);
		final int FILAS = 5;
		int COLUMNAS=0;
		//Petición de datos al usuario de las columnas que quiere añadir
		System.out.println("¿Cuántas columnas quieres añadir?");
		COLUMNAS=sc.nextInt();
		//Creación de la matriz
		
		int matriz [][] = new int [FILAS][COLUMNAS];
		//Introducción del bucle para recorrer la matriz
		for (int i=0; i<FILAS;i++) {
			for (int j=0; j<COLUMNAS;j++) {
			int numeros = (int)(Math.random()*11);
			matriz [i][j] = numeros;
			
			//Resultado
			System.out.print("["+matriz[i][j]+"]");;
			}
			//He puesto un salto de línea para que se vea más ordenado
			System.out.print("\n");
		}
	}

}
