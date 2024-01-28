package ejercicio02;
import javax.swing.JOptionPane;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Empleado empleado = registrarEmpleado();
			if (empleado != null) {
				listaEmpleados.add(empleado);
			}
		}
		JOptionPane.showMessageDialog(null, listaEmpleados.size());
		// Aquí calculamos los salarios y luego lo mostramos
		for (Empleado empleado : listaEmpleados) {
			double salario = empleado.dimeHorasTrabajadas() * empleado.dimeTarifaPorHora();
			JOptionPane.showMessageDialog(null,empleado.dimeNombre() + " tiene un salario de " + salario);
		}
	}
	public static Empleado registrarEmpleado() {
		try {
            String nombre = JOptionPane.showInputDialog("Dime el nombre del empleado:");
            if (nombre == null) {
            	JOptionPane.showMessageDialog(null, "El nombre no puede ser nulo");
            	// El usuario cerró la ventana de entrada de datos
            	return null; // Otra opción podría ser lanzar una excepción aquí
            }
            if (nombre.isEmpty()) {
            	JOptionPane.showMessageDialog(null, "El nombre no puede ser un string vacío");
            	return null;
            }
            
            String horasTrabajadasString = JOptionPane.showInputDialog("Ahora ingrese las horas trabajadas:");
            if (horasTrabajadasString == null) {
                return null; 
            }
            int horasTrabajadas = Integer.parseInt(horasTrabajadasString);

            String tarifaPorHoraString = JOptionPane.showInputDialog("Ingrese la tarifa por horas:");
            if (tarifaPorHoraString == null) {
                return null; 
            }
            int tarifaPorHora = Integer.parseInt(tarifaPorHoraString);
            return new Empleado(nombre, horasTrabajadas, tarifaPorHora);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Formato inadecuado, tiene que ser un número entero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
	}
}
