package karamustafova_Ayla_Actividad_Evaluable2;

public class TabletSamsung extends Altatablet{
	
	//Atributos
	
	private String marca;
	
	//Constructores
	protected TabletSamsung(String marca, String modelo, String sistema, String memoria, String pantalla, int numserie,
			String marca2) {
		super(marca, modelo, sistema, memoria, pantalla, numserie);
		marca = marca2;
	}

	//ToString para mostrar los datos.
	@Override
	public String toString() {
		return "TabletSamsung [numserie=" + numserie + ", marca=" + marca + ", modelo=" + modelo + ", sistema="
				+ sistema + ", memoria=" + memoria + ", pantalla=" + pantalla + ", NUMSERIE=" + NUMSERIE + "]";
	}
	
	

}
