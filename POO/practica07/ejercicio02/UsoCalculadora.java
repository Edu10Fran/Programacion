package ejercicio02;

import javax.swing.JOptionPane;

public class UsoCalculadora {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "La suma de 5 + 5 es " + Calculadora.sumar(5, 5));
		JOptionPane.showMessageDialog(null, "La resta de 50 - 5 es " + Calculadora.restar(50, 5));
		JOptionPane.showMessageDialog(null, "El producto de 50 * 5 es " + Calculadora.multiplicar(50, 5));
		JOptionPane.showMessageDialog(null, "La división de 50 / 0 es " + Calculadora.dividir(50, 0));
	}
}
