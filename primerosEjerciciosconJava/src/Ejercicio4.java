import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaración de variables con números enteros
		int num1, num2, num3;
		
		//Introduzco los condicionales y le pido los datos al usuario
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta el primer número");
		num1=sc.nextInt();
		System.out.println("Inserta el segundo número");
		num2=sc.nextInt();
		System.out.println("Inserta el tercer número");
		num3=sc.nextInt();
		
		/*Expongo la primera condicional de si el num1 es el mayor, el num2 el mediano 
		y el num3 el más pequeño.*/
		
		if (num1>num2) {
			if(num1>num3) {
				System.out.println("El número "+num1+" es el número mayor");
			}
				if (num2>num3) {
					System.out.println("El número "+num2+" es el número mediano");
					System.out.println("El número "+num3+" es el número más pequeño");
				}
				/*Aquí expongo si la condicional no se cumpliera y es el num3 el mediano 
				 * y el num2 el más pequeño.*/
				else {
					System.out.println("El número "+num3+" es el número mediano");
					System.out.println("El número "+num2+" es el número más pequeño");
				}
			
		}
		
		/*Expongo con condicionales el resto de los casos cuando el num2 es el mayor, 
		el num1 el mediano y el num3, el más pequeño*/
		if (num2>num1) {
			if(num2>num3) {
				System.out.println("El número "+num2+" es el número mayor");
			}
				if (num1>num3) {
					System.out.println("El número "+num1+" es el número mediano");
					System.out.println("El número "+num3+" es el número más pequeño");
				}
				else {
					System.out.println("El número "+num3+" es el número mediano");
					System.out.println("El número "+num2+" es el número más pequeño");
				}
			}
		
		/*Y por último, el caso en el que el num3 es el número mayor, el num2 el mediano
		 * y el num1 el más pequeño*/

		if (num3>num2) {
			if(num3>num1) {
				System.out.println("El número "+num3+" es el número mayor");
			}
				if (num2>num1) {
					System.out.println("El número "+num2+" es el número mediano");
					System.out.println("El número "+num1+" es el número más pequeño");
				}
				else {
					System.out.println("El número "+num1+" es el número mediano");
					System.out.println("El número "+num2+" es el número más pequeño");
				}
			}
		
		
		
		
		
		

	}

}
