package ejercicio02;

import javax.swing.JOptionPane;

import ejercicio01.Empleado;

public class ModificacionSueldo {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ahora ingrese el sueldo:"));
		int yearContrato = Integer.parseInt(JOptionPane.showInputDialog("Ahora ingrese el año de su contrato:"));
		int mesContrato = Integer.parseInt(JOptionPane.showInputDialog("Ahora ingrese el mes de su contrato:"));
		int diaContrato = Integer.parseInt(JOptionPane.showInputDialog("Ahora ingrese el día de su contrato:"));

		Empleado empleado2 = new Empleado(nombre, sueldo, yearContrato, mesContrato, diaContrato);
		double aumento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto porciento de aumento va a tener:"));
		empleado2.subeSueldo(aumento);
		JOptionPane.showMessageDialog(null, "Sueldo después del aumento: " + empleado2.dimeSueldo());
	}
}

