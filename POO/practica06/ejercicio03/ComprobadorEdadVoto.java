package ejercicio03;

public class ComprobadorEdadVoto {
	private final int EDAD_MINIMA = 18;
	private boolean elegible;
	// Constructor
	public ComprobadorEdadVoto(int edad) {
		establecerElegible(edad);
	}
	//setter para elegible
	public void establecerElegible(int edad) {
		if (edad < EDAD_MINIMA) {
			this.elegible = false;
		}else {
			this.elegible = true;
		}
	}
	
	public String toString() {
		String descripcion = "";
		if (this.elegible) {
			descripcion += "Es elegible para votar";
		}else {
			descripcion += "No es elegible para votar";
		}
		return descripcion;
	}
}
