package exercise02;

public class UsoRectangulo {
	public static void main(String [] args) {
		// Usando el constructor vacio
		Rectangulo rectangulo1 = new Rectangulo();
		rectangulo1.calcularArea();
		// Usando el constructor que recibe los dos atributos en double
		Rectangulo rectangulo2 =  new Rectangulo(8.4, 10.2);
		rectangulo2.calcularArea();
		// Usando el constructor que recibe los dos atributos en entero
		Rectangulo rectangulo3 = new Rectangulo(8, 10);
		rectangulo3.calcularArea();
		
		System.out.println(rectangulo1);
		System.out.println(rectangulo2);
		System.out.println(rectangulo3);
	}
}
