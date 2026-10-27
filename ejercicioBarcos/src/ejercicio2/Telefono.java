package ejercicio2;

import java.util.Scanner;

public class Telefono {

	public static void main(String[] args) {
		
		//Declaro mis variables con numero intero
		int telefono;
		
		//Inserto el scanner para recoger los datos del usuario
		Scanner sc = new Scanner (System.in);
		//Inseto bloque de try catch para capturar la excepcion
		try {
			System.out.println("Inserta tu telefono");
			
			telefono = Integer.parseInt(sc.nextLine());
			
			if(!telefono.matches("^[0-9]{9}$")) {
				System.out.println("Error. Has introducido mal el telefono");
			}
			
			//Llamo a la clase creada de TelefonoInvalido
		}catch TelefonoInvalido e()
		throws new System.out.println(e.getMessage());
			
		
		

	}

}
