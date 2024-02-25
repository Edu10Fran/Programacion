package exercise03;

import javax.swing.JOptionPane;

public class SMS implements Notificable{
	private String numTelefono;
	// Cosntructor 
	public SMS(String numeroTelefono) {
		this.numTelefono = numeroTelefono;
	}
	@Override
	public void enviarNotificacion(String mensaje) {
		JOptionPane.showMessageDialog(null, "Enviando un SMS a " + this.numTelefono);
		JOptionPane.showMessageDialog(null, "Notificación mediante sms:\n" + mensaje);
		JOptionPane.showMessageDialog(null, "El SMS fue enviado correctamente");
	}
	// Método getter para número de télefono
	public String dimeNumeroTelefono() {
		return this.numTelefono;
	}
	// Método setter para número de télefono
	public void establecerNumeroTelefono(String numeroTelefono) {
		this.numTelefono = numeroTelefono;
	}
}
