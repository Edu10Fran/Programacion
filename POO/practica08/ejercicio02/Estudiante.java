package ejercicio02;
public class Estudiante extends Persona{
	private String carrera;
	// Constructor
	public Estudiante(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera = carrera;
	}
	// Método getter for carrera
	public String dimeCarrera() {
		return this.carrera;
	}
	// Método setter for carrera
	public void establecerCarrera(String carrera) {
		this.carrera = carrera;
	}
}

