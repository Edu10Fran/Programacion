package ejercicio01;

public class ContadorInstancias {
	private static int contadorInstancias = 0;
	// Constructor
	public ContadorInstancias() {
		++ contadorInstancias;
	}
	// geter que devuelve la instancia actual
	public static int dimeInstanciaActual() {
		return contadorInstancias;
	}
}
