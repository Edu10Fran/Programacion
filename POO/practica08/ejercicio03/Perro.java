package ejercicio03;

import javax.swing.JOptionPane;
public class Perro extends Animal{
	// Constructor que usa el contructor de la clase madre
	@Override
	public void emitirSonido() {
		JOptionPane.showMessageDialog(null, "El perro LADRA");
	}
}
