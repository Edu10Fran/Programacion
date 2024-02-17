package exercise01;

import javax.swing.JOptionPane;

public class UsoFiguraGeometricas {
	public static void main(String[] args) {
		// Intanciamos un objeto circulo
		Circulo circulo = new Circulo(5);
		// calculamos su área
		circulo.calcularArea();
		// Mostramos las caracteristicas
		JOptionPane.showMessageDialog(null, circulo);
		
		// Ahora instanciamos un objeto rectangulo de la clase Rectangulo
		Rectangulo rectangulo = new Rectangulo(4, 5.5);
		// Calculamos su área
		rectangulo.calcularArea();
		// Mostramos las caracteristicas
		JOptionPane.showMessageDialog(null, rectangulo);
	}
}
