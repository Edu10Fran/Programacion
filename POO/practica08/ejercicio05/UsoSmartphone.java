package ejercicio05;

import javax.swing.JOptionPane;

public class UsoSmartphone {
	 public static void main(String[] args) {
		// Crear un objeto Smartphone
		Smartphone miSmartphone = new Smartphone("Samsung", 2023);
		miSmartphone.fabricante = "Julia";
		// He usado protected para demostrar que no es seguro 
		// cuando tenemos la clase Main "UsoSmartphone" en el mismo paquete
		JOptionPane.showMessageDialog(null, miSmartphone.dimeFabricante());
		// Llamar y recibir llamadas
		miSmartphone.llamar("123456789");
		miSmartphone.recibirLlamadas("123456789");
		// Instalar una aplicación
		miSmartphone.instalarAplicacion("WhatsApp");
	 }
}
