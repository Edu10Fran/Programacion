package exercise05;
import javax.swing.JOptionPane;

public class UsoEmpleados {
	public static void main(String[] args) {
		// Intanciamos un objeto empleado a tiempo completo
		EmpleadoTiempoCompleto empleadoTCompleto = new EmpleadoTiempoCompleto("Luis", 1500, 10);
		empleadoTCompleto.calcularSalario();
		JOptionPane.showMessageDialog(null, empleadoTCompleto);
		// Intanciamos un objeto empleado a tiempo parcial
		EmpleadoTiempoParcial empleadoTParcial = new EmpleadoTiempoParcial("Gabriel", 22, 20);
		empleadoTParcial.calcularSalario();
		JOptionPane.showMessageDialog(null, empleadoTParcial);
	}
}	
