package Parkin;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class Pruebas {
	static Scanner s;
	static Bdparkin Bd;
	static List<String> vehiculo;
	public static void main(String[] args) {
		
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss");	
		PlantillaFacturas impFactura = new PlantillaFacturas();
		Bd = new Bdparkin();
		s = new Scanner (System.in);
		
		int operacion = 0;
		LocalTime h = LocalTime.now();
		LocalDate f = LocalDate.now();
		String nuevoVehiculo,tipoVehiculo,placa,horaIngreso;
		String salidaVehiculo;
		horaIngreso = tf.format(h);	
		
		operacion = Menu.menuOperaciones();
		
		while (operacion <4) {
			System.out.println("entro al ciclo");
			
			switch (operacion) {
			
			//INGRESO DE VEHICULOS
			case 1:
				System.out.println("Digite los datos solicitados: ");
				System.out.println("Tipo Vehiculo: ");								
				tipoVehiculo = Menu.tipoVehiculo();
				if(tipoVehiculo == "BICICLETA") {
					System.out.println("NUMERO DE TARJETA PROPIEDAD: ");
					}else {
						System.out.println("Placa: ");
				}
				placa = s.next();
						
				nuevoVehiculo = (tipoVehiculo+";"+placa+";"+horaIngreso);
				Bd.ingresarVehiculo(Constantes.RUTA_ARCHIVOS,Constantes.BASE_DATOS,nuevoVehiculo);
				operacion =0;
				operacion = Menu.menuOperaciones();
				break;
				
				//FACTURAR E IMPRIMIR FACTURA
			case 2:
				String sel = "S";
				String impFact;
				vehiculo = Bd.consultarBd(Constantes.RUTA_ARCHIVOS,Constantes.BASE_DATOS);
				System.out.println(vehiculo);
				System.out.println("Imprime Factura: S/N \n");
				impFactura.factura();
						
				operacion = 0;
				
				operacion = Menu.menuOperaciones();
				break;
			
			default:
				System.out.println("opcion novalida");
				break;
				}
			}
		
		}
		
}




