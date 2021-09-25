package Parkin;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

import java.time.format.DateTimeFormatter;

public class PlantillaFacturas {
	static SimpleDateFormat formato;
	static Scanner s;			
	
	public static void factura() {
		
		
		LocalTime h = LocalTime.now();
		LocalDate f = LocalDate.now();
		String razonSocial = "Parkin City";
		String nit = "901279765-2";
		String telefono ="(601) 6904563";
		String direccion ="Cra 15 # 118 - 41";
		LocalDate fechAct = f;
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss");
		String horAct = tf.format(h);
		
			System.out.println("		!*****************************************!	");		
			System.out.println("		!		"+razonSocial+"		  !");
			System.out.println("		!	      Nit."+nit+"		  !");
			System.out.println("		!	       "+telefono+"		  !");
			System.out.println("		!	 Factura de Venta No:  	  !");
			System.out.println("		!	 Direccion:"+direccion+"	  !");
			System.out.println("		!	Fecha: "+fechAct+" Hora: "+horAct+"  !");
			System.out.println("		!=========================================!	");
			System.out.println("		!T.Vehiculo: "+      "		Placa/doc: "+   "	  !");
			System.out.println("		!    Hora	 Hora	       Tiempo	  !");
			System.out.println("		!  Ingreso	Salida		Total	  !");
			System.out.println("		!  "+horAct+"	"+horAct+" "+"	t-58"+"	  !");
			System.out.println("		!=========================================!	");
			System.out.println("		!    tiempo	 Vlr.	       Total	  !");
			System.out.println("		!    total	Tarifa	     Ant. Iva	  !");
			System.out.println("		!    "+Pruebas.vehiculo+"	  !");
			System.out.println("		!    "+"calculo"+"	val-t"+"	operacion"+"	  !");
			System.out.println("		!=========================================!	");
			System.out.println("		!   	 Sub Total:		"+"valor"+"	  !");
			System.out.println("		!	       iva:		"+"  Total	  !");
			System.out.println("		!    	     Total:	"+"	 Total	  !");
			System.out.println("		!      Cancela con:		 Total	  !");
			System.out.println("		!           Cambio:		 Total	  !");
			System.out.println("		!       				  !");
			System.out.println("		!=========================================!	");
			System.out.println("		!     	      Base Gravabe.		  !");
			System.out.println("		!%Iva"+"		"+"valor base	"+"valor iva !");
			System.out.println("		!=========================================!	");	
			}
	}
	
			

