package ejercicio04;

import javax.swing.JOptionPane;
import java.util.*;
public class UsoProducto {
	public static void main(String[] args) {
		List<Producto> listaProductos= new ArrayList<>();
		int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos vas a cargar en la lista de inventarios?"));
		JOptionPane.showMessageDialog(null, "El sistema solo va a cargar el producto si sus datos son correctos");
		String resultado = "";
		for (int i = 0; i < cantidadProductos; i++) {
			Producto producto = registrarProducto();
			if (producto != null) {
				listaProductos.add(producto);
				resultado += producto;
			}
		}
		
		// Mostramos un resumen del inventario
		if (listaProductos.size() > 0) {
			resultado = "Lista de inventarios\n"
					+ "----------------------------------------\n"
					+ resultado;
			JOptionPane.showMessageDialog(null, resultado);		
		}else {
			JOptionPane.showMessageDialog(null, "No hay productos en la lista de inventarios");
		}
	}
	private static Producto registrarProducto() {
		try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            if (nombre == null) {
            	JOptionPane.showMessageDialog(null, "El nombre no puede ser nulo");
            	// El usuario cerró la ventana de entrada de datos
            	return null; // Otra opción podría ser lanzar una excepción aquí
            }
            if (nombre.isEmpty()) {
            	JOptionPane.showMessageDialog(null, "El nombre no puede ser un string vacío");
            	return null;
            }
            
            String cantiadadString = JOptionPane.showInputDialog("Ahora ingrese la cantidad:");
            if (cantiadadString == null) {
                // El usuario cerró la ventana de entrada de datos
                return null; // Otra opción podría ser lanzar una excepción aquí
            }
            int cantidad = Integer.parseInt(cantiadadString);

            String precioString = JOptionPane.showInputDialog("Ingrese el precio:");
            if (precioString == null) {
                // El usuario cerró la ventana de entrada de datos
                return null; // Otra opción podría ser lanzar una excepción aquí
            }
            double precio = Integer.parseInt(precioString);
            return new Producto(nombre, cantidad, precio);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Formato inadecuado, tiene que ser un número entero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // En caso de excepción, retornar un valor predeterminado o null
        return null;
	}
}
