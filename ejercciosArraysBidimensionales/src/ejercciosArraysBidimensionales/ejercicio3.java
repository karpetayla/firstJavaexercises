package ejercciosArraysBidimensionales;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		/* Crear dos matrices de n filas x n columnas y sumar sus valores, 
		 * los resultados se deben almacenar en otra matriz.
		 *Los valores y el tamaño no serán insertados por el usuario. 
		 *Mostrar las matrices originales y el resultado.*/
		
		//Declaración de variables
		//Como los datos no se van a pedir al usuario, no utilizo Scanner
		final int COLUMNAS=5;
		final int FILAS=5;
		//Declaración de las tres matrices
		int matriz1 [][] = new int [FILAS][COLUMNAS];
		int matriz2 [][] = new int [FILAS][COLUMNAS];
		int matrizresultado [][]= new int [FILAS][COLUMNAS];
		
		//Matriz 1
		
		System.out.println("=====MATRIZ 1=====");
		
		//Introducción del bucle para recorrer la matriz
		for (int i=0; i<FILAS;i++) {
			for (int j=0; j<COLUMNAS;j++) {
				//Para que la matriz se autocomplete con numeros aleatorios utilizo math.random
				//He decidido que fuesen del 0-10
				int numeros = (int)(Math.random()*11);
				matriz1[i][j]=numeros;
				//Imprimo por pantalla la matriz
				System.out.print("["+matriz1[i][j]+"]");
				
			}
			//Introduzco un salto de línea entre las filas y columnas para que quede más ordenado
			System.out.print("\n");
		}
		
		
		System.out.println("=====MATRIZ 2=====");
		//Introducción del bucle para recorrer la matriz 2
		
		for (int i=0; i<FILAS;i++) {
			for (int j=0; j<COLUMNAS;j++) {
				//Vuelvo a recorrer la matriz con numeros aleatorios como en la matriz1
				int numeros = (int)(Math.random()*11);
				matriz2[i][j]=numeros;
				System.out.print("["+matriz2[i][j]+"]");
				
			}
			System.out.print("\n");
		}
		//Matriz resultado
		System.out.println("===MATRIZ RESULTADO===");
		/*Vuelvo a poner un bucle para poder recorrer la matriz 
		y que se rellenen las casillas con los resultados obtenidos de la suma de ambas matrices*/
		
		for (int i=0; i<FILAS;i++) {
			for (int j=0; j<COLUMNAS;j++) {
				matrizresultado[i][j]=matriz1[i][j]+matriz2[i][j];
				System.out.print("["+matrizresultado[i][j]+"]");
			}
			System.out.print("\n");
		}
			
		

	}

}
