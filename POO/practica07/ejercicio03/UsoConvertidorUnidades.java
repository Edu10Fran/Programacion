package ejercicio03;

import javax.swing.JOptionPane;
public class UsoConvertidorUnidades {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "2 km equivalen a " + ConvertidorUnidades.convertirKilometrosAMillas(2) + " Millas");
		JOptionPane.showMessageDialog(null, "40 Celsius equivalen a " + ConvertidorUnidades.convertirCelsius_a_Fahrenheit(40) + " Fahrenheit");
	}
}
