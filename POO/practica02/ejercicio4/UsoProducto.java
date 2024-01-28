package ejercicio4;

public class UsoProducto {
	public static void main(String[] args) {
        // Instanciamos un objeto de la clase Producto
        Producto producto = new Producto("Laptop", 1200.0, 10);

        // Imprimimos los datos iniciales del producto
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock());

        // Intentamos establecer un stock negativo
        producto.setStock(-5);

        // Establecemos nuevos valores válidos
        producto.setPrecio(1300.0);
        producto.setStock(20);

        // Imprimimos los nuevos datos del producto
        System.out.println("Nuevo Precio: " + producto.getPrecio());
        System.out.println("Nuevo Stock: " + producto.getStock());
    }
}
