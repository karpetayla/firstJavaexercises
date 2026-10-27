package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import biblioteca.Librosnuevos;

public class Principal {

	public static void main(String[] args) {
		/*Realiza una aplicación para la gestión de la biblioteca de la Universidad Europea.

		En la biblioteca se tienen libros que se pueden alquilar durante un determinado tiempo por parte de los clientes.

		La aplicación debe ofrecer un menú al empleado para poder realizar las siguientes tareas:

		1.- Insertar.

		2.- Eliminar.

		3.- Modificar.

		4.- Alquilar.

		5.- Devolver.

		6.- Salir.

		Todos aquellos datos que no facilita, el enunciado, debéis decidirlos vosotras/os.*/
		
		Scanner sc = new Scanner (System.in);
		int opcion;
		ArrayList <Librosnuevos> listanuevos = new ArrayList<>();
		ArrayList <Alumnos>listalumnos = new ArrayList<>();
		
		
		do {
			System.out.println("=====MENU DE OPCIONES=====");
			System.out.println("1. Insertar un nuevo libro");
			System.out.println("2. Eliminar un libro");
			System.out.println("3. Modificar un libro");
			System.out.println("4. Alquilar un libro");
			System.out.println("5. Devolver un libro");
			System.out.println("6. Salir");
			opcion=sc.nextInt();
			sc.nextLine();
			
			switch(opcion) {
			case 1: //INSERTAR
					System.out.println("Introduce el título del libro");
					String titulo = sc.nextLine();
					System.out.println("Introduce el ISBN");
					String isbn = sc.nextLine();
					System.out.println("Introduce el autor");
					String autor = sc.nextLine();
					System.out.println("Introduce la editorial");
					String editorial = sc.nextLine();
					sc.nextLine();
					Librosnuevos ln = new Librosnuevos (titulo,isbn,autor,editorial);
					listanuevos.add(ln);
					System.out.println(ln.toString());
					break;
			case 2: //ELIMINAR
					System.out.print("Introduce el ISBN del libro: ");
					String isbnEliminar = sc.nextLine();
					//Introducción de booleanos para buscar los libros por isbn
					boolean encontradoEliminar = false;
					for (int i = 0; i < listanuevos.size(); i++) {
						if (listanuevos.get(i).getIsbn().equalsIgnoreCase(isbnEliminar)) {
							listanuevos.remove(i); 
							encontradoEliminar = true;
                        System.out.println("Libro eliminado correctamente.");
                        break; 
						}
					}
						if (!encontradoEliminar) System.out.println("No se encontró ningún libro con ese ISBN.");
					break;
			case 3: //MODIFICAR
					System.out.print("Introduce el ISBN del libro a modificar: ");
					String isbnModificar = sc.nextLine();
						for (Librosnuevos libro : listanuevos) {
							if (libro.getIsbn().equalsIgnoreCase(isbnModificar)) {
                        System.out.print("Nuevo Título (actual: " + libro.getTitulo() + "): ");
                        libro.setTitulo(sc.nextLine()); 
                        System.out.print("Nuevo Autor: ");
                        libro.setAutor(sc.nextLine());
                        System.out.println("Datos actualizados.");
							}
						}
				
					break;
			case 4: //ALQUILAR
					System.out.print("Introduce el ISBN del libro que deseas alquilar: ");
					String isbnAlquilar = sc.nextLine();
					for (Librosnuevos libro : listanuevos) {
						if (libro.getIsbn().equalsIgnoreCase(isbnAlquilar)) {
							if (!libro.isAlquilado()) {
							//Introducimos los datos de los alumnos para alquilar un libro
							System.out.println("Introduce el nombre del alumno");
							String nombre = sc.nextLine();
							System.out.println("Introduce los apellidos del alumno");
							String apellidos = sc.nextLine();
							System.out.println("Introduce el DNI del alumno");
							String dni = sc.nextLine();
							System.out.println("Introduce el email del alumno");
							String email = sc.nextLine();
							System.out.println("Introduce el numero de expediente");
							int numexpediente = sc.nextInt();
							sc.nextLine();
							Alumnos a = new Alumnos (nombre, apellidos, dni, email, numexpediente);
							listalumnos.add(a);
							//Introducción de booleano para ver si el libro está alquilado
							libro.setAlquilado(true);
							System.out.println("Alquiler registrado a nombre de " + nombre);
							System.out.println(a.toString());
							}
						}
					}
				break;
			case 5: //DEVOLVER
					System.out.print("Introduce el ISBN del libro a devolver: ");
					String isbnDevolver = sc.nextLine();
						for (Librosnuevos libro : listanuevos) {
							if (libro.getIsbn().equalsIgnoreCase(isbnDevolver)) {
								libro.setAlquilado(false); // Vuelve a estar disponible
								System.out.println("Devolución completada.");
							}
						}
			}
		}while (opcion!=6);

	}
	

}
