package ejercicio03;

public class ConvertidorUnidades {
	// Para practicar constantes con static
	private static final double FACTOR_DE_CONVERSION_FAHRENHEIT = 1.8;
	private static final int AJUSTE_FAHRENHEIT = 32;
	private static final double FACTOR_DE_CONVERSION_MILLAS = 0.621371;
	// Constructor
	public ConvertidorUnidades() {}
	// Método para convertir de Kilometros a Millas
	public static double convertirKilometrosAMillas(double kilometros) {
		return kilometros * FACTOR_DE_CONVERSION_MILLAS;
	}
	// Método para convertir de Celsius a Fahrenheit
	public static double convertirCelsius_a_Fahrenheit(double temperaturaCelsius) {
		return (temperaturaCelsius * FACTOR_DE_CONVERSION_FAHRENHEIT) + AJUSTE_FAHRENHEIT;
	}
}
