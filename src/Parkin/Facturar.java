package Parkin;

import java.util.List;
import java.util.Scanner;


public class Facturar {
	
	static Scanner s;
	static PlantillaFacturas f;
	static Menu MenuOpciones;
	static Bdparkin Bd;
	static List<String> vehiculo;

	public static void main(String[] args) {
		s = new Scanner (System.in);
		MenuOpciones = new Menu();
		f = new PlantillaFacturas();
				
		int operacion = Menu.menuOperaciones();
		int tipoVehiculo;		
		int impFactura = 1;
		int tarifa = 0;
		int carro = 0;
		int moto = 0;
		int bicicleta;
		int hora =0;
		int minuto =0;	
		String placa;
		String nuevoVehiculo,fraVehiculo;
		String horaIngreso,horaSalida = (hora+":"+minuto);
		

		
		operacion = Menu.menuOperaciones();
		
		while (operacion >= 1 && operacion <=3) {
			if (operacion == 1) {
				System.out.println("Digite los datos solicitados: \n");
				tipoVehiculo = Menu.menuTarifa();
				System.out.println("Digite la placa O Numero de tarjeta propiedad para las bicicletas: \n");
				placa = s.next();
				System.out.println("Hora de ingreso: ");
				horaIngreso = s.next();
				if (tipoVehiculo == 1) {
					nuevoVehiculo = ("Carro"+placa+"-"+horaIngreso);
					switch (operacion) {
					case 1:
						Bd.ingresarVehiculo(Constantes.RUTA_ARCHIVOS,Constantes.BASE_DATOS,nuevoVehiculo);
						
						break;
					case 2:
						nuevoVehiculo = ("Moto"+placa+"-"+horaIngreso);
						Bd.ingresarVehiculo(Constantes.RUTA_ARCHIVOS,Constantes.BASE_DATOS,nuevoVehiculo);
						
						break;
						
					case 3:						
						nuevoVehiculo = ("Bicicleta"+placa+"-"+horaIngreso);
						Bd.ingresarVehiculo(Constantes.RUTA_ARCHIVOS,Constantes.BASE_DATOS,nuevoVehiculo);
						
						break;
						
						}
				}
			}
			if (operacion == 2) {
				System.out.println("Digite la hora de salida: ");
				horaSalida = s.next();
				vehiculo = Bd.consultarBd(Constantes.RUTA_ARCHIVOS,Constantes.BASE_DATOS);
			}
			int placa = Integer(placa);
			fraVehiculo = vehiculo.get(placa);
			System.out.println(fraVehiculo);
		}
				
		f.imprimirFactura(impFactura);
		
		

	}

	private static int Integer(int placa) {
		// TODO Auto-generated method stub
		return 0;
	}

}
