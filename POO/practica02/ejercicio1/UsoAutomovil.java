package ejercicio1;

public class UsoAutomovil {
	public static void main(String[] args) {
		// Instanciamos un objeto de la clase Automovil
		Automovil miAuto = new Automovil("Toyota", "Camry");
		System.out.println("Marca: " + miAuto.getMarca());
		System.out.println("Modelo: " + miAuto.getModelo());

		// Intentamos establecer un modelo nulo
		miAuto.setModelo(null);

		// Intentamos establecer un modelo vacío
		miAuto.setModelo("");

		// Establecemos un nuevo modelo válido
		miAuto.setModelo("Corolla");
		System.out.println("Nuevo modelo: " + miAuto.getModelo());

	}
}
