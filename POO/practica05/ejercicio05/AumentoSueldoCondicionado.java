package ejercicio05;

import java.util.*;

import ejercicio01.Empleado;

public class AumentoSueldoCondicionado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Empleado> listaEmpleado = crearListaDeEmpleados(sc);
		aumentarSueldo(listaEmpleado);
		// Mostramos los datos de los empleados depués de modificar el sueldo
		mostrarEmpleados(listaEmpleado);
		sc.close();
	}
	private static List<Empleado> crearListaDeEmpleados(Scanner sc){
		List<Empleado> listaEmpleados = new ArrayList<>();
		System.out.println("¿Cuántos empleados quieres registrar? ");
		int numEmpleados = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < numEmpleados; i++) {
			listaEmpleados.add(cargarEmpleado(sc, i + 1));
		}
		return listaEmpleados;
	}
	private static Empleado cargarEmpleado(Scanner sc, int numEmpleado) {
		System.out.println("-----------------------------------------------");
		System.out.print("Ingrese el nombre del empleado " + numEmpleado+": ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese el sueldo: ");
		double sueldo = Double.parseDouble(sc.nextLine());
		System.out.print("Ingrese el año del contrato: ");
		int yearContrato = Integer.parseInt(sc.nextLine());
		System.out.print("Ingrese el mes del contrato: ");
		int mes = Integer.parseInt(sc.nextLine());
		System.out.print("Ingrese el día del contrato: ");
		int dia = Integer.parseInt(sc.nextLine());
		return new Empleado(nombre, sueldo, yearContrato, mes, dia);
	}
	
	private static void aumentarSueldo(List<Empleado> listaEmpleados) {
		for (Empleado empleado : listaEmpleados) {
            int yearContrato = empleado.dimeFechaDeContrato().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().getYear();
			if (yearContrato < 2021) {
				empleado.subeSueldo(5);
			}
		}
	}
	private static void mostrarEmpleados(List<Empleado> listaEmpleados) {
		String empleados = "";
		System.out.println("-------------------------------------\n"
				+ "Después de modificar el sueldo");
		for (Empleado empleado : listaEmpleados) {
			empleados += empleado + "\n";
		}
		if (empleados.length() > 0) {
			System.out.println(empleados);
		}else {
			System.out.println("No hay ningun empleado en la lista de empleados.");
		}
	}
}
