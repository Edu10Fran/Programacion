package exercise03;

import javax.swing.JOptionPane;

public class Perro extends Animal {
	@Override
	public void hacerSonido() {
		JOptionPane.showMessageDialog(null, "El perro dice GUAU, GUAU");
	}
	@Override
	public void moverse() {
		JOptionPane.showMessageDialog(null, "El perro está corriendo");
	}
}