package ejercciosArraysBidimensionales;

public class ejercicio1 {

	public static void main(String[] args) {
		// Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla en forma de matriz.
		
		//Declaración de la matriz
		int matriz [][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("====CONTENIDO DE LA MATRIZ====");
		
		//Introducción del bucle para recorrer la matriz
		for (int fila=0; fila<matriz.length; fila++) {
			for (int columna=0; columna<matriz[fila].length;columna++) {
				//Imprimo por pantalla la matriz
				System.out.print("["+matriz[fila][columna]+"]");
			}
			System.out.print("\n");
		}
		
		
		

	}

}
