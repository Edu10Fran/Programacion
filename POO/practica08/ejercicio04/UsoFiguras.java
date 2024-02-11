package ejercicio04;

import javax.swing.JOptionPane;

public class UsoFiguras {
	public static void main(String[] args) {
		Figura []figuras = new Figura[2];
		// Aquí no va a tirar error porque se está aplicando 
		// polimorfismo, es decir, circulo es una de  las
		// varias formas de representar la clase madre Figura
		figuras[0] = new Circulo(4);
		figuras[1] = new Rectangulo(6, 8);
		JOptionPane.showMessageDialog(null, "El área del circulo es " + figuras[0].calcularArea());
		JOptionPane.showMessageDialog(null, "El área del rectangulo es " + figuras[1].calcularArea());
		
	}
}
