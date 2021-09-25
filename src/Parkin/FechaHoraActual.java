package Parkin;

import java.time.LocalDate;
import java.time.LocalTime;

public class FechaHoraActual {

	public static void main(String[] args) {
		LocalTime horaActual = LocalTime.now();
		System.out.println(horaActual);
		LocalDate fechaActual = LocalDate.now();
		System.out.println(fechaActual);
	}

}
