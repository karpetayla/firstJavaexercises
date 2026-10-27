package ejercicio_persona;

public class Persona {
	
	//Declaracion de variables
	 protected String dni, nombre, sexo;
	 protected int edad;
	 protected double peso, altura;
	 
	 //Generacion de constructores
	 
	 //CONTRUCTOR VACIO POR DEFECTO
	 
	 protected Persona() {
		 }
	 
	 //CONSTRUCTOR CON NOMBRE, EDAD y SEXO
	 
	 protected Persona(String sexo) {
			
			this.sexo = sexo;
			
		 }
	 
	 //UN CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	 protected Persona(String nombre, String sexo, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	 }

	 protected String getDni() {
		 return dni;
	 }

	 protected void setDni(String dni) {
		 this.dni = dni;
	 }

	 protected String getNombre() {
		 return nombre;
	 }

	 protected void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 protected String getSexo() {
		 return sexo;
	 }

	 protected void setSexo(String sexo) {
		 this.sexo = sexo;
	 }

	 protected int getEdad() {
		 return edad;
	 }

	 protected void setEdad(int edad) {
		 this.edad = edad;
	 }

	 protected double getPeso() {
		 return peso;
	 }

	 protected void setPeso(double peso) {
		 this.peso = peso;
	 }

	 protected double getAltura() {
		 return altura;
	 }

	 protected void setAltura(double altura) {
		 this.altura = altura;
	 }
	 
	 //Metodos GETTERS AND SETTERS
	 
	 
	 
}
