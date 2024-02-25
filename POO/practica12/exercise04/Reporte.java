package exercise04;

import javax.swing.JOptionPane;

public class Reporte {
	private Exportable exportador;
	// Constructor
	public Reporte(Exportable exportador) {
		this.exportador = exportador;
	}
	// Método para generar reporte
	public void generarReporte() {
		JOptionPane.showMessageDialog(null, "Generando reporte...\n¿Quieres exportar el reporte?");
		this.exportador.exportarDatos();
	}
}
