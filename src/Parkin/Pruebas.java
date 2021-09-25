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
		System.out.println("");
		System.out.println("####################################################################################################################################################################################################");
		System.out.println("#!!!!****** Si es la primera vez que se ejecuta el programa en este equipo, asegurese de digitar la ruta donde se creara la base de datos del mismo, en la Clase CONSTANTES RUTA_ARCHIVO******¡¡¡¡#");
		System.out.println("####################################################################################################################################################################################################");
		System.out.println("");
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
				
				int sel = 0;
				String iFact;
				vehiculo = Bd.consultarBd(Constantes.RUTA_ARCHIVOS,Constantes.BASE_DATOS);
				System.out.println(vehiculo);
				System.out.println("¿Imprime Factura?. Digita 1 para si y 2 para no:\n 1 ==> Si\n 2 ==> No");
				sel = s.nextInt();				
				if (sel == 1) {	
					
					impFactura.factura();
					
					}else {	
					
						System.out.println("ENTRO AL ELSE");
						operacion = 0;
				
						operacion = Menu.menuOperaciones();
				}
				break;
			
			default:
				System.out.println("opcion novalida");
				break;
				}
			}
		
		}
		
}




