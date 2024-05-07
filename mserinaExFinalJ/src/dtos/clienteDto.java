package dtos;

import java.time.LocalDate;

/**
 * Contiene los metodos y atributos de la clase clienteDto
 * msm - 070524
 */
public class clienteDto {

	long id;
	String dni;
	String nombre;
	String apellidos;
	LocalDate fechaConsulta = LocalDate.now();
	String nombreCompleto;
	boolean validado = false; 
	
	
	public boolean getValidado() {
		return validado;
	}
	public void setValidado(boolean validado) {
		this.validado = validado;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(LocalDate fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	
	
	public clienteDto(long id, String dni, String nombre, String apellidos) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreCompleto = apellidos + "," + nombre;
	}
	

	public clienteDto() {
		
	}
	
	
	
	
	
	
	
	
}
