package ejercicio2;

public class Habitacion {
	private int numHabitacion;
	private String tipo;
	private boolean ocupada;
	
	// Constructor
	public Habitacion(int numHabitacion, String tipo) {
		establecerNumHabitacion(numHabitacion);
		establecerTipoHabitacion(tipo);
		this.ocupada = false;
	}
	// getter para el número de habitación
	public int dimeNumHabitacion() {
		return numHabitacion;
	}
	// setter para el número de hatación
	public void establecerNumHabitacion(int numHabitacion) {
		if (numHabitacion < 1) {
			System.out.println("El número de la habitación debe ser mayor a cero.");
		}else {
			this.numHabitacion = numHabitacion;
		}
	}
	// getter para el tipo 
	public String dimeTipoHabitacion() {
		return this.tipo;
	}
	// setter para el tipo
	public void establecerTipoHabitacion(String tipo) {
		if (tipo.equalsIgnoreCase("simple") || tipo.equalsIgnoreCase("double") || tipo.equalsIgnoreCase("suite")) {
			this.tipo = tipo;
		}else {
			System.out.println("Si no se especifica bien el tipo se crea por defecto una habitación de tipo simple.");
			this.tipo = "simple";
		}
	}
	// getter para saber si está ocupada
	public boolean dimeEstado() {
		return this.ocupada;
	}
	// setter para cambiar a ocupada o a no acupada
	public void cambiarEstado(boolean estado) {
		this.ocupada = estado;
	}
	// Método para comprobar si dos habitaciones son iguales.
	public boolean equals(Habitacion otherHabitacion) {
		if (otherHabitacion == null) {
			return false;
		}
		if (this.tipo.equalsIgnoreCase(otherHabitacion.dimeTipoHabitacion()) && this.numHabitacion == otherHabitacion.dimeNumHabitacion()) {
			return true;
		}else {
			return false;
		}
	}
}

