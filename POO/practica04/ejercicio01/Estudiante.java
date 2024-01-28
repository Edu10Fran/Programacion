package ejercicio01;

public class Estudiante {
	private String nombre;
	private int edad;
	private String grado;
	
	// Constructor con parametros
	public Estudiante(String nombre, int edad, String grado) {
		this.nombre = nombre;
		establecerEdad(edad);
		establecerGrado(grado);
	}
	public String dimeNombre() {
		return nombre;
	}
	public void establecerNombre(String newName) {
		this.nombre = newName;
	}
	// getter y setter para la edad
	public int dimeEdad() {
		return edad;
	}
	public void establecerEdad(int nuevaEdad) {
		if (nuevaEdad >= 0) {
	        this.edad = nuevaEdad;
	    }else {
	        // En este ejemplo, lanzaremos una excepción para indicar que la edad no puede ser negativa.
	        throw new IllegalArgumentException("La edad no puede ser negativa");
	    }
	}
	// getter y setter parar grado
	public String dimeGrado() {
		return grado;
	}
	public void establecerGrado(String nuevoGrado) {
		this.grado = nuevoGrado;
	}

	public String toString() {
		StringBuilder auxiliar = new StringBuilder();
		auxiliar.append("Nombre del estudiante: " + this.nombre + "\n");
		auxiliar.append("Edad: " + this.edad + "\n");
		auxiliar.append("Grado: " + this.grado + "\n");
		auxiliar.append("-----------------------------------------------------------\n");		
		String resultado = auxiliar.toString();
		return resultado;
	}
}

