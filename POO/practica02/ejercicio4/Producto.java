package ejercicio4;

public class Producto {
	private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        setStock(stock); 
    }

    // Getter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo precio
    public double getPrecio() {
        return precio;
    }

    // Setter para el atributo precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter para el atributo stock
    public int getStock() {
        return stock;
    }

    // Setter para el atributo stock 
    public void setStock(int stock) {
        // Verificamos que el stock no sea un número negativo
        if (stock > -1) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser un número negativo.");
        }
    }
}
