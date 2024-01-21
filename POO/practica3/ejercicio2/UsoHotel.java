package ejercicio2;
public class UsoHotel {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		Habitacion h1 = new Habitacion(101, "simple");
		// Aquí tiene que crear por defecto una habitación de tipo simple.
		Habitacion h2 = new Habitacion(102, "doble");
		Habitacion h3 = new Habitacion(103, "suite");
		Habitacion h4 = new Habitacion(103, "suite");

		// Añadir habitaciones al hotel
		hotel.construirHabitacion(h1);
		hotel.construirHabitacion(h2);
		hotel.construirHabitacion(h3);
		// Ya existe dicha habitación
		hotel.construirHabitacion(h4);
		// Mostramos la cantidad de habitaciones.
		System.out.println("El hotel cuenta con " + hotel.dimeCantidadHabitaciones() + " habitaciones.");
		// Reservar una habitación
		hotel.reservarHabitacion(101);
		// No existe dicha habitación
		hotel.cancelarReserva(108);
		// No está reservada dicha habitación
		hotel.cancelarReserva(102);
		// Ya está reservada dicha habitación
		hotel.reservarHabitacion(101);
		// Vamos a cancelar reserva
		hotel.cancelarReserva(101);
		// Ahora vamos a volver a reservar 
		hotel.reservarHabitacion(101);
		// Ahora vemos cuantas habitaciones Disponibles tiene el hotel
		System.out.println(hotel.dimeCantidadHabitacionesDisponibles() + " habitaciones disponibles.");
		// Ahora vemos cuantas habitaciones Ocupadas tiene el hotel.
		System.out.println(hotel.dimeCantidadHabitacionesOcupadas() + " habitaciones ocupadas.");

	}
}
