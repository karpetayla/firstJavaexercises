package codigoPostal;

import java.util.Scanner;

import codigoPostal.codigoInvalido;

public class codigoPostal {

	public static void main(String[] args) {
		/* Crea tu propia excepción para que capture si el usuario introduce mal el código postal. 
		Recoge el código y comprueba si es correcto o no a través de dicha excepción. 
		Muestra un mensaje en caso de no ser correcto. (3.5 puntos).*/
		
		Scanner sc = new Scanner (System.in);
		
		String cp;
		
		try {
		System.out.println("Inserta tu codigo postal");
		cp=sc.nextLine();
		if (!cp.matches("^[0-9]{5}$")) {
	        throw new codigoInvalido("Error: El código postal debe tener 5 dígitos."); 
	    }
		
		}catch(Exception e) {
			System.out.println(e.getMessage()); 
		}


	}

}
