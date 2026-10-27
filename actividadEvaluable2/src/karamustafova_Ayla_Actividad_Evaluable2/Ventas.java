package karamustafova_Ayla_Actividad_Evaluable2;

public class Ventas {
	
	//Atributos
	
	protected int numventa;
	protected Cliente dni;
	protected Altatablet numserie;
	
	
	//Constructores
	
	protected Ventas(int numventa, Cliente dni, Altatablet numserie) {
		this.numventa = numventa;
		this.dni = dni;
		this.numserie = numserie;
	}

	//Getters and setters

	protected int getNumventa() {
		return numventa;
	}


	protected void setNumventa(int numventa) {
		this.numventa = numventa;
	}


	protected Cliente getDni() {
		return dni;
	}


	protected void setDni(Cliente dni) {
		this.dni = dni;
	}


	protected Altatablet getNumserie() {
		return numserie;
	}


	protected void setNumserie(Altatablet numserie) {
		this.numserie = numserie;
	}

	//ToString
		
	@Override
	public String toString() {
		return "Ventas [numventa=" + numventa + ", dni=" + dni + ", numserie=" + numserie + ", getNumventa()="
				+ getNumventa() + ", getDni()=" + getDni() + ", getNumserie()=" + getNumserie() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
