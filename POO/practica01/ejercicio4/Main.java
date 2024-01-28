package ejercicio4;

public class Main {
	public static void main(String[] args) {
		// Instanciamos un objeto de la clase Reloj
		Reloj reloj = new Reloj();
		
		// Mostramos si el reloj es digital y su precio
		System.out.println("El reloj" + (reloj.digital ? " es digital " : " no es digital ")
				+ "y tiene un precio de " + reloj.precio + "€");	
	}
}
