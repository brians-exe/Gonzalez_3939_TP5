/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Equipo;

/**
 * Interfaz que permite disminuir el acoplamiento la aplicación 
 * y nos permitie interactuar con los datos.
 * 
 * @author Brian Leonel Gonzalez
 *
 */
public interface IEquipo {

	public void guardar();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();
	
}
