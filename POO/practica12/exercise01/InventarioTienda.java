package exercise01;
import java.util.*;

import javax.swing.JOptionPane;
public class InventarioTienda {
	private List<Inventariable> inventario;
	
	// Constructor
	public InventarioTienda() {
		this.inventario = new ArrayList<>();
	}
	// Método para agregar el producto
	public void agregarProducto() {
		Producto product = crearProducto();
		if (searchProductName(product.dimeNombre()) == null) {
			inventario.add(product);
		}else {
			JOptionPane.showMessageDialog(null, "No se puede agregar dos veces el mismo producto");
		}
	}
	// Método para crear un producto
	private Producto crearProducto() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
		int stock = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
		double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio"));
		return new Producto(nombre, stock, precio);
	}
	// Método para eliminar un producto
	public void eliminarProducto() {
		String nameProduct = JOptionPane.showInputDialog("Ingrese el nombre del producto");
		Producto product = searchProductName(nameProduct);
		if ( product != null) {
			//Removemos dicho producto
			inventario.remove(product);
		}else {
			JOptionPane.showMessageDialog(null, "El producto buscado no existe");
		}
		// Si llega hasta aquí el flujo tenemos que indicar mediante un mensaje
	}
	// Método para acturalizar stock de un producto por su nombre
	public void actualizarStockProduct() {
		String nameProduct = JOptionPane.showInputDialog("Ingrese el nombre del producto");
		Producto product = searchProductName(nameProduct);
		if ( product != null) {
			//Actualizamos el stock de dicho producto
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad para actualizar el stock"));
			product.actualizarStock(cantidad);
			product.actualizarPrecioStock();
		}else {
			JOptionPane.showMessageDialog(null, "El producto buscado no existe");
		}
	}
	// Método para buscar producto por nombre
	public Producto searchProductName(String nameProduct) {
		if (nameProduct != null && !nameProduct.isEmpty()) {
			for (Inventariable product : inventario) {
				if (((Producto) product).equalsName(nameProduct)) {
					return ((Producto)product);
				}
			}
		}
		return null;
	}
	// Método para mostrar Inventario
	public void mostrarInventario() {
		StringBuilder productos = new StringBuilder();
		int contador = 0;
		for (Inventariable product : inventario) {
			if (contador == 3) {
				productos.append("\n");
				contador = 0;
			}
			productos.append(product + "\t");
		}
		JOptionPane.showMessageDialog(null, productos.toString());
	}
}
