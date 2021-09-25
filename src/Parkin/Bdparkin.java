package Parkin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Bdparkin {
	
	// ABRIR ARCHIVO
	
	public void ingresarVehiculo(String ruta, String nombreArchivo, String texto) {
		FileWriter archivo;
		PrintWriter pw;
		
		try {
			//ruta para ubicar el archivo
			archivo = new FileWriter(ruta+nombreArchivo, true);
			//abrir el archivo
			pw = new PrintWriter(archivo);
			//escribir en el archivo
			pw.println(texto);
			// guardar los cambio
			pw.flush();
			//cerrar archivo
			pw.close();
			
		}catch (Exception e) {
			System.out.println("Ha ocurrido un error: "+e.getMessage());
			
		}
	}
	
	// LEER ARCHIVO COMPLETO
	public List<String> consultarBd(String ruta, String nombreArchivo){
		//abrir el archivo
		File archivo;
		
		FileReader fr;
		//leer el archivo linea por linea 
		BufferedReader br;
		//
		List<String> lista = new ArrayList<String>();
		//lugar donde vamos a guardar el texto
		String lineaTexto;
		
		try {
			//encontrar (ubicar) el archivo meriante la ruta
			archivo = new File(ruta+nombreArchivo);			
			// abrir el archivo
			fr = new FileReader(archivo);
			//leer archivo linea por linea
			br = new BufferedReader(fr);
			
			//para que lea todos las linas hasta la ultima se utiliza el ciclo While
			
			while ((lineaTexto = br.readLine())!=null){
				lista.add(lineaTexto);
								
			}
			fr.close();
		}catch (Exception e) {
			System.out.println("Ha ocurrido un error: "+e.getMessage());
		}
		return lista;
	}	
	
	public List<String> horaIngFac(String ruta, String nombreArchivo){
		//abrir el archivo
		File archivo;
		
		FileReader fr;
		//leer el archivo linea por linea 
		BufferedReader br;
		//
		List<String> horaIngFact= new ArrayList<String>();
		//lugar donde vamos a guardar el texto
		String lineaTexto;
		
		try {
			//encontrar (ubicar) el archivo meriante la ruta
			archivo = new File(ruta+nombreArchivo);			
			// abrir el archivo
			fr = new FileReader(archivo);
			//leer archivo linea por linea
			br = new BufferedReader(fr);
			
			//para que lea todos las linas hasta la ultima se utiliza el ciclo While
			
			while ((lineaTexto = br.readLine())!=null){
				
				String [] partes = lineaTexto.split(";");
				horaIngFact.add(partes);
								
			}
			fr.close();
		}catch (Exception e) {
			System.out.println("Ha ocurrido un error: "+e.getMessage());
		}
		return horaIngFact;
	}	
	
}
