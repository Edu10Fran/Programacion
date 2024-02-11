package ejercicio01;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int year;
	
	// Constructor con parametros
	public Vehiculo(String marca, String modelo, int year) {
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
	}
	// geter and setter para marca
	public String dimeMarca() {
		return this.marca;
	}
	public void establecerMarca(String marca) {
		this.marca = marca;
	}
	// geter and setter for modelo
	public String dimeModelo() {
		return this.modelo;
	}
	public void establecerModelo(String modelo) {
		this.modelo = modelo;
	}
	// getter and setter for year
	public int dimeYear() {
		return this.year;
	}
	public void establecerYear(int year) {
		this.year = year;
	}
	// Método para ver las caracteristicas
	@Override
	public String toString() {
		return "Marca: " + this.marca 
				+ "\nModelo: " + this.modelo + "\nAño: " + this.year + "\n";
	}
}
