package exercise01;

public class Producto implements Inventariable {
	private int stock;
	private String nombre;
	private double precio;
	private double precioStock;
	public static final int id = 0;
	// Constructor
	public Producto(String nombre, int stock, double precio) {
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
		this.precioStock = precio * stock;
	}
	// Cumpliendo el contrato con la interfaz Inventariable
	@Override
	public int obtenerStock() {
		return this.stock;
	}
	// Cumpliendo el contrato con la interfaz Inventariable
	@Override 
	public void actualizarStock(int cantidad) {
		this.stock += cantidad;
	}
	// Método getter para nombre
	public String dimeNombre() {
		return nombre;
	}
	// Método setter para nombre
	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}
	// Método getter para precio
	public double dimePrecio() {
		return this.precio;
	}
	// Método setter para precio
	public void establecerPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		StringBuilder producto = new StringBuilder();
		producto.append("Nombre: " + this.nombre + "\n");
		producto.append("Stock: " + this.stock + "\n");
		producto.append("Precio: " + this.precio + "\n");
		producto.append("Precio Stock: " + this.precioStock + "\n");
		return producto.toString();
	}
	// Método para actualizar el precio en stock
	public void actualizarPrecioStock() {
		this.precioStock = this.precio * this.stock;
	}
	// Método que vamos a usar para eliminar un producto por nombre
	public boolean equalsName(String name) {
		boolean equals = false;
		if(name.equalsIgnoreCase(this.nombre)) {
			equals = !equals;
		}
		return equals;
	}
}
