/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Estadio;

/**
 * @author Brian Leonel Gonzalez
 *
 */

public interface IEstadioService {

	public void guardar();
	public Estadio mostrar();
	public void eliminar();
	public Estadio modificar();
	
}
