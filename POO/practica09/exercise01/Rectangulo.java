package exercise01;

public class Rectangulo extends FiguraGeometrica{
	private double base;
	private double altura;
	public Rectangulo(double base, double altura) {
		super("Rectangulo");
		this.base = base;
		this.altura = altura;
	}
	@Override
	public void calcularArea() {
		establecerArea(base*altura);
	}
	// Método getter para base
	public double dimeBase() {
		return this.base;
	}
	// Método setter para base
	public void establecerBase(double base) {
		this.base = base;
	}
	// Método getter para altura
	public double dimeAltura() {
		return this.altura;
	}
	// Método setter para altura 
	public void establecerAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		StringBuilder rectangulo = new StringBuilder();
		rectangulo.append("Nombre de la figura: " + dimeNombre() + "\n");
		rectangulo.append("Área: " + dimeArea() + "\n");
		rectangulo.append("Base: " + this.base + "\n");
		rectangulo.append("Altura: " + this.altura + "\n");
		return rectangulo.toString();
	}
}
