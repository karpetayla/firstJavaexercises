import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Pedir el nombre y tres notas por teclado al usuario para poder mostrar la
		media. Tenéis que hacer el ejercicio con números enteros y con decimales. Me
		entregáis la versión que queráis.
		El mensaje que debe mostrar tiene que ser: Bienvenido .......: tu nota es......*/
		
		
		// Declaración de variables, utilizo double porque las notas pueden ser con decimales
		String nombre;
		double num1, num2, num3, media;
		
		//Ejecuto el programa con Scanner y le pido los datos al usuario
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cómo te llamas?");
		nombre=sc.nextLine();
				
		System.out.println("¿Cuál es tu nota del primer trimestre?");
		num1=sc.nextDouble();
		System.out.println("¿Cuál es tu nota del segundo trimestre?");
		num2=sc.nextDouble();
		System.out.println("¿Cual es tu nota del tercer trimestre?");
		num3=sc.nextDouble();
		
		//Pongo la operación a realizar para calcular la media
		
		media = ((num1+num2+num3)/3);
		System.out.println("Bienvenido "+nombre+", tu nota es "+media);
		nombre=sc.nextLine();
		media =sc.nextDouble();
		
		/*Otra opción para el resultado sin utilizar la variable media
		System.out.println("Bienvenido "+nombre+", tu nota es de " +(num1+num2+num3)/3);
		*/
		

	}

}
