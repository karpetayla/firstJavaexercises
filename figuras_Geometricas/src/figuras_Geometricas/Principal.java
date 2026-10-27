package figuras_Geometricas;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
//Creo el metodo Main con la clase principal
	public static void main(String[] args) {
		
		int opcion;
		Scanner sc = new Scanner (System.in);
		
//Creo un arraylist para guardar mis figuras
		ArrayList <Figura> listaFiguras = new ArrayList <>();
		
		do {
			System.out.println("==MENU DE OPCIONES==");
			System.out.println("1. Calcular area");
			System.out.println("2. Calcular perimetro");
			System.out.println("3. Salir");
			opcion=sc.nextInt();
			sc.nextLine();
			
			switch (opcion) 
			{
			
			//MENU PARA CALCULAR EL AREA
			case 1:
				System.out.println("Elige la figura que quieres calcular");
				System.out.println("1. Circulo");
				System.out.println("2. Rectangulo");
				System.out.println("3. Volver al menu principal");
				int subopcionarea = sc.nextInt();
				sc.nextLine();
				
				//SUBMENU AREA
					switch (subopcionarea) {
						case 1: 
							System.out.println("Introduce el radio");
							double r = sc.nextDouble();
							Figura c = new Circulo(r);
							listaFiguras.add(c);
							System.out.println("El area de tu circulo es: "+c.calcularArea());
							break;
						case 2:
							System.out.println("Inserta la base de tu rectangulo");
							double base = sc.nextDouble();
							System.out.println("Inserta la altura de tu rectangulo");
							double altura = sc.nextDouble()
;							Figura rec = new Rectangulo(base,altura);
							listaFiguras.add(rec);
							System.out.println("El area de tu rectangulo es: "+rec.calcularArea());
							break;
						case 3:
							break;
					}
				break;
				//CALCULAR PERIMETRO
			case 2:
				
				System.out.println("Elige la figura que quieres calcular");
				System.out.println("1. Circulo");
				System.out.println("2. Rectangulo");
				System.out.println("3. Volver al menu principal");
				int subopcionperi = sc.nextInt();
				sc.nextLine();
				
				//SUBMENU PERIMETRO
					switch (subopcionperi) 
					{
						case 1: 
							System.out.println("Introduce el radio");
							double r1 = sc.nextDouble();
							Figura c1 = new Circulo(r1);
							listaFiguras.add(c1);
							System.out.println("El perimetro de tu circulo es: "+c1.calcularPerimetro());
							break;
						case 2:
							System.out.println("Inserta la base de tu rectangulo");
							double base1 = sc.nextDouble();
							System.out.println("Inserta la altura de tu rectangulo");
							double altura1 = sc.nextDouble()
;							Figura rec1 = new Rectangulo(base1,altura1);
							listaFiguras.add(rec1);
							System.out.println("El area de tu rectangulo es: "+rec1.calcularPerimetro());
							break;
						case 3:
							break;
					}
				break;
			//SALIR
			case 3:
				break;
				default: System.out.println("Has elegido una opcion incorrecta. Elige una opcion");
			}

		}while(opcion!=3);
		
	}

}
