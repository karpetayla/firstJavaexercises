package calculadoraII;

import java.util.Scanner;

public class calculadoraConmetodos {

	public static void main(String[] args) {
		/* Debes de crear una calculadora. 
		 * La aplicación mostrará un menú con las operaciones que puede realizar 
		 * (sumar, restar, multiplicar, dividir y resto).
		 * También debe pedir al usuario que introduzca los dos números.
		 * Para la operación de restar debemos de comprobar que reste el número mayor menos el menor,
		 * es decir que si el usuario introduce, por ejemplo, 5 y 7 deberá hacer 7-5,
		 * no puede dar un número negativo. Para la operación división el divisor no podrá ser cero,
		  en dicho caso le mostrará un mensaje diciendo que no se puede hacer la división.*/
		
		//Declaración de variables e incialización del scanner
		
		int opcion;
		double num1=0, num2=0, resultado;
		Scanner sc = new Scanner (System.in);
		do {
			opcion=mostarMenu(sc);
			if (opcion >= 1 && opcion <= 4) {
				System.out.print("Inserta el primer numero: ");
                num1 = sc.nextDouble();
                System.out.print("Inserta el segundo numero: ");
                num2 = sc.nextDouble();
                
			//Introduzco switch para establecer las opciones del menú
                switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 == 0) 
                    {
                        System.out.println("Error: No se puede hacer la división por cero.");
                    } 
                    else 
                    {
                        resultado = dividir(num1, num2);
                        System.out.println("El resultado de la división es: " + resultado);
                    }
                    break;
                case 0:
                	System.out.println("¡Gracias y hasta pronto!");
                	break;
                	default:System.out.println("Has marcado una opcion incorrecta. Elige una opcion");
                	}
			}
		}while(opcion!=0);
		
		
	}
	//Separo para caso por método
	public static int mostarMenu (Scanner sc) {
			System.out.println("===MENU DE OPCIONES===");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("0.- Salir");
			System.out.println("Elige una opcion");
			return sc.nextInt();		
			}
	
		
	//SUMAR
	public static double sumar (double valor1, double valor2) {
		return valor1+valor2;
		
	}
	
	//RESTAR
	public static double restar (double valor1, double valor2) {
		if (valor1>valor2) 
		{
		return valor1-valor2;	
		}
		else {
			return valor2-valor1;
		}
		
	}
	
	//MULTIPLICAR
	public static double multiplicar (double valor1, double valor2) {
		return valor1*valor2;
		
		
	}
	
	//DIVIDIR
	public static double dividir (double valor1, double valor2) {
		return valor1/valor2;
		
	}

}
