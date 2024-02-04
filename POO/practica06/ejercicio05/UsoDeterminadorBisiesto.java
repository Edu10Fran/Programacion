package ejercicio05;

import javax.swing.JOptionPane;

public class UsoDeterminadorBisiesto {
	public static void main(String[] args) {
		int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año para verificar si es bisiesto"));
		DeterminadorBisiesto determinador = new DeterminadorBisiesto(year);
		JOptionPane.showMessageDialog(null, determinador);
	}
}
