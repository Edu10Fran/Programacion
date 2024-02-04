package ejercicio03;

import javax.swing.JOptionPane;

public class UsoComprobadorEdadVoto {
	public static void main(String[] args) {
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario"));
		ComprobadorEdadVoto comprobador = new ComprobadorEdadVoto(edad);
		JOptionPane.showMessageDialog(null, comprobador);
	}
}
