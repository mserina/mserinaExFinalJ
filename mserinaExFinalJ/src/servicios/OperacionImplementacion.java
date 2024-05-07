package servicios;

import controladores.inicio;
import dtos.citasDto;
import dtos.clienteDto;

/**
 * Clase que contiene la logica de los metodos del servicio operacion
 * msm - 070524
 */
public class OperacionImplementacion implements OperacionInterfaz{

	//CLIENTE
	
	String dniClienteCitas = "";
	inicio i = new inicio();
	public void registroCliente() throws Exception{
		
		long id = idGenerator();
		System.out.println("Inserte nombre");
		String nombre = i.sc.next();
		System.out.println("Inserte apellido");
		String apellido = i.sc.next();
		System.out.println("Inserte DNI");
		String dni = i.sc.next();
		
		try 
		{
			clienteDto clienteNuevo = new clienteDto(id, dni, nombre, apellido); 
			i.clientesLista.add(clienteNuevo);
		}
		catch(Exception e) 
		{
			throw e;
		}
	}
	
	public void solicitudCita() throws Exception{
		
		MenuInterfaz mi = new MenuImplementacion();
		System.out.println("Inserte DNI");
		dniClienteCitas = i.sc.next();
		
		try {
			
			for(clienteDto cliente : i.clientesLista) {
				
				if(cliente.getDni().equals(dniClienteCitas)) {
					if(cliente.getValidado() == true) {
						dniClienteCitas = dniClienteCitas;
						mi.implementacionMenuEspecialidad();
					}
				}
			}
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	public void añadirCitas(String especialidadElegida) throws Exception {
		
		long id = idGenerator();
		String dniCliente = dniClienteCitas;
		System.out.print("Inserte fecha para la cita dd-MM-yyyyHH:mm:ss");
		String fecha = i.sc.next();
		String especialidad = especialidadElegida;
		
		try {
			citasDto citaNueva = new citasDto();
			citaNueva.setId(id);
			citaNueva.setDniCliente(dniCliente);
			citaNueva.setFecha(fecha);
			citaNueva.setEspecialidad(especialidad);
			
			i.citasLista.add(citaNueva);
		}
		catch(Exception e) {
			throw e;
		}
		
		
		for(citasDto citas : i.citasLista) {
			
			System.out.println("DNI: " + citas.getDniCliente() + "; " +"FECHA: " + citas.getFecha() + "; " + "ESPECIALIDAD: " + citas.getEspecialidad());
		}
	}
	
	
	//EMPLEADOS
	
	
	public void validacionClientes() throws Exception{
		
		try 
		{
			for(clienteDto clientes : i.clientesLista) 
			{
				if(clientes.getValidado() == false) {
					
					System.out.println(" ");
					System.out.println(clientes.getDni() + " - " + clientes.getNombreCompleto());
					System.out.println(" ");

				}
			}
			
			System.out.print("Inserte DNI");
			String dniInsertado = i.sc.next();
			
			for(clienteDto clientes : i.clientesLista) 
			{
				if(clientes.getDni().equals(dniInsertado)) {
					
					if(clientes.getValidado() == false ) {
						
						clientes.setValidado(true);
						System.out.println("Ya fue validado");
					}
					else {
						System.out.println("Este usuario ya esta validado");
					}
					
				}
				else {
					System.out.println("No fue validado");
				}
			}
		}
		catch(Exception e) {
			throw e;
		}
	}

	
	
	
	
	//UTILIDADES
	private long idGenerator() throws Exception{
		
		int tamano = i.clientesLista.size() -1;
		long nuevoId = 0;
		
		try 
		{
			
			if(tamano > 0) {
				nuevoId = i.clientesLista.get(tamano).getId() + 1;
			}
			else {
				nuevoId = 1;
			}

			
		}
		catch(Exception e) 
		{
			throw e;
		}
		
		return nuevoId;
				
	}
}
