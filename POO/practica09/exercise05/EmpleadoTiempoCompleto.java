package exercise05;


public class EmpleadoTiempoCompleto extends Empleado{
	// Atributo propio
	private int horasExtra;
	// Atributo propio
	private final double pagoHoraExtra = 20;
	public EmpleadoTiempoCompleto(String nombre, double sueldoBase, int horasExtra) {
		super(nombre, sueldoBase);
		this.horasExtra = horasExtra;	
	}
	
	@Override
	public void calcularSalario() {
		double sueldoFinal = dimeSueldoBase(
				) + (this.horasExtra * this.pagoHoraExtra);
		establecerSueldoFinal(sueldoFinal);
	}
	
	
}
