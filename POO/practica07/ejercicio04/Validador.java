package ejercicio04;
public class Validador {
	// Para validar si un string es un número
	public static boolean isNumber(String valor) {
		if (valor == null || valor.isEmpty()) {
			return false;
		}
		String numeros = "-0123456789";
		for (char elem : valor.toCharArray()) {
			if (numeros.indexOf(elem) == -1) {
				return false;
			}
		}
		return valor.lastIndexOf('-') <= 0;
	}
	// Para comprobar si está en un rango dado
	public static boolean isInRange(int valor, int inferior, int superior) {
		boolean resultado = false;
		if (inferior <= valor && valor <= superior) {
			resultado = !resultado;
		}
		return resultado;
	}
}
