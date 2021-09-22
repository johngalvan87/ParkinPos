package Parkin;

import java.util.Date;

public class PlantillaFacturas {
	static Date f;			
		public void imprimirFactura(int impFactura) {
			
			f = new Date ();				
			String razonSocial = "Parkin City";
			String nit = "901279765-2";
			String telefono ="(601) 6904563";
			String direccion ="Cra 15 # 118 - 41";
			int fDia = f.getDate();
			int fMes= f.getMonth();
			int fAno = f.getYear();
		
			switch (impFactura) {
			case 1:			
			System.out.println("	!		"+razonSocial+"		!");
			System.out.println("	!	      Nit."+nit+"		!");
			System.out.println("	!	       "+telefono+"		!");
			System.out.println("	!	 Factura de Venta No:"+direccion+"	!");
			System.out.println("	!	 Direccion:"+direccion+"	!");
			System.out.println("	!	   Fecha Factura:"+fDia+"/"+fMes+"/"+fAno+"	!");		
			System.out.println("	!=======================================!	");
			
			}
		}
	}
