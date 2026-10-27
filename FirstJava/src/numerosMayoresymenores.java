import java.util.Scanner;

public class numerosMayoresymenores {

	public static void main(String[] args) {
		// Variables
		double num1,num2;
		
		//Petición de datos al usuario
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el primer número ");
		num1=sc.nextDouble();
		
		System.out.println("Escribe el segundo número");
		num2=sc.nextDouble();
		
		//Ejecución
		
		if (num1>num2) {
			System.out.println("El número "+num1+" es mayor que el número"+num2);
		}
		else {
			if (num2>num1) {
				System.out.println("El número "+num2+" es mayor que el número"+num1);
			}
			else {
				System.out.println("Los dos números son iguales");
			}
		

		}
		

		

	}

}
