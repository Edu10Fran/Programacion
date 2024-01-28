package ejercicio1;

public class Main {
	public static void main(String[] args) {
		// Instanciamos un objeto de la clase Lampara
		Lampara lampara = new Lampara();
		
		// Imprimimos sus atributos
		System.out.println("La lámpara es de tipo " + lampara.tipo);
		System.out.println("Tiene una potencia de " + lampara.potencia + "W");
		System.out.println("Es de color " + lampara.color);
	}
}
