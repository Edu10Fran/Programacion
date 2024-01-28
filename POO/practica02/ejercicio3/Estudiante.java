package ejercicio3;

public class Estudiante {
	private String nombre;
	private int edad;
	private double calificacion;
	
	//Constructor
	public Estudiante(String nombre, int edad, double calificacion) {
		this.nombre = nombre;
		setEdad(edad);
		setCalificacion(calificacion);
	}
	
	// getter para el atributo nombre
	public String getNombre() {
		return nombre;
	}
	// setter para nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// getter para edad
	public int getEdad() {
		return edad;
	}
	// setter para edad
	public void setEdad(int edad) {
		if (edad > -1) {
			this.edad = edad;
		}else {
			System.out.println("La edad tiene que ser un entero positivo.");
		}
		
	}
	// getter para calificacion
	public double getCalificacion() {
		return calificacion;
	}
	// setter para calificacion
	public void setCalificacion(double calificacion) {
		if (0 <= calificacion && calificacion <= 100) {
			this.calificacion = calificacion;
		}else {
			System.out.println("La calificación debe estar en el rango 0 a 100");
		}
	}
	
	
}
