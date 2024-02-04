package ejercicio04;

public class CalculadoraDescuentos {
	private final double PORCENTAJE_DESCUENTO = 0.9;
	private double precioFinal;
	private boolean descuento;
	//Constructor
	public CalculadoraDescuentos(double precioUnitario, int unidad){
		establecerPrecioFinalAndDesucuento(precioUnitario, unidad);
	}
	//setter para precio final
	public void establecerPrecioFinalAndDesucuento(double precioUnitario, int unidad) {
		// si es mayor que 5 tenemos que aplicar un descuento de 10%
		this.precioFinal = unidad > 5 ? ((precioUnitario*unidad)*PORCENTAJE_DESCUENTO) : precioUnitario*unidad;
		this.descuento = this.precioFinal < precioUnitario * unidad;
	}
	public String toString() {
		return descuento ? "Precio final después del descuento: " + this.precioFinal : "Precio final sin descuento: " + this.precioFinal; 
	}
}	

