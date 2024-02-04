package ejercicio02;

import javax.swing.JOptionPane;

public class Calculadora {
	public Calculadora() {
	}
	// Método para sumar
	public static double sumar(double numero1, double numero2) {
		return numero1 + numero2;
	}

	// Método para restar
	public static double restar(double numero1, double numero2) {
		return numero1 - numero2;
	}

	// Método para multiplicar
	public static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}

	// Método para dividir
	public static double dividir(double numero1, double numero2) {
		return (numero2 != 0) ? numero1 / numero2: errorDivisionPorCero();
	}
	// Método para mostrar error división por cero
	private static double errorDivisionPorCero() {
		JOptionPane.showMessageDialog(null, "Error: No se puede divir por cero");
		return Double.NaN;
	}
}
