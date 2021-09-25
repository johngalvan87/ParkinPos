package Parkin;

import java.util.Scanner;


public class Menu {
	
	static Scanner s;
	static Facturar f;
	
	public static int menuOperaciones() {		
			s = new Scanner (System.in);
			
			int operacion= 0;
			while(operacion < 1 || operacion > 4) {
				System.out.println("Que desea hacer: \n");
				System.out.println("1. Ingreso Nuevo Vehiculo: ");
				System.out.println("2. Facturar Parqueo");
				System.out.println("3. Total Ventas del Dia");
				System.out.println("4. Salir\n");
				operacion = s.nextInt();
			}
			return operacion;
			}
	public static String tipoVehiculo( ) {		
		String tVehiculo = "";
		int tV= 0;
		while(tV < 1 || tV > 4) {
			System.out.println("1. Carro.");
			System.out.println("2. Moto.");
			System.out.println("3. Bicicleta");
			System.out.println("4. Salir\n");
			tV = s.nextInt();
			switch (tV) {
				case 1:
				tVehiculo = "CARRO";
				break;
				case 2:
					tVehiculo = "MOTO";
					break;
				case 3:
					tVehiculo = "BICICLETA";
					break;					
				
				default:
					System.out.println("opcion invelida");
					break;
			}
				return tVehiculo;		
			}
		return tVehiculo;
		
		}

		public static int menuTarifa(){
			
			int operacion = 0;
			while(operacion < 1 || operacion > 4) {
				System.out.println("Elija tipo de vehiculo: \n");
				System.out.println("1. Carro");
				System.out.println("2. Moto");
				System.out.println("3. Bicicleta");
				System.out.println("4. Salir");
				operacion = s.nextInt();
			}
			return operacion;
			}
	
}

