package exercise01;

public class UsoEmpleado {
	public static void main(String []args) {
		// Usando el constructor que solo recibe el nombre
		Empleado empleado1 = new Empleado("Luis López");
		// Usando el constructor que recibe todos los atributos
		Empleado empleado2 = new Empleado("Jorge", 3000, "10 BC");
		// Usando el constructor que recibe el nombre y el salario
		Empleado empleado3 = new Empleado("Pedro Francisco", 3400);
		// Usando el constructor que recibe el nombre y el departamento
		Empleado empleado4 = new Empleado("Fernando", "RRCC");
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
	}
}
