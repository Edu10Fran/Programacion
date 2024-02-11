package ejercicio01;

import javax.swing.JOptionPane;

public class UsoAutomovil {
	public static void main(String[] args) {
		Automovil automovil1 = new Automovil("Toyota", "Premio", 2002, "Nafta");
		JOptionPane.showMessageDialog(null, "Caracteristicas básicas\n" + automovil1 +
				"Tipo de combustible: " + automovil1.dimeTipoCombustible());
	}
}
