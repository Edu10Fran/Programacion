package ejercicio2;

public class UsoCuentaBancaria {
	public static void main(String[] args) {
		// Instanciamos un objeto de la clase CuentaBancaria
		CuentaBancaria cuenta = new CuentaBancaria("Pedro Caballero", 1000.0);
		
		// Imprimimos el titular de la cuenta
		System.out.println("Titular: " + cuenta.getTitular());
        // Imprimimos el saldo inicial
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        // Intentamos establecer un saldo negativo
        cuenta.setSaldo(-500.0);

        // Establecemos un nuevo saldo válido
        cuenta.setSaldo(1500.0);
        System.out.println("Nuevo saldo: " + cuenta.getSaldo());
	}
	
}
