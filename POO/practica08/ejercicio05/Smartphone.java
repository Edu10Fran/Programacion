package ejercicio05;
import javax.swing.JOptionPane;
public class Smartphone extends DispositivoElectronico implements Telefono {

	protected Smartphone(String fabricante, int yearFabricacion) {
		super(fabricante, yearFabricacion);
	}

	// Implementación del método de la interfaz Telefono
	@Override
	public void llamar(String numero) {
		JOptionPane.showMessageDialog(null, "Llamando a: " + numero);	
	}
	
	// Implementación de método de la interfaz Telefono
	@Override
	public void recibirLlamadas(String numero) {
		JOptionPane.showMessageDialog(null, "Recibiendo llamada de " + numero);
	}
	// Método propio de Smartphone
    public void instalarAplicacion(String aplicación) {
        JOptionPane.showMessageDialog(null,"Instalando la aplicación: " + aplicación);
    }
}
