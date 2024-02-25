package exercise02;

import javax.swing.JOptionPane;

public class PayPal implements ProcesadorDePago{
	@Override
	public void realizarPago() {
		JOptionPane.showMessageDialog(null, "Pago realizado con exito.");
		JOptionPane.showMessageDialog(null, "Gracias por utilizar PayPal");
	}
	@Override
	public void reembolsarPago() {
		JOptionPane.showMessageDialog(null, "El reembolso se realizó con exito");
		JOptionPane.showMessageDialog(null, "Gracias por utilizar PayPal");
	}
}	
