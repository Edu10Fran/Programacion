package ejercicio03;

import ejercicio01.Empleado;

public class ComparacionFechaDeContrato {
	public static void main(String[] args) {
		Empleado empleado3 = new Empleado("Carlos López", 2500, 2023, 10,10);
		Empleado empleado4 = new Empleado("Juana Fernandez", 2300, 2023, 10, 9);
		// Aquí vamos a comprobar quien fue contratado primero
		if (empleado3.dimeFechaDeContrato().before(empleado4.dimeFechaDeContrato())) {
			System.out.println("El empleado 3 fue contratado primero");
		}else if (empleado4.dimeFechaDeContrato().before(empleado3.dimeFechaDeContrato())) {
			System.out.println("El empleado 4 fue contratado primero");
		}else {
			System.out.println("Los dos fueron contratados en el mismo día");
		}
	}
}
