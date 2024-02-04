package ejercicio02;

public class ConversorTemperatura {
	private final double FACTOR_DE_CONVERSION = 1.8;
	private final int AJUSTE = 32;
	private String tipoAnterior;
	private int temperaturaAnterior;
	private String tipo;
	private int temperaturaFinal;
	// Constructor 
	public ConversorTemperatura(int temperatura, String tipo) {
		establecerAtributos(temperatura, tipo);
	}
	// getter 
	public String dimeTemperatura() {
		return this.temperaturaAnterior + " " + this.tipoAnterior + " equivale a " + this.temperaturaFinal + " " + this.tipo;
	}
	// setter
	public void establecerAtributos(int temperatura, String tipo) {
		if (tipo.equalsIgnoreCase("Celsius")) {
			this.tipoAnterior = "Celsius";
			this.temperaturaAnterior = temperatura;
			this.tipo = "Fahrenheit";
			this.temperaturaFinal = (int)(temperatura*FACTOR_DE_CONVERSION + AJUSTE);
		}else {
			this.tipoAnterior = "Fahrenheit";
			this.temperaturaAnterior = temperatura;
			this.tipo = "Celsius";
			this.temperaturaFinal = (int)((temperatura - AJUSTE) / FACTOR_DE_CONVERSION);
		}
	}
}
