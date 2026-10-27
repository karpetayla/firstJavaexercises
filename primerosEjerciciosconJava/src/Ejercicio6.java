import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Declaración de variables con números decimales 
		
		double nota;
		
		//Introduzco el condicional
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Inserta tu nota");
		nota=sc.nextDouble();
		
		//Estructura I
		
		
		/*if (nota>=0 && nota<5) {
			System.out.println("INSUFICIENTE");
		}
		else {
			if (nota>=5 && nota<6) {
				System.out.println("SUFICIENTE");
			}
			else {
				if (nota>=6 && nota<7) {
					System.out.println("BIEN");
				}
				else {
					if (nota>=7 && nota<9) {
						System.out.println("NOTABLE");
					}
					else {
						if (nota>=9 && nota<10) {
							System.out.println("SOBRESALIENTE");
						}
						else {
							if (nota==10) {
								System.out.println("MATRÍCULA DE HONOR");
							}
							else {
								System.out.println("Has introducido un número incorrecto");
							}
						}
					}
				}
			}
		}*/
		
		//Estructura II con condicionales
		
		if (nota>=0 && nota<5) {
			System.out.println("INSUFICIENTE");
		}
		else if (nota>=5 && nota<6) {
			System.out.println("SUFICIENTE");
		}
		else if (nota>=6 && nota<7) {
			System.out.println("BIEN");
		}
		else if (nota>=7 && nota<9) {
			System.out.println("NOTABLE");
		}
		else if (nota>=9 && nota<10) {
			System.out.println("SOBRESALIENTE");
		}
		else if (nota==10) {
			System.out.println("MATRÍCULA DE HONOR");
		}
		else {
			System.out.println("Has introducido un número incorrecto");
		}
			
	}

}
	
	
