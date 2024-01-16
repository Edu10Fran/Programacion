package ejercicio3;

public class UsoEstudiante {
	public static void main(String[] args) {
        // Instanciamos un objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante("José López", 20, 85.5);

        // Imprimimos los datos iniciales del estudiante
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Calificación: " + estudiante.getCalificacion());

        // Establecemos una edad negativa
        estudiante.setEdad(-5);

        // Establecemos una calificación fuera del rango
        estudiante.setCalificacion(110.0);

        // Establecemos nuevos valores válidos
        estudiante.setEdad(21);
        estudiante.setCalificacion(90.0);

        // Imprimimos los nuevos datos del estudiante
        System.out.println("Nueva Edad: " + estudiante.getEdad());
        System.out.println("Nueva Calificación: " + estudiante.getCalificacion());
    }
}
