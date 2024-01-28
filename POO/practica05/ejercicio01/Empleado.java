package ejercicio01;

import java.util.*;
import javax.swing.JOptionPane;
public class Empleado {
	private String nombre;
	private double sueldo;
	private Date fechaContrato;
	
	// Constructor
	public Empleado(String nombre, double sueldo, int year, int month, int day) {
		establecerNombre(nombre);
		establecerSueldo(sueldo);
		establecerFechaContrato(year, month, day);
	}
	// getter and setter para nombre
	public String dimeNombre() {
		return this.nombre;
	}
	public void establecerNombre(String newName) {
		this.nombre = newName;
	}
	// getter and setter para sueldo
	public double dimeSueldo() {
		return this.sueldo;
	}
	public void establecerSueldo(double sueldo) {
		if (sueldo > -1) {
			this.sueldo = sueldo;
		}else {
			JOptionPane.showMessageDialog(null, "El sueldo tiene que mayor o igual a cero.");
		}
		return;
	}
	// getter and setter para la fecha de contrato
	public Date dimeFechaDeContrato() {
		return this.fechaContrato;
	}
	public void establecerFechaContrato(int year, int month, int day) {
		this.fechaContrato = new GregorianCalendar(year, month - 1, day).getTime();
	}
	// Método para umentar el sueldo
	public void subeSueldo(double aumento) {
		if (aumento > 0) {
			this.sueldo += this.sueldo*(aumento*0.01);
		}else {
			System.out.println("El porcentaje debe ser mayor a cero.");
		}
	}
	// Método para mostrar los datos del empleado
	public String toString() {
		String resultado = "Nombre del empleado: " + this.nombre;
		resultado += "\nSueldo: " + this.sueldo;
		resultado += "\nFecha de contrato: " + this.fechaContrato +"\n";
		return resultado;
	}
	// Método para usar en el ejercicio 5
	public String dimeNombreSueldo() {
		String resul = "Nombre: " + this.nombre + "\n";
		resul += "Sueldo: " + this.sueldo + "\n";
		return resul;
	}
}

