package ejercicio04;

public class Circulo extends Figura{
	private double radio;
	// Constructor
	public Circulo(double radio) {
		this.radio = radio;
	}
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
}