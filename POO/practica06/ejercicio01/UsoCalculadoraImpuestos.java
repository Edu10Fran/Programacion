package ejercicio01;

import javax.swing.JOptionPane;

public class UsoCalculadoraImpuestos {
	public static void main(String[] args) {
		String precioProductoString = JOptionPane.showInputDialog("Ingrese el precio del producto");
		double precioProducto = Double.parseDouble(precioProductoString);
		CalculadoraImpuestos calculadora1 = new CalculadoraImpuestos(precioProducto);
		JOptionPane.showMessageDialog(null, calculadora1);
	}
}
