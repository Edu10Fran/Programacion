package exercise03;

public class Producto {
	private String nombre;
	private double precio;
	private int cantidadStock;
	
	// Constructor que recibe todos los atributos
	public Producto(String nombre, double precio, int cantidadStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
	}
	// Contructor vacio
	public Producto() {
		this.nombre = "Agucate";
		this.precio = 3;
		this.cantidadStock = 15;
	}
	// Constructor que solo recibe nombre y precio
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		// Por defecto pone la cantidad a 10
		this.cantidadStock = 10;
	}
	// Constructor que solo recibe el nombre del producto
	public Producto(String nombre) {
		this.nombre = nombre;
		// Los otros atributos se van a cargar por defecto
		this.precio = 400;
		this.cantidadStock = 23;
	}
	// Contructor que recibe todos los atributos, 
	// pero precio tipo entero, casting implicito
	public Producto(String nom, int pre, int cantStock) {
		// Sin usar this
		nombre = nom;
		precio = pre;
		cantidadStock = cantStock;
	}
	// Método para calcular el precio en Stock
	public double calcularPrecioStock() {
		return this.precio * this.cantidadStock;
	}
	
	public String toString() {
		String resultado = "Nombre: " + this.nombre + "\n";
		resultado += "Precio= " + this.precio + "\n";
		resultado += "Cantidad en Stock= " + this.cantidadStock + "\n";
		resultado += "Precio del Stock= " + this.precio * this.cantidadStock + "\n";
		return resultado;
	}
}