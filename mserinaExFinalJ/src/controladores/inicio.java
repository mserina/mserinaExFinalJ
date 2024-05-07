package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.citasDto;
import dtos.clienteDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperacionFicheroImplementacion;
import servicios.OperacionFicheroInterfaz;

/**
 * Clase principal del programa
 * msm - 070524
 */
public class inicio {

	public static String rutaLog = "";
	public static Scanner sc = new Scanner(System.in);
	public static List<clienteDto> clientesLista = new ArrayList<clienteDto>();  
	public static List<citasDto> citasLista = new ArrayList<citasDto>();  


	
	/**
	 * Metodo que contiene el flujo de la aplicacion
	 * msm - 070524
	 * @param args
	 */
	public static void main(String[] args) {
		
		int opcionSeleccionada;
		boolean cerrarMenu = false;
		
		//OBJETOS
		MenuInterfaz mi = new MenuImplementacion();
		OperacionFicheroInterfaz of = new OperacionFicheroImplementacion();
		
		
		rutaLog = of.nombreLog();
	
		while(!cerrarMenu) {
			
			try 
			{
				opcionSeleccionada = mi.mostrarMenu();
				switch(opcionSeleccionada) 
				{
				case 0:
					String texto0 = "Se ha cerrado la apliacion";
					of.escribirFichero(texto0);
					cerrarMenu = true;
					break;
				case 1:
					String texto1 = "Se ha abierto el menu de clientes";
					of.escribirFichero(texto1);
					mi.implementacionMenuCliente();
					break;
				case 2:
					String texto2 = "Se ha abierto el menu de empleados";
					of.escribirFichero(texto2);
					mi.implementacionMenuEmpleado();
					break;
				}
			}
			catch(Exception e) 
			{
				String texto0 = "ERROR[]: " + e.getMessage();
				of.escribirFichero(texto0);
			}
			
		}
	}
}
