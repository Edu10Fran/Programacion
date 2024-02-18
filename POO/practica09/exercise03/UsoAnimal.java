package exercise03;

public class UsoAnimal {
	public static void main(String[] args) {
		// Instanciamos un objeto gato de la clase Gato
		Gato gato = new Gato();
		gato.hacerSonido();
		gato.moverse();
		// Instanciamos un objeto perro de la clase Perro
		Perro perro = new Perro();
		perro.hacerSonido();
		perro.moverse();
	}
}
