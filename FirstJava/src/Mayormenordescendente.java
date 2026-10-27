import java.util.Scanner;

public class Mayormenordescendente {

	public static void main(String[] args) {
		// Variables
		double num1,num2,num3;
		
		//Petición de datos al usuario
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el primer número");
		num1=sc.nextDouble();
		
		System.out.println("Escribe el segundo número");
		num2=sc.nextDouble();
		
		System.out.println("Escribe el tercer número");
		num3=sc.nextDouble();
		
		//Ejecución con if y else
		
		
		
		if (num1>num2) {
			if (num1>num3) {
				System.out.println("El número "+num1+" es el número mayor.");
			}
			if (num2>num3) {
				System.out.println("El número "+num2+" es el número mediano.");
				System.out.println("El número "+num3+" es el número más pequeño.");
			}
			
			else {
				System.out.println("El número "+num3+" es el número mediano.");
				System.out.println("El número "+num2+" es el número más pequeño.");
				
			}
		}
		else {
			if (num2>num1) {
				if (num2>num3) {
					System.out.println("El número "+num2+" es el número mayor");
				}
				if (num1>num3) {
					System.out.println("El número "+num1+" es el número mediano");
					System.out.println("El número "+num3+" es el número más pequeño");
				}
				else {
					System.out.println("El número "+num3+" es el número mediano");
					System.out.println("El número "+num1+" es el número más pequeño");
					
			}
				if (num3>num2) {
					if (num3>num1) {
						System.out.println("El número "+num3+" es el número mayor");
					}
					if (num2>num1){
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
	}
}

							
			
							
							
		
			
			
			
		
		



