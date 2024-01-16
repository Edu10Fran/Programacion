package ejercicio2;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	
	//Constructor 
	public CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		// Usamos el método setter del atributo saldo para validar.
		setSaldo(saldo);
	}
	
	// getter para titular
	public String getTitular() {
		return titular;
	}
	
	// setter para titular
	public void setTitular(String newTitular) {
		this.titular = newTitular;
	}
	
	// getter para saldo 
	public double getSaldo() {
		return saldo;
	}
	// setter para saldo
	public void setSaldo(double newSaldo) {
		if (newSaldo >= 0) {
			this.saldo = newSaldo;
		}else {
			System.out.println("El saldo no puede ser negativo.");
		}
	}
}
