package exercise02;

import javax.swing.JOptionPane;

public class RedsysTPV implements ProcesadorDePago {

	@Override
	public void realizarPago() {
		JOptionPane.showMessageDialog(null, "Pago realizado con exito.");
		JOptionPane.showMessageDialog(null, "Gracias por utilizar RedsysTPV");
	}
	@Override
	public void reembolsarPago() {
		JOptionPane.showMessageDialog(null, "Reembolso realizado con exito.");
		JOptionPane.showMessageDialog(null, "Gracias por utilizar RedsysTPV");
	}
	
}
