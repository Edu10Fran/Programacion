package exercise03;

import javax.swing.JOptionPane;

public class Gato extends Animal{

	@Override
	public void hacerSonido() {
		JOptionPane.showMessageDialog(null, "MIAU, MIAU");
	}

	@Override
	public void moverse() {
		JOptionPane.showMessageDialog(null, "Saltando, saltando");
	}
	
}
