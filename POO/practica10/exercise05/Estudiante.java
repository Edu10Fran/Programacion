package exercise05;

public class Estudiante {
	private String nombre;
	private int edad;
	private double promedio;
	
	// Constructor que recibe todos los atributos por parametro
	public Estudiante(String nombre, int edad, double promedio) {
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = promedio;
	}
	// Contructor que solo recibe el nombre y la edad
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = 0;
	}
	// Constructor que solo recibe el nombre
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	// Método getter para nombre
	public String dimeNombre() {
		return this.nombre;
	}
	// Método setter para nombre
	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}
	// Método getter para el atributo edad
	public int dimeEdad() {
		return this.edad;
	}
	// Método setter para el atributo edad
	public void establecerEdad(int edad) {
		this.edad = edad;
	}
	// Método getter para el atributo promedio
	public double dimePromedio() {
		return this.promedio;
	}
	// Método setter para el atributo promedio
	public void establecerPromedio(double promedio) {
		this.promedio = promedio;
	}
	@Override
	public String toString() {
		StringBuilder estudiante = new StringBuilder();
		estudiante.append("Nombre: " + this.nombre + "\n");
		estudiante.append("Edad: " + this.edad + "\n");
		estudiante.append("Promedio: " + this.promedio + "\n");
		return estudiante.toString();
	}
}

