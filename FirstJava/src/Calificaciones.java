import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		// Declaración de variables
		int num1;
		
		//Ejecución
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Cuál es tu nota?");
		num1=sc.nextInt();
		
		if (num1>=0 && num1<4) {
			System.out.println("INSUFICIENTE");
		}
		else {
			if (num1>=5 && num1<6) {
				System.out.println("SUFICIENTE");
			}
			else {
				if (num1 == 5) {
					System.out.println("SUFICIENTE");
				}
				else {
					if (num1 == 6) {
						System.out.println("BIEN");
					}
					else {
						if (num1>=7 && num1<9) {
							System.out.println("NOTABLE");
						}
						else {
							if (num1 == 9 && num1<10) {
								System.out.println("SOBRESALIENTE");
							}
							else {
								System.out.println("MATRÍCULA DE HONOR");
							}
						}
					}	
					}
		
					
			}
		}
	}
}

