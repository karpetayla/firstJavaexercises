package karamustafova_Ayla_Actividad_Evaluable2;

public class Altatablet {
	
	//Atributos
	
	protected String marca, modelo, sistema, memoria,pantalla;
	protected int numserie;
	protected String comprador=null;
	
	
	protected final int NUMSERIE=00000000;
	
	protected Altatablet() {
		numserie=NUMSERIE;
	}
	
	//Introducción de constructores

	protected Altatablet(String marca, String modelo, String sistema, String memoria, String pantalla, int numserie) {
		this.marca = marca;
		this.modelo = modelo;
		this.sistema = sistema;
		this.memoria = memoria;
		this.pantalla = pantalla;
		this.numserie = numserie;
	}

	protected Altatablet(String marca, String modelo, String sistema, String memoria, String pantalla) {
		this.marca = marca;
		this.modelo = modelo;
		this.sistema = sistema;
		this.memoria = memoria;
		this.pantalla = pantalla;
		numserie=NUMSERIE;
	}
	
	//Introducción de getters and setters
	
	protected Altatablet(String comprador) {
		this.comprador = comprador;
	}

	//Getters and setters

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected String getSistema() {
		return sistema;
	}

	protected void setSistema(String sistema) {
		this.sistema = sistema;
	}

	protected String getMemoria() {
		return memoria;
	}

	protected void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	protected String getPantalla() {
		return pantalla;
	}

	protected void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	protected int getNumserie() {
		return numserie;
	}

	protected void setNumserie(int numserie) {
		this.numserie = numserie;
	}

	protected String getComprador() {
		return comprador;
	}

	protected void setComprador(String comprador) {
		this.comprador = comprador;
	}
	
	protected void setComprador(Cliente clienteEncontrado) {
		// TODO Auto-generated method stub
		
	}
	
	//ToString

	@Override
	public String toString() {
		return "Altatablet [marca=" + marca + ", modelo=" + modelo + ", sistema=" + sistema + ", memoria=" + memoria
				+ ", pantalla=" + pantalla + ", numserie=" + numserie + ", NUMSERIE=" + NUMSERIE + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
