package servicios;

/**
 * Contiene la cabezera de los metodos del operacion
 * msm - 070524
 */
public interface OperacionInterfaz {

	/**
	 * Registra un cliente
	 * msm - 070524
	 * @throws Exception
	 */
	public void registroCliente() throws Exception;
	
	/**
	 * Valida los clientes
	 * msm - 070524
	 * @throws Exception
	 */
	public void validacionClientes() throws Exception;
	
	
	/**
	 * Solicita la cita para un cliente
	 * msm - 070524
	 * @throws Exception
	 */
	public void solicitudCita() throws Exception;
	
	
	/**
	 * Añade las citas
	 * msm - 070524
	 * @param especialidadElegida
	 * @throws Exception
	 */
	public void añadirCitas(String especialidadElegida) throws Exception; 
	
	
}
