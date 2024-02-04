package ejercicio01;

import javax.swing.JOptionPane;

public class UsoContadorInstancias {
	public static void main(String[] args) {
		ContadorInstancias [] listaContadorInstancias = new ContadorInstancias[30];
		for (int i = 0; i < 30; i++) {
			listaContadorInstancias[i] = new ContadorInstancias();
		}
		JOptionPane.showMessageDialog(null, "Instancia actual " + ContadorInstancias.dimeInstanciaActual());
	}
}
