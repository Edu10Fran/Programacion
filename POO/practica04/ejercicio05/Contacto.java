package ejercicio05;
public class Contacto {
	private String nombre;
	private String numTelefono;
	private String email;
	// Constructor con parametros
	public Contacto(String nombre, String numTelefono, String email) {
		establecerNombre(nombre);
		establecerTelefono(numTelefono);
		establecerEmail(email);
	}
	// getter and setter para nombre
	public String dimeNombre() {
		return this.nombre;
	}
	public void establecerNombre(String newName) {
		this.nombre = newName;
	}
	// getter and setter para número de télefono
	public String dimeTelefono() {
		return this.numTelefono;
	}
	public void establecerTelefono(String newNumberTelephone) {
		this.numTelefono = newNumberTelephone;
	}
	// getter and setter para email
	public String dimeEmail() {
		return this.email;
	}
	public void establecerEmail(String newEmail) {
		this.email = newEmail;
	}
	// Método to String para mostrar el contacto
	public String toString() {
		String resultado = "Contacto: " + this.nombre;
		resultado += "\nTeléfono: " + this.numTelefono;
		resultado += "\nEmail: " + this.email + "\n";
		resultado += "----------------------------------------------\n";
		return resultado;
	}
}

