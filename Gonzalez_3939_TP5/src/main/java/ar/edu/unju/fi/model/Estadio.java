/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * @author Brian Leonel Gonzalez
 *
 */

@Component	//marca a la clase como un bean de Spring
public class Estadio {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa el nombre del estadio.
	 */
	private String nombre;
	
	/**
	 * Atributo que representa la fecha de fundacion del estadio.
	 */
	private LocalDate fechaFundacion;
	
	/**
	 * Atributo que representa la ciudad en la que se encuentra el estadio.
	 */
	private String ciudad;
	
	/**
	 * Atributo que representa la capacidad del estadio.
	 */
	private int capacidad;
	
	/**
	 * Atributo que representa la direccion del estadio.
	 */
	private String direccion;
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructor sin parametros
	 */
	public Estadio() {
		// TODO Auto-generated constructor stub
	}
	
	//-----------------METODO toString()-----------------------
	
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}

	//---------------------SETTERS Y GETTERS-------------------------

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
