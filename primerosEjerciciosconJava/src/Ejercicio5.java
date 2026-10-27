import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaración de variables con números enteros
		int num;

		
		Scanner sc = new Scanner(System.in);
		
		//Petición de datos al usuario
		
		System.out.println("Inserta un número");
		num=sc.nextInt();
		
		/*Utilizo el condicional para que al ejecutar el programa, el programa sepa que si un número que partido de 2,
		el resto es 0, el número es par, y si la condicional no se cumple, se trata de un número impar.*/
		
		if (num%2==0) {
			System.out.println("Este número es par");
		}
		else {
			System.out.println("Este número es impar");
		}
	}

}
