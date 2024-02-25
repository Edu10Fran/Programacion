package exercise03;

import javax.swing.JOptionPane;

public class NotificacionApp implements Notificable{
	private String nombreUsuario;
	// Constructor
	public NotificacionApp(String nomUsuario) {
		this.nombreUsuario = nomUsuario;
	}
	@Override
	public void enviarNotificacion(String mensaje) {
		JOptionPane.showMessageDialog(null, "Enviando notificacón de un App a " + this.nombreUsuario);
		JOptionPane.showMessageDialog(null, "Notificación mediante app:\n" + mensaje);
		JOptionPane.showMessageDialog(null, "La notificación fue enviada correctamente");
	}
	// Método getter para nombre del usuario
	public String dimeNombreUsuario() {
		return this.nombreUsuario;
	}

	// Método setter para email
	public void establecerEmail(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
}
