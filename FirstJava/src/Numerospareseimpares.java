import java.util.Scanner;

public class Numerospareseimpares {

	public static void main(String[] args) {
		// Declaración de variables
		int num1;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Escribe un número");
		num1=sc.nextInt();
		
		if (num1%2 == 0) {
			System.out.println("El número "+num1+" es par");
		}
		else {
			System.out.println("El número "+num1+" es impar");
		}
		
	}

}
