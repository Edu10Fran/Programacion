package ejercicio3;
import java.util.*;
public class Receta {
	private List<String> ingredientes;
	private List<String> pasos;

	// Constructor
	public Receta() {
		ingredientes = new ArrayList<>();
		pasos = new ArrayList<>();
	}

	// Método para añadir ingredientes
	public void setAñadirIngrediente(String ingrediente) {
		if (ingrediente == null) {
			System.out.println("El ingrediente no puede ser nulo");
		} else {
			this.ingredientes.add(ingrediente);
		}
	}

	// Método para eliminar ingrediente
	public void eliminarIngrediente(String ingredinete) {
		if (ingredientes.remove(ingredinete)) {
			System.out.println("El ingrediente se eliminó con exito");
		} else {
			System.out.println("El ingrediente no existe en la lista de ingredientes.");
		}
	}

	// Método para añadir paso
	public void addPaso(String paso) {
		if ((paso != null) && (!paso.isEmpty())) {
			pasos.add(paso);
		} else if (paso.isEmpty()) {
			System.out.println("El paso a seguir no puede ser un String vacío.");
		} else {
			System.out.println("El paso a seguir no puede ser nulo.");
		}
	}

	// Método para mostrar la reseta, para eso usamos el método to String
	public void mostrarReceta() {
		int contador = 1;
		System.out.println("Ingredientes:");
		for (String ingrediente : ingredientes) {
			System.out.println(contador + "- " + ingrediente);
			contador++;
		}
		// Reiniciamos el valor del contador
		contador = 1;
		System.out.println("Pasos:");
		for (String paso : pasos) {
			System.out.println(contador + "- " + paso + ".");
			contador ++;
		}
	}
}
