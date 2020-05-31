/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Estadio;

/**
 * Interfaz que permite disminuir el acoplamiento la aplicación 
 * y nos permitie interactuar con los datos.
 * 
 * @author Brian Leonel Gonzalez
 *
 */
public interface IEstadio {
	
	public void guardar();
	public Estadio mostrar();
	public void eliminar();
	public Estadio modificar();

}
