package ejercicio02;

public class Persona {
	private String nombre;
	private int edad;
	// Constructor 
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	// getter and setter for nombre
	public String dimeNombre() {
		return this.nombre;
	}
	public int dimeEdad() {
		return this.edad;
	}
	// Método para mostrar las caracteristicas de Persona
	public String toString() {
		return "Nombre: " + this.nombre + 
				"\nEdad: " + this.edad + "\n"; 
	}
}