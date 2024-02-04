package ejercicio02;

import javax.swing.JOptionPane;

public class UsoConversorTemperatura {
	public static void main(String[] args) {
		int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura"));
		String tipo = JOptionPane.showInputDialog("Ingrese el tipo de la temperatura");
		ConversorTemperatura conversor1 = new ConversorTemperatura(temperatura, tipo);
		JOptionPane.showMessageDialog(null, conversor1.dimeTemperatura());
	}
	
}
