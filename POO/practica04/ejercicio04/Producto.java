package ejercicio04;

public class Producto {
	private String nombre;
	private int cantidad;
	private double precio;
	
	// Constructor
	public Producto(String nombre, int cantidad, double precio) {
		establecerNombre(nombre);
		establecerCantidad(cantidad);
		establecerPrecio(precio);
	}
	// getter and setter para nombre
	public String dimeNombre() {
		return this.nombre;
	}
	public void establecerNombre(String newNombre) {
		this.nombre = newNombre;
	}
	// getter and setter para cantidad
	public int dimeCantidad() {
		return this.cantidad;
	}
	public void establecerCantidad(int newCantidad) {
		if (newCantidad > -1) {
			this.cantidad = newCantidad;
		}else {
			throw new IllegalArgumentException("La cantidad tiene que ser mayor o igual a cero");
		}
	}
	// getter and setter para precio
	public double dimePrecio() {
		return precio;
	}
	public void establecerPrecio(double newPrecio) {
		if (newPrecio > 0) {
			this.precio = newPrecio;
		}else {
	        throw new IllegalArgumentException("El precio no puede ser menor o igual a cero");
		}
	}
	// Método to String
	public String toString() {
		String resultado = "Producto: " + this.nombre;
		resultado += "\nCantidad: " + this.cantidad;
		if (this.cantidad > 1) {
			resultado += " uds";
		}else {
			resultado += " ud";
		}
		resultado += "\nPrecio : " + this.precio + " €\n";
		resultado += "----------------------------------------\n";
		return resultado;
	}
}

