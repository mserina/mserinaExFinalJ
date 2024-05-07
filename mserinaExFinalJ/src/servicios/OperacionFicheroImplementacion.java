package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.inicio;

/**
 * Clase que contiene la logica de los metodos del servicio fichero
 * msm - 070524
 */
public class OperacionFicheroImplementacion implements OperacionFicheroInterfaz{

	inicio i = new inicio();
	FileWriter escribir;
	
	public String nombreLog() {
		
		LocalDate fechaHoy = LocalDate.now();
		/*
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaFormateada = LocalDate.parse(fechaHoy.toString(), formato);
		*/
		
		String rutaLog = "C:\\Users\\csi23-mserina\\Desktop\\FICHEROS\\log-" + fechaHoy + ".txt";
		
		return rutaLog; 
	}
	
	public void escribirFichero(String texto) {
		
		try {
			escribir = new FileWriter(i.rutaLog, true);
			escribir.write(texto + "\n");
			escribir.close();
			
		}
		catch(IOException io) {
			System.out.println(io.getMessage());
		}
		
	}
	
	
	
	
}
