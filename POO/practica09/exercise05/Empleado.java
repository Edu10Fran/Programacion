package exercise05;

public abstract class Empleado {
	private String nombre;
	private double sueldoFinal;
	// Constructor 
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.sueldoFinal = 0;
	}
	// Método abstracto para calcular el salario
	abstract public void calcularSalario();
	// Método getter para nombre
	public String dimeNombre() {
		return this.nombre;
	}
	// Método setter para nombre
	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Método getter para sueldo final 
	public double dimeSueldoFinal() {
		return this.sueldoFinal;
	}
	// Método para establecer el sueldo final
	protected void establecerSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}
}
