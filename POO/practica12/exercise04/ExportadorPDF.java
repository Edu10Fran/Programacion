package exercise04;

import javax.swing.JOptionPane;
// Clase que va a usar la clase Reporte 
public class ExportadorPDF implements Exportable{
	@Override
	public void exportarDatos() {
		JOptionPane.showMessageDialog(null, "Exportando el documento a PDF");
	}
}
