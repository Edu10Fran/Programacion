package exercise04;

import javax.swing.JOptionPane;

public class UsoCoche {
	public static void main(String[] args) {
		// Instanciamos un objeto coche usando el constructor vacio
		Coche coche1 = new Coche();
		JOptionPane.showMessageDialog(null, coche1);
		// Usando el contructor que recibe todos los atributos por parametro
		Coche coche2 = new Coche("Ferrari", "296 GTB", 2020, "Rojo");
		JOptionPane.showMessageDialog(null, coche2);
		// Usando el contructor que recibe los atributos marca, modelo, año y color por defecto será Azul
		Coche coche3 = new Coche("Mercedes-Benz", "GLC Coupé", 2023);
		JOptionPane.showMessageDialog(null, coche3);
		// Usando el contructor que recibe los atributos marca y modelo. 
		// El año igual a 2024 y el color igual a negro por defecto
		Coche coche4 = new Coche("Nissan", "GT-R");
		JOptionPane.showMessageDialog(null, coche4);
	}
}
