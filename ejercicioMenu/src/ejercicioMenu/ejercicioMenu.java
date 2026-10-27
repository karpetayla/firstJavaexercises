package ejercicioMenu;

import java.util.Scanner;

public class ejercicioMenu {

	public static void main(String[] args) {
		// Declaración de variables
		int numero, opcion; 
		double horas;
		final int claseA=25, claseB=20, claseC=15, claseD=10;
		
		//Inicializamos el scanner
		
		Scanner sc =new Scanner (System.in);
		
		//Realiza un programa que permite realizar las siguientes tareas:

		//a.- Dado un número por teclado debe indicar si es par o impar.

		//Introduzco un bucle para formar un menú que elija el usuario cuando salir	
		do {
			System.out.println("==MENÚ DE OPCIONES==");
			System.out.println("1. - Par o impar");
			System.out.println("2. - Calcular sueldo");
			System.out.println("3. - Precio final del producto");
			System.out.println("4. - Salir");
			System.out.println("Indique la opción");
			opcion=sc.nextInt();
			
			//Introducción del switch para insertar el menu con las opciones que nos marca el ejercicio
			switch (opcion) {
			
				case 1: System.out.println("Dime el número final");
					numero=sc.nextInt();
					for (int i=0; i<=numero; i++) {
						if (numero%2==0) System.out.println("Es par");
						else System.out.println("Es impar");
					}
					
				break;
					
			/*b.- Elaborar un programa para calcular el sueldo de un trabajador, 
			*a partir de las horas trabajadas en la semana y la clase a la que pertenece:

			*Trabajadores de clase “A”, se les paga 25 euros por hora.
			*Trabajadores de clase “B”, se paga 20 euros por hora.
			*Trabajadores de clase “C”, se les paga 15 euros por hora y
			*Trabajadores de clase “D”, 10 euros por hora.
			*Ingresar el número de horas trabajadas y la clase a la que pertenece, 
			*y a continuación, devuelve el sueldo del trabajador. Debes de usar constantes para cada clase.*/
					
			//Repito el mismo proceso con el caso 2
					
				case 2: System.out.println("¿Cuantas horas has hecho esta semana");
						horas=sc.nextDouble();
						do { 
							System.out.println("Introduce la clase a la que perteneces");
							System.out.println("1. Clase A");
							System.out.println("2. Clase B");
							System.out.println("3. Clase C");
							System.out.println("4. Clase D");
							System.out.println("5. Volver al menú principal");
							System.out.println("Elige una opción");
							opcion=sc.nextInt();
							
							switch (opcion) {
							case 1:
									System.out.println("Tu sueldo es "+(claseA*horas));
								break;
							case 2: System.out.println("Tu sueldo es: "+(claseB*horas));
								break;
							case 3: System.out.println("Tu sueldo es: "+(claseC*horas));
								break;
							case 4: System.out.println("Tu sueldo es "+(claseD*horas));
								break;
							case 5:
								break;
								default: System.out.println("Has elegido una opción incorrecta. Marca una opción.");
							}
						}while (opcion!=5);
						break;
					
					/*c.- Escribe un programa que calcule el precio final de un producto según su base imponible 
					 * (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y 
					 * el código promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% 
					 * y 4% respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan, 
					 * respectivamente, que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros 
					 * o se descuenta el 5%.  */

					//Repito el mismo proceso con bucle do while y switch para el ejercicio 3
				case 3: 
					//Declaración de variables
						String IVA, Promo;
						int iva=0;
						double base, productoconIVA = 0, productototal = 0;
						
						System.out.println("Introduce la base imponible");
						base=sc.nextDouble();
						
						//Para limpiar el buffer del scanner y borrar datos, utilizo el sc.nextLine.
						sc.nextLine();
						/*He optado por valores booleanos para indicar al programa los unicos valores válidos 
						para esta aplicación*/
						
						boolean ivaValido=false;
						
						do {
							System.out.println("Introduce el IVA (general, reducido, superreducido)");
							IVA=sc.nextLine().toLowerCase();
							//Para convertir mayusculas y minusculas
						
							switch (IVA) {
							case "general": 
								System.out.println(productoconIVA=base+(base*0.21));
								iva=21;
								ivaValido=true;
								break;
							case "reducido": 
								System.out.println(productoconIVA=base+(base*0.10));
								iva=10;
								ivaValido=true;
								break;
							case "superreducido":
								System.out.println(productoconIVA=base+(base*0.04));
								iva=4;
								ivaValido=true;
								break;
								default: System.out.println("Has marcado una opción incorrecta");
							
								
							}
						}while(!ivaValido);
						
						
						System.out.print("Introduce la promocion (noprom, mitad, meno5, 5porc)");
						Promo=sc.nextLine();
						boolean promoValida=false;
						
						do {
							switch (Promo) {
							case "noprom": System.out.println("Sin promoción");
								productototal=productoconIVA;
								promoValida=true;
								break;
							case "mitad": 
								productototal=(productoconIVA/2);
								promoValida=true;
								break;
							case "meno5": 
								productototal=(productoconIVA-5);
								promoValida=true;
								break;
							case "5porc": 
								productototal=productoconIVA-(productoconIVA*0.05);
								promoValida=true;
								break;
								default: System.out.print("Has marcado una opción incorrecta");
								Promo=sc.nextLine().toLowerCase();
							}
						} while (!promoValida);
						//Resultado como factura simplificada
						
		
					System.out.println("===================FACTURA SIMPLIFICADA====================");
					System.out.println("Tipo de IVA aplicado                                  "+ iva);
					System.out.println("Precio con IVA                                        "+ productoconIVA);
					System.out.println("Codigo promocional                                  "+"(" + Promo + ")");
					System.out.println("Tu producto cuesta                                   "+productototal);
					System.out.println("===========================================================");
					
				break;	
				case 4: System.out.println("¡Hasta pronto!");
				break;
				default: System.out.println("Has marcado una opción incorrecta, por favor marca una opción");
		} 
	
	}while (opcion!=4);
}


}
