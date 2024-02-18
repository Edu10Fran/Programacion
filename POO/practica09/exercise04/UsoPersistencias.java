package exercise04;

public class UsoPersistencias {
	public static void main(String[] args) {
		// Instanciamos un objeto de la clase Persistencia Archivo
		PersistenciaArchivo persistenciaArchivo = new PersistenciaArchivo();
		persistenciaArchivo.cargarDatos();
		persistenciaArchivo.guardarDatos("Documento de identidad");
		// Instanciamos un objeto de la clase Persistencia Base de Datos
		PersistenciaBaseDatos persistenciaBaseDatos = new PersistenciaBaseDatos();
		persistenciaBaseDatos.cargarDatos();
		persistenciaBaseDatos.guardarDatos("Usuario 10");
	}
}
