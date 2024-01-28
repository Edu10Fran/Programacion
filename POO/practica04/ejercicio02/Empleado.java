package ejercicio02;
public class Empleado {
	private String nombre;
	private int horasTrabajadas;
	private double tarifaPorHora;
	
	// Constructor
	public Empleado(String nombre, int horasTrabajadas, double tarifaPorHora) {
		establecerNombre(nombre);
		establecerHorasTrabajadas(horasTrabajadas);
		establecerTarifaPorHora(tarifaPorHora);
	}
	// getter and setter para nombre
	public String dimeNombre() {
		return nombre;
	}
	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}
	// getter and setter para horas trabajadas
	public int dimeHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void establecerHorasTrabajadas(int horasTrabajadas) {
		if (horasTrabajadas > -1) {
			this.horasTrabajadas = horasTrabajadas;
		}else {
	        throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas");
		}
	}
	// getter and setter para tarifaPorHora
	public double dimeTarifaPorHora() {
		return this.tarifaPorHora;
	}
	public void establecerTarifaPorHora(double tarifaPorHora) {
		if (tarifaPorHora > -1) {
			this.tarifaPorHora = tarifaPorHora;
		}else {
	        throw new IllegalArgumentException("La tarifa por hora no puede ser negativa");
		}
	}
}
