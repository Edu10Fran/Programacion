package exercise03;

import javax.swing.JOptionPane;
public class UsoNotificables {
	public static void main(String[] args) {
		// Lamamos al método menu
		menu();
	}
	// Método que usa polimorfismo
	public static void enviarNotificacion(Notificable objeto) {
		String mensaje = JOptionPane.showInputDialog("Ingrese el mensaje");
		objeto.enviarNotificacion(mensaje);
	}
	public static void menu() {
		try {
			int cantidadNotificacion = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad de notificaciones que quieres enviar"));
			while (cantidadNotificacion > 0) {
				try {
					int option = Integer.parseInt(JOptionPane.showInputDialog("\nElige un método\n" + "1. Correo\n"
							+ "2. Sms\n" + "3. App\n" + "4. Salir\n" + "Elige una opción"));
					switch (option) {
					case 1:
						enviarNotificacion(
								new CorreoElectronico(JOptionPane.showInputDialog("Ahora ingrese el correo")));
						break;
					case 2:
						enviarNotificacion(new SMS(JOptionPane.showInputDialog("Ahora ingrese el número de télefono")));
						break;
					case 3:
						enviarNotificacion(new NotificacionApp(
								JOptionPane.showInputDialog("Ahora ingrese el nombre del usuario")));
						break;
					case 4:
						cantidadNotificacion = 0;
						JOptionPane.showMessageDialog(null, "¡Hasta luego!\nGracias por usar nuestro servicio");
						return;
					default:
						JOptionPane.showMessageDialog(null, "Opción incorrecta, elige una correcta");
						break;
					}
					cantidadNotificacion--;
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
				}
			}
		}catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
		}
	}
}
