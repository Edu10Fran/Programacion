package ejercicio03;

import javax.swing.JOptionPane;

public class UsoCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		cargarDatos(curso1);
		char categoria = curso1.categorizarCalificacion();
		JOptionPane.showMessageDialog(null, curso1 + "Categoría: " + categoria );
	}
	private static void cargarDatos(Curso curso) {
		
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del curso:");
		while (nombre.equals("null") || nombre.isEmpty()) {
			nombre = JOptionPane.showInputDialog("Ingrese un nombre valido:");
		}
		String calificacionString = JOptionPane.showInputDialog("Ingrese la calificación del estudiante:");
		while (calificacionString.equals("null") || calificacionString.isEmpty()) {
			calificacionString = JOptionPane.showInputDialog("Introduce una calificación valida:");
		}
		int calificacion = Integer.parseInt(calificacionString);
		curso.establecerNombreCurso(nombre);
		curso.establecerCalificaion(calificacion);
	}
}
