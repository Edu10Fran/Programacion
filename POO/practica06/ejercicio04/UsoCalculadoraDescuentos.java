package ejercicio04;

import javax.swing.JOptionPane;

public class UsoCalculadoraDescuentos {
	public static void main(String[] args) {
		double precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario del producto"));
		int cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto"));
		CalculadoraDescuentos calculadora = new CalculadoraDescuentos(precioUnitario, cantidadProducto);
		JOptionPane.showMessageDialog(null, calculadora);
	}
}
