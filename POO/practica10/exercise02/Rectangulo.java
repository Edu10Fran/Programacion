package exercise02;

public class Rectangulo {
	private double altura;
	private double ancho;
	private double area;
	
	// Contructor que recibe como parametro los dos atributos
	public Rectangulo(double altura, double ancho) {
		this.altura = altura;
		this.ancho = ancho;
	}
	// Recibe los atributos, pero con diferente tipo
	public Rectangulo(int altura, int ancho) {
		// No hace falta hacer casting explicito porque no va existir desbodamiento
		this.altura = altura;
		this.ancho = ancho;
	}
	
	// Constructor vacio
	public Rectangulo() {
		this.altura = 5;
		this.ancho = 6.4;
	}
	// Constructor con solo recibe el ancho como argumento
	public Rectangulo(double ancho) {
		this.ancho = ancho;
		this.altura = 5.5;
	}
	// Método para calcular área
	public void calcularArea() {
		this.area = Math.round(this.altura * this.ancho * 100.0) / 100.0;
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		resultado.append("Altura: " + this.altura + "\n");
		resultado.append("Ancho: " + this.ancho + "\n");
		resultado.append("Área: " + this.area + "\n");
		return resultado.toString();
	}
}
