package ejercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ejercicio01.Empleado;

public class ListaDeEmpleados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Empleado> listaEmpleados = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			listaEmpleados.add(cargarEmpleado(sc, i+1));
		}
		// for para mostrar nombre y sueldo del empleado
		for (Empleado empleado : listaEmpleados) {
			System.out.println("-----------------------------------------------");
			System.out.println("Nombre del empleado: " + empleado.dimeNombre());
			System.out.println("Sueldo: " + empleado.dimeSueldo() + " €");
		}
		System.out.println("-----------------------------------------------");
		sc.close();
	}
	private static Empleado cargarEmpleado(Scanner sc, int numEmpleado) {
		System.out.println("-----------------------------------------------");
		System.out.print("Ingrese el nombre del empleado " + numEmpleado+": ");
		String nombre = sc.nextLine();
		System.out.print("Ahora ingrese el sueldo: ");
		double sueldo = Double.parseDouble(sc.nextLine());
		System.out.print("Ahora ingrese el año del contrato: ");
		int yearContrato = Integer.parseInt(sc.nextLine());
		System.out.print("Ahora ingrese el mes del contrato: ");
		int mes = Integer.parseInt(sc.nextLine());
		System.out.print("Ahora ingrese el día del contrato: ");
		int dia = Integer.parseInt(sc.nextLine());
		return new Empleado(nombre, sueldo, yearContrato, mes, dia);
	}
}
