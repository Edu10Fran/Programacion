package exercise05;

import javax.swing.JOptionPane;

public class Datos implements Filtrable, Ordenable {

	@Override
	public void ordenarDatos() {
		JOptionPane.showMessageDialog(null, "Los datos fueron ordenados correctamente");
		
	}

	@Override
	public void filtarDatos() {
		JOptionPane.showMessageDialog(null, "Los datos fueron filtrados correctamente\"");
		
	}
}
