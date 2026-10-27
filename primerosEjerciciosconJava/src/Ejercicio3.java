import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Dado nos números por teclado, que me muestre cuál es el mayor, menor y si
		son iguales*/
		
		
		// Declaración de variables con números enteros
		
		int num1, num2;
		
		//Introduzco el scanner
		Scanner sc =new Scanner (System.in);
		
		//Petición de datos al usuario
		
		System.out.println("Introduce el primer número");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo número");
		num2=sc.nextInt();
		
		//Ejecución del programa con condicionales
		
		if (num2>num1) {
			System.out.println("El número "+num2+" es mayor que el número "+num1);
		}
		else {
			if(num1>num2) {
				System.out.println("El número "+num1+" es mayor que el número "+num2);
			}
			else {
				System.out.println("Ambos números son iguales");
			}
			
		}
		
		

	}

}
