package ejercicio01;
import javax.swing.JOptionPane;
import java.util.*;
public class UsoEstudiante {
	public static void main(String[] args) {
		List<Estudiante> listaEstudiantes = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Estudiante estudiante = crearEstudiante();
			if (estudiante != null) {
				listaEstudiantes.add(estudiante);
			}
		}
		String resultado = "";
		for (Estudiante estudiante: listaEstudiantes) {
			resultado += estudiante;
		}
		// Ahora mostramos Los atributos de los estudiantes si hay estudiante.
		if (listaEstudiantes.size() > 0) {
			resultado = "Datos de los estudiantes:\n"
					+ "-----------------------------------------------------------\n" + resultado;
			JOptionPane.showMessageDialog(null, resultado);
		}else {
			JOptionPane.showMessageDialog(null, "No hay ningun estudiante registrado");
		}
	}
    public static Estudiante crearEstudiante() {
        try {
            String nombre = JOptionPane.showInputDialog("Dime el nombre del estudiante:");
            if (nombre == null) {
                return null;
            }
            if (nombre.isEmpty()) {
            	JOptionPane.showMessageDialog(null, "El nombre no puede ser un string vacío");
            	return null;
            }

            String edadString = JOptionPane.showInputDialog("Dime la edad del estudiante:");
            if (edadString == null) {
                return null; 
            }
            int edad = Integer.parseInt(edadString);

            String grado = JOptionPane.showInputDialog("Ingrese el grado del estudiante:");
            if (grado == null) {
                return null; 
            }
            if (grado.isEmpty()) {
            	JOptionPane.showMessageDialog(null, "El grado no puede ser un string vacío.");
            	return null;
            }
            
            return new Estudiante(nombre, edad, grado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa una edad válida.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // En caso de excepción, retornar un valor predeterminado o null
        return null;
    }
}
