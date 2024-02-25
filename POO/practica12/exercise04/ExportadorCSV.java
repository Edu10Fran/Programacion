package exercise04;

import javax.swing.JOptionPane;
//Clase que va a usar la clase Reporte 
public class ExportadorCSV implements Exportable {
	@Override
	public void exportarDatos() {
		JOptionPane.showMessageDialog(null, "Exportando el documento a CSV");		
	}
	
}
