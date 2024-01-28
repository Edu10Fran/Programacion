package ejercicio2;
import java.util.*;
import java.util.Map.Entry;

public class Hotel {
	private List<Habitacion> habitaciones;

	// Constructor
	public Hotel() {
		this.habitaciones = new ArrayList<>();
	}

	// Método para reservar habitación
	public void reservarHabitacion(int numeroHabitacion) {
		// Teniendo en cuenta que solo tenemos un elemento.
		Entry<Integer, Boolean> entry = comprobarDiponibilidad(numeroHabitacion).entrySet().iterator().next();
		int clave = entry.getKey();
		boolean valor = entry.getValue();
		if (valor && clave != -1) {
			habitaciones.get(clave).cambiarEstado(valor);
			System.out.println("Habitación " + numeroHabitacion + " reservada");
		} else if (clave != -1 && !valor) {
			System.out.println("La habitación " + numeroHabitacion + " no está disponible");
		}
	}

	public void cancelarReserva(int numeroHabitacion) {
		// Teniendo en cuenta que solo tenemos un elemento.
		Entry<Integer, Boolean> entry = comprobarDiponibilidad(numeroHabitacion).entrySet().iterator().next();
		int clave = entry.getKey();
		boolean valor = entry.getValue();
		if (!valor && clave != -1) {
			habitaciones.get(clave).cambiarEstado(valor);
			System.out.println("Habitación " + numeroHabitacion +" reserva cancelada");
		} else if (clave != -1) {
			System.out.println("La habitación " + numeroHabitacion + " no está reservada");
		}
	}

	// Método para comprobar diponibilidad.
	// Retorna la posición de la habitación en la lista y su estado
	private Map<Integer, Boolean> comprobarDiponibilidad(int numHabitacion) {
		Map<Integer, Boolean> map = new HashMap<>();
		if (numHabitacion > 0) {
			for (int i = 0; i < habitaciones.size(); i++) {
				Habitacion habitacion = habitaciones.get(i);
				if (habitacion.dimeNumHabitacion() == numHabitacion) {
					// Cargamos la posición de la habitación en la lista como clave y el estado como
					// valor.
					map.put(i, !habitacion.dimeEstado());
					return map;
				}
			}
		}
		// En caso de que no exista la habitación.
		System.out.println("No existe la habitación " + numHabitacion);
		map.put(-1, false);
		return map;
	}

	// Método para cargar habitación
	public void construirHabitacion(Habitacion habitacion) {
		if (!verificarHabitacion(habitacion) && habitacion != null && habitacion.dimeNumHabitacion() > 0) {
			this.habitaciones.add(habitacion);
		} else {
			System.out.println("Ya existe una habitación con el mismo número y tipo.");
		}
	}

	// Método que verifica si ya existe otra habitación con el mismo número y tipo.
	private boolean verificarHabitacion(Habitacion otherHabitacion) {
		for (Habitacion hab : habitaciones) {
			if (hab.equals(otherHabitacion)) {
				return true;
			}
			;
		}
		return false;
	}

	// Método para saber cuantas habitaciones hay en total. Método extra.
	public int dimeCantidadHabitaciones() {
		return this.habitaciones.size();
	}
	// Método extra para saber cuantas habitaciones disponibles hay.
	public int dimeCantidadHabitacionesDisponibles() {
		int contador = 0;
		for (Habitacion habitacion : habitaciones) {
			if (!habitacion.dimeEstado()) {
				contador ++;
			}
		}
		return contador;
	}
	// Método extra para saber cuantas habitacines ocupadas hay.
	public int dimeCantidadHabitacionesOcupadas() {
		int cantidad = 0;
		for (Habitacion habitacion : habitaciones) {
			if (habitacion.dimeEstado()) {
				cantidad ++;
			}
		}
		return cantidad;
	}
}