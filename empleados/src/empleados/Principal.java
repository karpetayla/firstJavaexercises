package empleados;
import java.util.ArrayList;
import java.util.Scanner;

//Creo mi clase principal
public class Principal {

	public static void main(String[] args) {
		//Declaro mis variables
		String nombre, apellidos, dni;
		double horastrabajadas;
		
		//Inserto el scanner para recoger los datos del usuario
		Scanner sc = new Scanner (System.in);
		//Creo un arraylist donde guardar los datos de mis empleados
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		//Pido los datos al usuario
		System.out.println("Inserta el nombre del empleado");
		nombre=sc.nextLine();
		System.out.println("Inserta los apellidos del empleado");
		apellidos=sc.nextLine();
		System.out.println("Inserta el dni del empleado");
		dni=sc.nextLine();
		//Pregunto al usuario el tipo de empleado
		System.out.println("Seleccione tipo de empleado: 1. Tiempo Completo / 2. Por Horas");
		int empleado = sc.nextInt();
		sc.nextLine();
		
		//Utilizo el condicional para indicar las dos opciones disponibles
		if (empleado == 1) {
		    final double sueldofijo=1400;
		    System.out.print("Tu sueldo es "+sueldofijo);
		    //Añado el empleado al arraylist
		    listaEmpleados.add(new EmpleadoTiempoCompleto(nombre, apellidos, dni, sueldofijo));
		} 
		else {
			//Pido al usuario que me indique el numero de horas y el precio por hora
		    System.out.print("Inserta el precio por hora");
		    double preciohora = sc.nextDouble();
		    System.out.println("Inserta las horas trabajadas");
		    horastrabajadas=sc.nextDouble();
		    //Añado el empleado a mi Arraylist
		    listaEmpleados.add(new EmpleadoPorHoras(nombre, apellidos, dni, horastrabajadas, preciohora));
		    for (Empleado emp : listaEmpleados) {
		        double sueldoFinal = emp.calcularSueldo(); 
		        System.out.println("El sueldo es: " + sueldoFinal);
		    }
		}
		
		


	}

}
