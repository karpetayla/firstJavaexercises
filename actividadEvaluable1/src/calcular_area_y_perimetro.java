import java.util.Scanner;

public class calcular_area_y_perimetro {

	public static void main(String[] args) {
		/*Enunciado: Crea una aplicación que permite calcular el área y el perímetro de un círculo, cuadrado,
rectángulo y triángulo. El usuario puede elegir qué figura quiere e introducir los valores
necesarios para que se muestren los resultados. La aplicación termina cuando el usuario lo
indique.*/
		
		
		/* Declaración de variables con double, para numeros con decimales
		 * e int para numeros enteros */
		double r, base, altura, lado1, lado2, lado3;
		int opcion;
		
		//Uso de scanner para pedir datos al usuario
		
		Scanner sc = new Scanner (System.in);
		
		//Pedimos al usuario que elija una figura
		//Uso del bucle do/while para que se repita cada vez que termina un calculo
		
		do {
			
			System.out.println("==ELIGE UNA FIGURA==");
			System.out.println("1. Circulo");
			System.out.println("2. Cuadrado ");
			System.out.println("3. Rectangulo");
			System.out.println("4. Triangulo");
			System.out.println("5. Salir");
			
			opcion=sc.nextInt();
	
		//Introduzco el switch para elaborar el menú de opciones
			
			switch (opcion) {
			
			case 1: 
				System.out.println("¿Que operación quieres realizar?");
				
				/*He elegido preguntarle al usuario si quiere calcular el área o el perímetro,
				 * por eso introduzco otro bucle con do/while y un switch.
				 * Se que no es muy eficaz, pudiendo realizar ambos calculos en uno, pero queria
				 * poner dos bucles en uno*/
				
				
				do {
					System.out.println("1. Calcular el area");
					System.out.println("2. Calcular el perimetro");
					System.out.println("3. Volver al menú principal");
					System.out.println("Elige una opción:");
					opcion=sc.nextInt();
					
					switch (opcion) {
					//Petición de datos al usuario según las opciones
					case 1:
						System.out.println("Introduce el radio de tu círculo");
						r=sc.nextDouble();
						//Introduzco la ecuación dentro de la propia impresión por pantalla con un "+" para encadenar
						System.out.println("El area de tu circulo es "+(Math.PI*Math.pow(r, 2)));
						break;
						//He utilizado la ecuación math.pow para poner en potencia 2 el radio que indique el usuario
					case 2:
						System.out.println("Introduce el radio de tu circulo");
						r=sc.nextDouble();
						System.out.println("El perimetro de tu circulo es "+(2*Math.PI*r));
						break;
						
					case 3: 
						break; 
						default: System.out.println("Opcion incorrecta. Elige una de las tres opciones");
					}
				} while (opcion!=3);
				break;
				
			case 2:
				System.out.println("¿Que operación quieres realizar?");
				do {
					System.out.println("1. Calcular el area");
					System.out.println("2. Calcular el perimetro");
					System.out.println("3. Volver al menú principal");
					System.out.println("Elige una opcion:");
					opcion=sc.nextInt();
					
					switch (opcion) {
					
					case 1:
						System.out.println("¿Cuánto mide uno de los lados de tu cuadrado?");
						lado1=sc.nextDouble();
						/*Realizo el mismo procedimiento que en el círculo, 
						 * dejo entre ()la operación para calcular el area con "+" para encadenar*/
						System.out.println("El área de tu cuadrado es "+(4*lado1));
						break;
					case 2:
						System.out.println("¿Cuánto mide uno de los lados de tu cuadrado?");
						lado1=sc.nextDouble();
						System.out.println("El perímetro de tu cuadrado es "+(Math.pow(lado1, 2)));
						break;
					case 3: 
						break; 
						default: System.out.println("Opción incorrecta. Elige una de las tres opciones");
					}
				}while (opcion!=3);
				break;
			case 3:
				System.out.println("¿Qué operación quieres realizar?");
				do {
					System.out.println("1. Calcular el area");
					System.out.println("2. Calcular el perimetro");
					System.out.println("3. Volver al menú principal");
					System.out.println("Elige una opción:");
					opcion=sc.nextInt();
					
					switch (opcion) {
					
					case 1:
						System.out.println("¿Cuánto mide la base de tu rectangulo?");
						base=sc.nextDouble();
						System.out.println("¿Cuánto mide la altura de tu rectangulo?");
						altura=sc.nextDouble();
						System.out.println("El área de tu rectangulo es "+(base*altura));;
						break;
					case 2:
						System.out.println("¿Cuánto mide la base de tu rectangulo?");
						base=sc.nextDouble();
						System.out.println("¿Cuánto mide la altura de tu rectangulo?");
						altura=sc.nextDouble();
						System.out.println("El perímetro de tu rectángulo es "+((base+altura)*2));
						break;
					case 3: 
						break; 
						default: System.out.println("Opción incorrecta. Elige una de las tres opciones");
					}
				} while (opcion!=3);
				break;
			case 4:
				System.out.println("¿Qué operación quieres realizar?");

				do {
					System.out.println("1. Calcular el area");
					System.out.println("2. Calcular el perimetro");
					System.out.println("3. Volver al menú principal");
					System.out.println("Elige una opción:");
					opcion=sc.nextInt();
					
					switch (opcion) {
					
					case 1:
						System.out.println("Introduce la base de tu triángulo");
						base=sc.nextDouble();
						System.out.println("Introduce la altura de tu triángulo");
						altura=sc.nextDouble();
						System.out.println("El área de tu triángulo es "+((base*altura)/2));
						break;
					case 2:
						System.out.println("Introduce el lado 1 de tu triángulo");
						lado1=sc.nextDouble();
						System.out.println("Introduce el lado 2 de tu triángulo");
						lado2=sc.nextDouble();
						System.out.println("Introduce el lado 3 de tu triángulo");
						lado3=sc.nextDouble();
						System.out.println("El perímetro de tu triángulo es "+(lado1+lado2+lado3));
						
						/*He introducido un condicional para indicarle al usuario el tipo de triángulo
						 * según los lados, es por ello que he utilizado la estructura de if, else if como
						 * en el ejercicio de las calificaciones. */
						
						if (lado1==lado2 && lado2==lado3) {
							System.out.println("Tienes un triángulo equilátero");
						}
						else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
							System.out.println("Tienes un triángulo isósceles");
						}
						else {
							System.out.println("Tienes un triángulo escaleno");
						}
						break;
					case 3: 
						break; 
						default: System.out.println("Opción incorrecta. Elige una opción");
					}
					} while (opcion!=3);
					break;
					
					/*He mantenido casi la misma estructura en los cuatro casos con tres opciones.
					 * De esta manera dejo que el usuario indique la figura que quiere calcular, y además
					 * si quiere calcular el área, el perímetro o volver al menú principal. */
					
			case 5:
				System.out.println("¡Hasta pronto!");
				break;
				default:System.out.println("Has introducido una opción incorrecta.");
				//En caso de que el usuario marque una opcion distinta a 5, le aparecerá este mensaje
			}
			
		}while (opcion!=5);
		/*Esto significa que si el usuario marca un 5, automáticamente se sale del bucle
		 *  y se deja de ejecutar el programa */
	}

}
