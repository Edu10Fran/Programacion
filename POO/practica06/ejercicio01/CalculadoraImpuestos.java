package ejercicio01;

public class CalculadoraImpuestos {
	private final double PORCENTAJE_IMPUESTO = 0.15;
	private double precioFinal;
	private double impuesto;
	private double precioProducto;
	//Constructor 
	CalculadoraImpuestos(double precioProducto){
		this.impuesto = precioProducto * PORCENTAJE_IMPUESTO;
		this.precioProducto = precioProducto;
		this.precioFinal = precioProducto + impuesto;
	}
	// getter para el precio final
	public String dimePrecioFinal() {
		return "El pecio final del producto es " + this.precioFinal + " €";
	}
	// Método toString para mostrar las caracteristicas
	public String toString() {
		String descripcion = "Precio del producto: " + this.precioProducto + "\n";
		descripcion += "Impuesto: " + this.impuesto + "€\n";
		descripcion += "Precio final: " + this.precioFinal + "\n";
		return descripcion;
	}
}
