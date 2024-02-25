package exercise03;

import javax.swing.JOptionPane;

public class CorreoElectronico implements Notificable{
	private String email;
	//Constructor
	public CorreoElectronico(String email) {
		this.email = email;
	}
	@Override
	public void enviarNotificacion(String mensaje) {
		JOptionPane.showMessageDialog(null, "Enviando el email a " + this.email);
		JOptionPane.showMessageDialog(null, "Notificación mediante email:\n" + mensaje);
		JOptionPane.showMessageDialog(null, "El email fue enviado correctamente");
	}
	// Método getter para email
	public String dime_email() {
		return this.email;
	}
	// Método setter para email
	public void establecerEmail(String email) {
		this.email = email;
	}
}
