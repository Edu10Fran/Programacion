package ejercicio05;

public class DeterminadorBisiesto {
	@SuppressWarnings("unused")
	private final int DIVISOR1 = 4;
	@SuppressWarnings("unused")
	private final int DIVISOR2 = 100;
	@SuppressWarnings("unused")
	private final int DIVISOR3 = 400;
	private boolean bisiesto;
	private int year;
	//Constructor
	public DeterminadorBisiesto(int year) {
		this.bisiesto = ((year % 4 == 0 &&  year % 100 != 0) || year % 400 == 0);
		this.year = year;
	}
	// ToString para no mostrar la id en memoria.
	public String toString() {
		return this.bisiesto ? "El año " + this.year + " es bisiesto" : "El año " + this.year + " no es bisiesto";
	}
}
