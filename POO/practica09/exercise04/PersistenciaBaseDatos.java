package exercise04;

import javax.swing.JOptionPane;

public class PersistenciaBaseDatos extends Persistencia {
	@Override
	public void guardarDatos(String datos) {
		JOptionPane.showMessageDialog(null, "Guardando datos en la base de datos: " + datos);
	}
	@Override
	public void cargarDatos() {
		JOptionPane.showMessageDialog(null, "Cargando datos desde una base de datos");
	}
}
