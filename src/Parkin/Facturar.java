package Parkin;

import java.util.Scanner;


public class Facturar {
	
	static Scanner s;
	static PlantillaFacturas f;

	public static void main(String[] args) {
		
		f = new PlantillaFacturas();
		
		int impFactura = 1;
				
		f.imprimirFactura(impFactura);
		
		

	}

}
