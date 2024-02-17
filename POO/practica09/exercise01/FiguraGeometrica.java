package exercise01;
/**
 * La clase contiene el atributo área porque solo vamos
 * a trabar con Figuras geométricas con área
 */
public abstract class FiguraGeometrica {
	private String nombre;
	private double area;
	//Método contructor para usar en la hija
	protected FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	// Método abstracto
	abstract public void calcularArea();
	// Método getter para nombre
	public String dimeNombre() {
		return this.nombre;
	}
	// Método setter para nombre
	public void establecerNombre(String nom) {
		this.nombre = nom;
	}
	// Método getter para área
	public double dimeArea() {
		return this.area;
	}
	// Método setter para área
	public void establecerArea(double area) {
		this.area = area;
	}
}
