package Karamustafova_Petrova_Ayla_Evaluable3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//Creo la clase GestionFicheros
public class GestionFicheros {
	public void leerUsuarios() {
	    File fichero = new File("usuarios.txt"); 
	    //Indico mediante condicional lo que tiene que realizar el programa si el fichero existe o no
	    if (!fichero.exists()) {
	        System.out.println("El fichero no existe todavía.");
	        return;
	    }
	    /*Marco con el control de excepciones el mensaje que tiene que aparecer
	     *  en caso de que no se pueda leer el fichero por formato o que no exista*/
	    try (Scanner reader = new Scanner(fichero)) {
	        System.out.println("--- LISTADO DE USUARIOS DESDE FICHERO ---");
	        while (reader.hasNextLine()) {
	            String linea = reader.nextLine();
	            
	            System.out.println(linea); 
	        }
	    } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (Exception e) { 
            System.out.println("Error inesperado al leer el fichero: " + e.getMessage());
        }
	}
	public void guardarUsuario(CuentaUsuario cuenta) {
         
    }
}
