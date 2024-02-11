package ejercicio04;

public class Rectangulo extends Figura {
	private double base;
	private double altura;
	// Constructor
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}
}
