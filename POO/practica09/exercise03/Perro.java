package exercise03;

import javax.swing.JOptionPane;

public class Perro extends Animal {
	@Override
	public void hacerSonido() {
		JOptionPane.showMessageDialog(null, "GUAU, GUAU");
	}
	@Override
	public void moverse() {
		JOptionPane.showMessageDialog(null, "Corriendo, corriendo");
	}
}