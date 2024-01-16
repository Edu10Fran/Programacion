package ejercicio1;

public class Automovil {
	private String marca;
	private String modelo;
	
	// Constructor
	public Automovil(String marca, String modelo) {
		this.marca = marca;
		setModelo(modelo);
	}
	// geter para el atributo marca
	public String getMarca() {
		return marca;
	}
	// setter para el atributo marca
	public void setMarca(String newMarca) {
		marca = newMarca;
	}
	// getter para el atributo modelo
	public String getModelo() {
		return modelo;
	}
	
	// setter para el atributo modelo
	public void setModelo(String newModelo) {
		if (newModelo == null) {
			System.out.println("El modelo no puede ser de tipo null");
		}else if (newModelo.isEmpty()) {
			System.out.println("El modelo no puede ser un string vacío.");
		}else {
			this.modelo = newModelo;
		}
	}
}
