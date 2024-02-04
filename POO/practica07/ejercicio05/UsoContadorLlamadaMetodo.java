package ejercicio05;
import javax.swing.*;
public class UsoContadorLlamadaMetodo {
	public static void main(String[] args) {
		ContadorLlamadaMetodo [] contadores = new ContadorLlamadaMetodo [10];

		for (int i = 0; i < contadores.length; i++) {
			contadores[i] = new ContadorLlamadaMetodo();
			contadores[i].saludar();
		}
		// Aquí usamos la clase para saber cuantas veces si hizo la llamada del método saludar
		JOptionPane.showMessageDialog(null, "El método saludar fue llamado " +ContadorLlamadaMetodo.dimeTotalLlamadas() + " veces");
	}
}
