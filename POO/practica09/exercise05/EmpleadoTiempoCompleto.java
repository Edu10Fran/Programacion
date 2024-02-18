package exercise05;

public class EmpleadoTiempoCompleto extends Empleado{
	// Atributo propio
	private int horasExtra;
	private double sueldoBase;
	// Atributo propio
	private final double pagoHoraExtra = 20;
	public EmpleadoTiempoCompleto(String nombre, double sueldoBase, int horasExtra) {
		super(nombre);
		this.sueldoBase = sueldoBase;
		this.horasExtra = horasExtra;	
	}
	
	@Override
	public void calcularSalario() {
		double sueldoFinal = dimeSueldoBase(
				) + (this.horasExtra * this.pagoHoraExtra);
		establecerSueldoFinal(sueldoFinal);
	}
	// Método getter para sueldo base
	public double dimeSueldoBase() {
		return this.sueldoBase;
	}

	// Método setter para sueldo base
	public void establecerSueldoBase(double sueldo) {
		this.sueldoBase = sueldo;
	}
	@Override
	public String toString() {
		StringBuilder empleado = new StringBuilder();
		empleado.append("\tEmpleado tiempo completo\n");
		empleado.append("Nombre: " + dimeNombre() + "\n");
		empleado.append("Horas extras: " + this.horasExtra + " hs\n");
		empleado.append("Sueldo base: " + this.sueldoBase + " €\n");
		empleado.append("Sueldo final: " + dimeSueldoFinal() + " €\n");
		return empleado.toString();
	}
}
