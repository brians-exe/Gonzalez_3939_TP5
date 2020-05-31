/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que permite representar a un objeto de tipo equipo en el mundo real.
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Component	//marca a la clase como un bean de Spring
public class Equipo {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa el nombre del equipo.
	 */
	private String nombre;
	
	/**
	 * Atributo que representa el estadio del equipo.
	 */
	@Autowired	//Inyecta un Bean usando la autodetección de Spring.
	private Estadio estadio;
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructor sin parametros
	 */
	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	//-----------------METODO toString()-----------------------
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	//---------------------SETTERS Y GETTERS-------------------------
	
	/**
	 * Permite devolver el valor correspodiente a nombre del equipo.
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "nombre".
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Permite devolver el valor correspodiente a estadio del equipo.
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "estadio".
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
}
