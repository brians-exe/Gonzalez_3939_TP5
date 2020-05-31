/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Cuota;

/**
 * Interfaz que permite disminuir el acoplamiento la aplicación 
 * y nos permitie interactuar con los datos.
 * 
 * @author Brian Leonel Gonzalez
 *
 */
public interface ICuota {

	public void guardar();
	public Cuota mostrar();
	public void eliminar();
	public Cuota modificar();
	
}
