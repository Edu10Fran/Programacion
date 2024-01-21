package ejercicio3;
import java.util.Scanner;
public class UsoReceta {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receta receta1 = new Receta();

		cargarIngredientesPasos(receta1);
		receta1.mostrarReceta();
	}
	// Método para cargar los ingredientes y pasos.
	private static void cargarIngredientesPasos(Receta receta) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el nombre de la receta: ");
		String nombreReceta = sc.nextLine();
		System.out.println("Para generar la receta de " + nombreReceta + " ingrese la cantidad de ingredietes que va a tener:");
		int cantidadIngrediente = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cantidadIngrediente; i++) {
			System.out.print("Ingrese el ingrediente " + (i+1) + ":");
			receta.setAñadirIngrediente(sc.nextLine());
		}
		System.out.print("Ahora ingrese la cantidad de pasos que va a tener la receta: ");
		int cantidadPasos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cantidadPasos; i++) {
			System.out.print("Ingrese el paso " + (i + 1) + ":");
			receta.addPaso(sc.nextLine());
		}
		System.out.println("\nReceta de " + nombreReceta);
		sc.close();
	}

}
