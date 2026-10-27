package simulacro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		ArrayList <Barco>listabarcos = new ArrayList <>();
	
		try {
		    // 1. Asegúrate de que los nombres de las clases empiecen por MAYÚSCULA.
		    // 2. Envía los números sin comillas si el atributo es de tipo int o double.
		    Barco nuevo1 = new barcoPasajeros("4", "Titanic", 100.0, 20, 5);
		    Barco nuevo2 = new barcoPasajeros("5", "Bismark", 200.0, 4, 20);
		    Barco nuevo3 = new barcoCarga("10", "America", 200.0, 4, 20);
		    Barco nuevo4 = new barcoCarga("6", "Bismark", 200.0, 4, 20);
		    
		    Collections.addAll(listabarcos, nuevo1, nuevo2, nuevo3, nuevo4);
		    
		    for(Barco barco : listabarcos) {
		        barco.mostrarInformacion(); 
		    }
		    
		} catch (barcoInvalidoexception e) { 
		    System.out.println(e.getMessage()); 
		}
		




	
	
	}
}
