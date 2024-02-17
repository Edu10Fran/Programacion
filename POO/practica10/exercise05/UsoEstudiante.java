package exercise05;

import javax.swing.JOptionPane;

public class UsoEstudiante {
	public static void main(String[] args) {
		// Instanciamos un objeto estudiante usando el contructor
		// que recibe todos los atributos por parametro
		Estudiante estudiante1 = new Estudiante("David", 23, 7.5);
		JOptionPane.showMessageDialog(null, estudiante1);
		// Usando el constructor que solo recibe el nombre y la edad
		Estudiante estudiante2 = new Estudiante("Luis", 22);
		JOptionPane.showMessageDialog(null, estudiante2);
		// Usando el contructor que solo recibe el nombre
		Estudiante estudiante3 = new Estudiante("José");
		JOptionPane.showMessageDialog(null, estudiante3);
	}
}
