package ejercicio1;

public class UsoRelojAlarma {
	public static void main(String[] args) {
        RelojAlarma miReloj = new RelojAlarma();

        // Para establecer la hora de la alarma.
        miReloj.establecerHoraAlarma();

        // Activar la alarma
        miReloj.activarAlarma();
     
        // Actualizar la hora actual
        miReloj.actualizarHoraActual();

        // Comprobar si la alarma está sonando.
        miReloj.comprobarAlarma();
    }
}
