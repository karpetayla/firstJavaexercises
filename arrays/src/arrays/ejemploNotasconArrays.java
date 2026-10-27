package arrays;

import java.util.Scanner;

public class ejemploNotasconArrays {

	public static void main(String[] args) {
		// Variables
				int opcion;
				double nota;
				double arrayNotas[] =new double [3];
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("1. Insertar notas");
				System.out.println("2. Mostrar notas");
				System.out.println("3. Salir");
				opcion=sc.nextInt();
				
				switch (opcion) {
				case 1: System.out.println("Dime la nota");
					nota=sc.nextDouble();
					for (int i=0;i<arrayNotas.length;i++) {
						if (arrayNotas[i]==0.0) {
							arrayNotas[i]=nota;
							//Se pueden utilizar ambas opciones con tal de romper el bucle
							//break;
							i=arrayNotas.length;
						}
					}
					break;
				case 2: for (int i=0;i<arrayNotas.length;i++) {
					System.out.println("La nota de la posición "+i+" es" +arrayNotas[i]);
				}
					break;
				case 3: System.out.println("Hasta pronto");
					break;
					default: System.out.println("Has introducido una opción incorrecta");
				}
				
			}while(opcion!=3);

	}

}
