package servicios;

import controladores.inicio;

/**
 * Clase que contiene la logica de los metodos del servicio menu
 * msm - 070524
 */
public class MenuImplementacion implements MenuInterfaz {

	inicio i = new inicio();
	OperacionInterfaz op = new OperacionImplementacion();
	OperacionFicheroInterfaz of = new OperacionFicheroImplementacion();
	
	//INTERFACES MENU
	public int mostrarMenu() throws Exception{
		
		int opcionSeleccionada;
		
		System.out.println(" ");
		System.out.println("--------MENU PRINCIPAL---------");
		System.out.println("0[] CERRAR");
		System.out.println("1[] CLIENTE");
		System.out.println("2[] EMPLEADOS");
		
		try 
		{
			opcionSeleccionada = i.sc.nextInt();
		}
		catch(Exception e)
		{
			throw e;
		}
		
		return opcionSeleccionada;
	}
	
	private int mostrarMenuCliente() throws Exception{
			
			int opcionSeleccionada;
			
			System.out.println(" ");
			System.out.println("--------MENU CLIENTE---------");
			System.out.println("0[] VOLVER ATRAS");
			System.out.println("1[] REGISTRO CLIENTE");
			System.out.println("2[] SOLICITUD CITA");
			
			try 
			{
				opcionSeleccionada = i.sc.nextInt();
			}
			catch(Exception e)
			{
				throw e;
			}
			
			return opcionSeleccionada;
		}
	
	private int mostrarMenuEmpleado() throws Exception{
		
		int opcionSeleccionada;
		
		System.out.println(" ");
		System.out.println("--------MENU EMPLEADO---------");
		System.out.println("0[] VOLVER ATRAS");
		System.out.println("1[] VALIDAR NUEVO CLIENTE");
		System.out.println("2[] IMPRIMIR CITAS MEDICAS");
		
		try 
		{
			opcionSeleccionada = i.sc.nextInt();
		}
		catch(Exception e)
		{
			throw e;
		}
		
		return opcionSeleccionada;
	}
	
		private int mostrarMenuEspecialidades() throws Exception{
		
			int opcionSeleccionada;
			
			System.out.println(" ");
			System.out.println("--------ESPECIALIDADES---------");
			System.out.println("0[] VOLVER ATRAS");
			System.out.println("1[] PSICOLOGIA");
			System.out.println("2[] TRAUMATOLOGIA");
			System.out.println("3[] FISIOTERAPIA");
			
			try 
			{
				opcionSeleccionada = i.sc.nextInt();
			}
			catch(Exception e)
			{
				throw e;
			}
			
			return opcionSeleccionada;
	}
	
	
	//IMPLEMENTACIONES MENU
	
	public void implementacionMenuCliente() throws Exception{
		int opcionSeleccionada;
		boolean cerrarMenu = false;
		
		
		while(!cerrarMenu) {
			
			try 
			{
				opcionSeleccionada = mostrarMenuCliente();
				switch(opcionSeleccionada) 
				{
				case 0:
					String texto0 = "Se ha vuetlo al menu principal";
					of.escribirFichero(texto0);
					cerrarMenu = true;
					break;
				case 1:
					String texto1 = "Se ha seleciconado registrar clientes";
					of.escribirFichero(texto1);
					op.registroCliente();
					cerrarMenu = true;
					break;
				case 2:
					String texto2 = "Se ha seleccionado la solicitud medica";
					of.escribirFichero(texto2);
					op.solicitudCita();
					cerrarMenu = true;
					break;
				}
			}
			catch(Exception e) 
			{
				throw e;
			}
			
		}
	}
	
	public void implementacionMenuEmpleado() throws Exception{
		
		int opcionSeleccionada;
		boolean cerrarMenu = false;
		
		
		while(!cerrarMenu) {
			
			try 
			{
				opcionSeleccionada = mostrarMenuEmpleado();
				switch(opcionSeleccionada) 
				{
				case 0:
					String texto0 = "Se ha vuetlo al menu principal";
					of.escribirFichero(texto0);
					cerrarMenu = true;
					break;
				case 1:
					String texto1 = "Se ha seleccionado la validacion de clientes";
					of.escribirFichero(texto1);
					op.validacionClientes();
					cerrarMenu = true;
					break;
				case 2:
					String texto2 = "Se ha seleccionado la imprimir citas medicas";
					of.escribirFichero(texto2);
					cerrarMenu = true;
					break;
				}
			}
			catch(Exception e) 
			{
				throw e;
			}
			
		}
	}
	
	public void implementacionMenuEspecialidad() throws Exception{
			
			int opcionSeleccionada;
			boolean cerrarMenu = false;
			
			
			while(!cerrarMenu) {
				
				try 
				{
					opcionSeleccionada = mostrarMenuEspecialidades();
					switch(opcionSeleccionada) 
					{
					case 0:
						String texto0 = "Se ha vuetlo al menu principal";
						of.escribirFichero(texto0);
						cerrarMenu = true;
						break;
					case 1:
						String texto1 = "Se ha seleccionado la especialidad psicologia";
						of.escribirFichero(texto1);
						String especialidad1 = "psicologia"; 
						op.añadirCitas(especialidad1);
						cerrarMenu = true;
						break;
					case 2:
						String texto2 = "Se ha seleccionado la especialidad traumatologia";
						of.escribirFichero(texto2);
						String especialidad2 = "traumatologia"; 
						op.añadirCitas(especialidad2);
						cerrarMenu = true;
						break;
					case 3:
						String texto3 = "Se ha seleccionado la especialidad fisioterapia";
						of.escribirFichero(texto3);
						String especialidad3 = "fisioterapia"; 
						op.añadirCitas(especialidad3);
						cerrarMenu = true;
						break;
					}
				}
				catch(Exception e) 
				{
					throw e;
				}
				
			}
		}
}
