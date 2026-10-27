import java.util.Scanner;
public class Condicionales {
	
	public static void main(String[] args) {
		// Estructuras con switch
		
		
		//Menús
		//1º: un número entero
		//2º: una cadna de caracteres
		//3º: un carácter
		
		//Declaramos las variables
		int opcion;
		double num1, num2;
		
		//Inicializamos el scanner para pedir datos al usuario por teclado
		
		Scanner sc = new Scanner (System.in);
		
		//Petición de números al usuario
		
		System.out.println("Inserta el primer número");
		num1=sc.nextDouble();
		System.out.println("Inserta el segundo número");
		num2=sc.nextDouble();
		//utilización de bucles con do while
		do {
			System.out.println("==MENÚ OPCIONES ==");
			System.out.println("1. - Sumar");
			System.out.println("2. - Restar");
			System.out.println("3. - Multiplicar");
			System.out.println("4. - Dividir");
			System.out.println("5. - Resto");
			System.out.println("6. - Salir");
			
			opcion=sc.nextInt();
			
		//Insertamos switch 
			switch(opcion) 
			{
			case 1: //Sumar
					System.out.println("La suma es "+(num1+num2));
				break;
			case 2://Resta
					if (num2>num1){
						System.out.println("La resta es "+(num2-num1));
						}
					else{
						System.out.println("La resta es "+(num1-num2));
						}
				break;
			case 3: //Multiplicación
					System.out.println("La multiplicación es "+(num1*num2));
				break;
			case 4: //División
				if (num2==0) System.out.println("El divisor es cero");
				else System.out.println("La división es "+(num1/num2));
				break;
			case 5://Resto
				if (num2==0) System.out.println("El divisor es cero");
				else System.out.println("El resto es "+(num1%num2));
				break;
			case 6: //Salida
				System.out.println("Hasta pronto!");
				break;
			default:System.out.println("Has introducido una opcion incorrecta");
			}
			
		}while(opcion!=6);
	}

}
