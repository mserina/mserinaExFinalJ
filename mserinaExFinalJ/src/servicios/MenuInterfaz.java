package servicios;

/**
 * Contiene la cabezera de los metodos del menu
 * msm - 070524
 */
public interface MenuInterfaz {

	/**
	 * Muestra el menu principal
	 * msm - 070524
	 * @return Devuelve la respuesta del usuario
	 */
	public int mostrarMenu() throws Exception;
	
	/**
	 * Redirge al menu de clientes
	 * msm - 070524
	 */
	public void implementacionMenuCliente() throws Exception;
	
	/**
	 * Redirge al menu de empleados
	 * msm - 070524
	 */
	public void implementacionMenuEmpleado() throws Exception;
	
	
	/**
	 * Redirige al menu de especialidades
	 * msm - 070524
	 * @throws Exception
	 */
	public void implementacionMenuEspecialidad() throws Exception;
} 
