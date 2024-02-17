package exercise02;

public class UsoVehiculos {
	public static void main(String[] args) {
		// Instanciamos el objeto automovil
		Automovil automovil = new Automovil();
		automovil.acelerar(100);
		automovil.frenar(90);
		// Instanciamos el objeto motocicleta
		Motocicleta motocicleta = new Motocicleta();
		motocicleta.acelerar(120);
		motocicleta.frenar(70);
	}
}
