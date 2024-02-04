package ejercicio05;

import javax.swing.JOptionPane;

public class ContadorLlamadaMetodo {
	private static int contadorLlamada = 0;
	// Constructor
	public ContadorLlamadaMetodo() {}
	// Método que muestra saludo
	public void saludar() {
		JOptionPane.showMessageDialog(null, "Saludo " + (++ contadorLlamada));
	}
	public static int dimeTotalLlamadas() {
		return contadorLlamada;
	}
}
