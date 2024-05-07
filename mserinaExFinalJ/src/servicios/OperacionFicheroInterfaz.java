package servicios;

/**
 * Contiene la cabezera de los metodos del fichero
 * msm - 070524
 */
public interface OperacionFicheroInterfaz {

	/**
	 * Crea la ruta del fichero log
	 * msm - 070524
	 * @return La ruta del fichero log
	 */
	public String nombreLog();
	
	/**
	 * Escribe en el fichero log
	 * msm - 070524
	 * @param texto
	 */
	public void escribirFichero(String texto);
	
	
}
