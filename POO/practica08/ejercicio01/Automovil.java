package ejercicio01;

public class Automovil extends Vehiculo{
	// Atributo propio
	private String tipoCombustible;
	// Constructor 
	public Automovil(String marca, String modelo, int year, String tipoCombustible) {
		super(marca, modelo, year);
		this.tipoCombustible = tipoCombustible;
	}
	// getter and setter para tipo de combustible
	public String dimeTipoCombustible() {
		return this.tipoCombustible;
	}
	public void establecerTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
}