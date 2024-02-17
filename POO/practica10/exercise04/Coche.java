package exercise04;

public class Coche {
	private String marca;
	private String modelo;
	private int year;
	private String color;
	
	// Constructor vacio
	public Coche() {
		this.marca = "Toyota";
		this.modelo = "Premio";
		this.year = 2002;
		this.color = "Blanco";
	}
	// Constructor que recibe todos los atributos por parametro
	public Coche(String marca, String modelo, int year, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
		this.color = color;
	}
	// Contructor que solo recibe la marca, el modelo y el año
	public Coche(String marca, String modelo, int year) {
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
		this.color = "Azul";
	}
	
	// Constructor que solo recibe la marca y el modelo
	// El año por defecto va a ser 2012 y el color negro
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.year = 2024;
		this.color = "Negro";
	}
	
	@Override
	public String toString() {
		StringBuilder coche = new StringBuilder();
		coche.append("Marca: " + this.marca + "\n");
		coche.append("Modelo: " + this.modelo + "\n");
		coche.append("Año: " + this.year + "\n");
		coche.append("Color: " + this.color + "\n");
		return coche.toString();
	}
	
}
