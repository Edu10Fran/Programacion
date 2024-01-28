package ejercicio03;
public class Curso {
	private String nombreCurso;
	private int calificacion;
	
	//Constructor
	public Curso() {
	}
	// getter and setter para el nombre del curso
	public String dimeNombreCurso() {
		return nombreCurso;
	}
	public void establecerNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	// getter and setter para la calificacion
	public double dimeCalificacion() {
		return calificacion;
	}
	public void establecerCalificaion(int calificacion) {
		this.calificacion = calificacion;
	}
	// Método para categorizar la calificación
	public char categorizarCalificacion() {
		char categoria;
		switch((this.calificacion) / 10) {
			case 10: case 9:
				categoria = 'A';
				break;
			case 8:
				categoria = 'B';
				break;
			case 7:
				categoria = 'C';
				break;
			case 6:
				categoria = 'D';
			default:
				categoria = 'F';
				break;
		}
		return categoria;
	}
	public String toString() {
		String resultado = "Nombre del curso: " + dimeNombreCurso() + "\n";
		resultado += "Calificación: " + dimeCalificacion() + "\n";
		return resultado;
	}
}