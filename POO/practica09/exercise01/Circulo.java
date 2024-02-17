package exercise01;

public class Circulo extends FiguraGeometrica {
	private double radio;
	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}
	@Override
	public void calcularArea() {
		establecerArea(Math.PI * Math.pow(radio, 2));
	}
	@Override
	public String toString() {
		StringBuilder circulo = new StringBuilder();
		circulo.append("Nombre de la figura: " + dimeNombre() + "\n");
		circulo.append("Área: " + dimeArea() + "\n");
		circulo.append("Radio: " + this.radio + "\n");
		return circulo.toString();
	}
}
