package ejerciciosMetodos;

import java.util.Scanner;

public class primerosEjercicios {

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		String dni [] = {"123", "456"};//Paso por referencia, cuando hacemos un paso de objeto o array
		mostrarDni(dni);
		System.out.println(dni[0]);
		
		opcion = mostrarMenu(sc);
		
		//Con sc en mostrarMenu se pasa el scanner
		//Al método se le pueden pasar atributo, arrays u objetos.
		
		/*mostrarMensaje();
		System.out.println("Mensaje del método main");
	}
	
	public static void mostrarMensaje() {
		System.out.println("Bienvenido al método del mensaje");*/
		int num1=6, num2=8, resultado;
		
		resultado = sumar (num1, num2); //Paso por valor
		System.out.println("El resultado es: "+resultado);
		resultado = restar (num1,num2);
		resultado = multiplicar (num1,num2);
		resultado = dividir (num1,num2);
		
	}
	
	public static int mostrarMenu(Scanner sc) {
		
		System.out.println("== MENU DE OPCIONES ==");
		System.out.println("1. - Sumar");
		System.out.println("2. - Restar");
		System.out.println("3. - Multiplicar");
		int opcion = sc.nextInt();
		return opcion;
	}
	
	public static void mostrarDni(String listaDni[]) {
		listaDni[0]="987";
		
	}
	
	public static void menuOpciones(int opcion) {
		switch(opcion) {
		case 1: sumar(num1, num2);
			break;
		case 2: restar(num1, num2);
			break;
		}
	}
	
	
	public static int sumar (int valor1, int valor2) {
		//System.out.println("La suma es: "+(valor1+valor2));
		int resultado = valor1+valor2;
		//System.out.println("La suma es: "+resultado);
		return resultado;
		
	}
	
	public static int restar (int valor1, int valor2) {
		//System.out.println("La resta es: "+(valor1+valor2));
		int resultado = valor1-valor2;
		//System.out.println("La resta es: "+resultado);
		return resultado;
		
	}
	
	public static int multiplicar (int valor1, int valor2) {
		//System.out.println("La multiplicación es: "+(valor1+valor2));
		int resultado = valor1*valor2;
		//System.out.println("La multiplicación es: "+resultado);
		return resultado;
		
	}
	
	public static int dividir (int valor1, int valor2) {
		//System.out.println("La división es: "+(valor1+valor2));
		int resultado = valor1/valor2;
		//System.out.println("La división es: "+resultado);
		return resultado;
		
	}
}
