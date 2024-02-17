package exercise03;

public class UsoProducto {
	public static void main(String[] args) {
		// Instanciamos un objeto usando el constructor vacío
		Producto producto1 = new Producto();
		System.out.println(producto1);
		// primer constructor 
		Producto producto2 = new Producto("Lápiz", 2.5, 5);
		System.out.println(producto2);
		System.out.println();
		// Constructor que solo recibe nombre y precio
		Producto producto3 = new Producto("Sudadera", 35);
		System.out.println(producto3);
	}
}