package exercise02;

import javax.swing.JOptionPane;

public class Motocicleta extends Vehiculo {

	@Override
	public void acelerar(int velocidad) {
		JOptionPane.showMessageDialog(null, "La motocicleta está acelerando a " + velocidad + "km por horas"); 
	}

	@Override
	public void frenar(int velocidad) {
		JOptionPane.showMessageDialog(null, "La motocicleta está reduciendo la velocidad a " + velocidad + "km por horas"); 
	}
	
}