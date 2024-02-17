package exercise04;

import javax.swing.JOptionPane;

public class PersistenciaArchivo extends Persistencia {	
	@Override
	public void guardarDatos(String archivo) {
		JOptionPane.showMessageDialog(null, "Guardando datos en un archivo:" + archivo);
	}

	@Override
	public void cargarDatos() {
		JOptionPane.showMessageDialog(null, "Cargando datos desde un archivo");
	}
}
