import java.util.Scanner;

public class notaMedia {

	public static void main(String[] args) {
	String nombre;
	double nota1, nota2, nota3, media;
	
	Scanner sc = new Scanner(System.in) ;
	System.out.print("Escribe tu nombre ");
	nombre=sc.nextLine();


	System.out.println("¿Cuál es tu nota del primer trimestre?");
	nota1=sc.nextDouble();
	
	System.out.println("¿Cuál es tu nota del segundo trimestre?");
	nota2=sc.nextDouble();
	
	System.out.println("¿Cuál es tu nota del tercer trimestre?");
	nota3=sc.nextDouble();
	media=(nota1+nota2+nota3)/3;
	
	System.out.println("Bienvenido "+nombre+", tu nota es de " +(nota1+nota2+nota3)/3);
	

	}

}
