package ejercicio05;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class UsoContacto {
	public static void main(String[] args){
		List<Contacto> listaContactos = new ArrayList<>();
		boolean continuar = true;
		do {
			try {
                int option = Integer.parseInt(JOptionPane.showInputDialog("Agenda de contactos\n"
                        + "1) Para añadir contacto\n"
                        + "2) Para buscar contacto\n"
                        + "3) Para mostrar contactos\n"
                        + "4) Para salir\n"
                        + "Elige una opción:"));

                switch (option) {
                    case 1:
                        Contacto contacto = agregarContacto();
                        if (contacto != null) {
                            listaContactos.add(contacto);
                        }
                        break;
                    case 2:
                        searchContact(listaContactos);
                        break;
                    case 3:
                        mostrarContactos(listaContactos);
                        break;
                    case 4:
                        continuar = !continuar;
                        JOptionPane.showMessageDialog(null, "Cerrando sesión...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opción incorrecta.");
                        break;
                }
            } catch (NumberFormatException e) {
                // Captura la excepción si no se ingresa un número
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.");
            } 
		} while(continuar);
	}
	// Método para crear contacto
	private static Contacto agregarContacto() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto");
		if (nombre == null) {
			return null;
		}
		while (nombre.isEmpty()) {
			nombre = JOptionPane.showInputDialog("Introduce un nombre válido:");
		}
		String telephon = JOptionPane.showInputDialog("Ahora ingrese el número de teléfono");
		if (telephon == null) {
			return null;
		}
		while (telephon.isEmpty()) {
			telephon = JOptionPane.showInputDialog("Ingrese un número de teléfono válido:");
		}
		String email = JOptionPane.showInputDialog("Ahora ingrese el email");
		if (email == null) {
			return null;
		}
		// Aquí validamos el correo
		while (email.isEmpty() || !validarEmail(email)) {
			email = JOptionPane.showInputDialog("Ingrese un correo válido.");
		}
		return new Contacto(nombre, telephon, email);
	}
	// Método para buscar contacto en la Agenda de contactos
	private static void searchContact(List<Contacto> listaContactos) {
		String email = JOptionPane.showInputDialog("Ingrese el email del contacot para realizar la busqueda");
		if (email != null && !email.isEmpty()){
			for (Contacto contacto : listaContactos) {
				if (contacto.dimeEmail().equalsIgnoreCase(email)) {
					JOptionPane.showMessageDialog(null, "----------------------------------------------\n" + 
					contacto);
					return;
				}
			}
			JOptionPane.showInputDialog("No existe ningun contacto con el email" + email);
		}else {
			JOptionPane.showInputDialog("El email no puede ser nulo ni string vacío");
		}
	}
	private static void mostrarContactos(List<Contacto> listaContactos) {
		String resultado = "";
		for (Contacto contacto : listaContactos) {
			resultado += contacto;
		}
		if (resultado.length() == 0) {
			resultado += "No tienes ningun contacto";
		}else {
			resultado = "Lista de contactos\n"
					+ "----------------------------------------------\n"
					+ resultado;
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
	private static boolean validarEmail(String email) {
		String expreRegular = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(expreRegular); 
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
