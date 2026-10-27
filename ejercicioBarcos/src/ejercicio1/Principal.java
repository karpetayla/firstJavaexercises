package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	
	
	//Creo el metodo Main desde donde ejecuto 
	public static void main(String[] args) {
		
		//Creo el arraylist donde se guardará la lista de Barcos y donde aplicamos el polimorfismo
		
		ArrayList<Barco> = new ArrayList<listaBarcos>;
	
		try {
			//Instancio las clases
			Barco nuevo1 = new BarcoPasajeros("23A", "Titanic", 200, 20, 6);
			Barco nuevo2 = new BarcoPasajeros("25B", "Bismark", 250, 40, 8);
			Barco nuevo3 = new BarcoCarga("32F","Amazon", 150, 20, 7);
			Barco nuevo4 = new BargoCarga("42D", "Barco", 100, 30, 7);
			
			//Guardo los datos de los barcos en el Arraylist
			Collections.addAll(listaBarcos, nuevo1, nuevo2, nuevo3, nuevo4);
			
			
			//Capturo la excepcion
		}catch BarcoInvalidoException e ()
			throws new System.out.println(e.getMessage());

	}

}
