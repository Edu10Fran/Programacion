package ejercicio02;

import javax.swing.JOptionPane;
public class UsoEstudiante {
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Pedro Francisco", 108, "Psicología");
		JOptionPane.showMessageDialog(null, estudiante1 + "Carrera: " + estudiante1.dimeCarrera() );
	}
}