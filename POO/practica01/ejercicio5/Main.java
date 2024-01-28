package ejercicio5;

public class Main {
	public static void main(String[] args) {
		// Instanciamos un objeto celular de la clase Celular
		Celular celular = new Celular();
		// Mostramos sus atributos modelo y almacenamiento
		System.out.println("El modelo del celular es " + celular.modelo);
		System.out.println("Tiene una capacidad de almacenamiento de " + celular.almacenamiento + "GB");
	}
}
