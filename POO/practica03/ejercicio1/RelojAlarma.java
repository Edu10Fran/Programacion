package ejercicio1;
import java.util.*;
public class RelojAlarma {
	private Date horaAlarma;
	private Date horaActual;
	private boolean activada;
	
	// Constructor 
	public RelojAlarma() {
		horaAlarma = new Date();
		horaActual = new Date();
		activada = false;
	}
	
	// método modificar horaAlarama
	public void establecerHoraAlarma() {
		System.out.println("--------------------------------------");
		System.out.println("Para establecer la hora de la alarma.");
		this.horaAlarma = configurarReloj();
		System.out.println("--------------------------------------\n");

	}
	// Método modificar horaActual
	public void actualizarHoraActual() {
		System.out.println("--------------------------------------");
		System.out.println("Para actualizar la hora actual.");
		this.horaActual = configurarReloj();
		System.out.println("--------------------------------------\n");
	}
	
	// Método para configurar, es extra
	private static Date configurarReloj() {
	    Scanner sc = new Scanner(System.in);
	    int horas = 00, minutos = 00;
	    Date fechaAhora = new Date();
	    try {
	        // do-while para las horas
	        do {
	            System.out.println("Ingrese la hora de 00 a 23 hs");
	            horas = sc.nextInt();
	            sc.nextLine();
	        } while (horas < 0 || horas > 23);

	        // do-while para los minutos
	        do {
	            System.out.println("Ingrese los minutos de 00 a 59 minutos");
	            minutos = sc.nextInt();
	            sc.nextLine();
	        } while (minutos < 0 || minutos > 59);
	        //Actualizamos la hora y los minutos.
	        fechaAhora.setHours(horas); fechaAhora.setMinutes(minutos);
	        return fechaAhora;

	    } catch (Exception e) {
	        // Manejo de excepciones
	        System.out.println("Error al configurar el reloj: " + e.getMessage());
	        // Retornamos la fecha y hora del sistema
	        return fechaAhora;
	    }
	}
	// Método para activar Alarama
	public void activarAlarma() {
		this.activada = true;
	}
	// Método para desactivar Alarma
	public void desactivarAlarma() {
		this.activada = false;
	}
	
	// Método que verifica si está sonando o no
	public void comprobarAlarma() {
		if (this.activada) {
			if ((this.horaAlarma.getHours() == this.horaActual.getHours()) && (this.horaAlarma.getMinutes() == this.horaActual.getMinutes())) {
				System.out.println("Alarma sonando...");
			}else {
				System.out.println("La hora de la alarma no coincide con la hora actual.");
			}
		}else {
			System.out.println("La alarma no está activada.");
		}
	}
}
