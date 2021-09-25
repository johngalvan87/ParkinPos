package Parkin;


import java.util.List;
import java.util.Scanner;

public class Pruebas {
	static PlantillaFacturas impFactura;
	static Scanner s;
	static Bdparkin Bd;
	static List<String> vehiculo;
	public static void main(String[] args) {
		impFactura = new PlantillaFacturas();
		Bd = new Bdparkin();
		s = new Scanner (System.in);
		
		int operacion = 0;		
		String nuevoVehiculo,tipoVehiculo,placa,horaIngreso;
		String salidaVehiculo;
		
		operacion = Menu.menuOperaciones();
		
		while (operacion <4) {
			System.out.println("entro al ciclo");
			
			switch (operacion) {
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
				System.out.println("Hora ingreso: ");
				horaIngreso = s.next();				
						
				nuevoVehiculo = (tipoVehiculo+";"+placa+";"+horaIngreso);
				Bd.ingresarVehiculo(Constantes.RUTA_ARCHIVOS,Constantes.BASE_DATOS,nuevoVehiculo);
				operacion =0;
				operacion = Menu.menuOperaciones();
				break;
				
			case 2:
				int factura1 =0;
				String impFact= "";
				vehiculo = Bd.consultarBd(Constantes.RUTA_ARCHIVOS,Constantes.BASE_DATOS);
				System.out.println(vehiculo);
				System.out.println("Imprime Factura: S/N");
				impFact = s.next();
				if (impFact == "S"){
					factura1 = PlantillaFacturas.factura();
					System.out.println(factura1);
				}else {
					operacion = 0;
					operacion = Menu.menuOperaciones();
				}
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




