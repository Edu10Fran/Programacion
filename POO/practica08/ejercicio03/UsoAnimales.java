package ejercicio03;

public class UsoAnimales {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.emitirSonido();
		// Ahora instanciamos un objeto de la clase Perro
		Perro perro = new Perro();
		perro.emitirSonido();
	}
}
