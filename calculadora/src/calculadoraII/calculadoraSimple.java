package calculadoraII;

import java.util.Scanner;

public class calculadoraSimple {

	public static void main(String[] args) {
		/*Debes de crear una calculadora. La aplicación mostrará un menú con las
		operaciones que puede realizar (sumar, restar, multiplicar, dividir y resto).
		También debe pedir al usuario que introduzca los dos números. Para la operación
		de restar debemos de comprobar que reste el número mayor menos el menor, es
		decir que si el usuario introduce, por ejemplo, 5 y 7 deberá hacer 7-5, no puede
		dar un número negativo. Para la operación división el divisor no podrá ser cero, en
		dicho caso le mostrará un mensaje diciendo que no se puede hacer la división*/
		
		
		/* Declaración de variables con double para utilizar decimales en las operaciones 
		 * e int para la opción*/
		
		double num1, num2;
		int opcion;
		
		Scanner sc = new Scanner (System.in);
		
		//Petición de números al usuario
		
		System.out.println("Inserta el primer número");
		num1=sc.nextDouble();
		System.out.println("Inserta el segundo número");
		num2=sc.nextDouble();
		
		//Inserto bucle para que cada vez que termine una operación, le pregunte al usuario si quiere realizar otra
		
		do {
			System.out.println("==MENÚ DE OPERACIONES==");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Resto");
			System.out.println("6.- Salir");
			
			opcion=sc.nextInt();
			
			//Introduzco el switch para el menú de opciones indicando que operación realizar en cada caso
			
			switch (opcion) {
			case 1:
				System.out.println("La suma es "+(num1+num2));
				break;
			case 2:
				if (num2>num1) {
					System.out.println("La resta es "+(num2-num1));
					}
				else {
					System.out.println("La resta es "+(num1-num2));
				}
				break;
			case 3:
				System.out.println("La multiplicación es "+(num1*num2));
				break;
			case 4:
				if (num2==0) System.out.println("El divisor es cero");
				else System.out.println("La división es "+(num1/num2));
				break;
			case 5:
				if (num2==0) System.out.println("El divisor es cero");
				else System.out.println("El resto es "+(num1%num2));
				break;
			case 6:
				System.out.println("Hasta pronto");
				break;
				
			default: System.out.println("Has introducido una opción incorrecta");
			}
		}
		while (opcion!=6);

	}

}
