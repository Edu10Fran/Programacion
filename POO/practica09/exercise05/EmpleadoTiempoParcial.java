package exercise05;

public class EmpleadoTiempoParcial extends Empleado{
	private int hora;
	private double tarifa;

	public EmpleadoTiempoParcial(String nombre, int hora, double tarifa) {
		super(nombre);
		this.hora = hora;
		this.tarifa = tarifa;
	}

	@Override
	public void calcularSalario() {
		establecerSueldoFinal( hora * tarifa);
	}
	@Override
	public String toString() {
		StringBuilder empleado = new StringBuilder();
		empleado.append("\tEmpleado tiempo parcial\n");
		empleado.append("Nombre: " + dimeNombre() + "\n");
		empleado.append("Horas trabajadas: " + this.hora + " hs\n");
		empleado.append("Tarifa: " + this.tarifa + " €\n");
		empleado.append("Sueldo final: " + dimeSueldoFinal() + " €\n");
		return empleado.toString();
	}
}
