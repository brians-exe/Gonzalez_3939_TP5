/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;

/**
 * Interfaz que permite disminuir el acoplamiento la aplicación 
 * y nos permitie interactuar con los datos.
 * 
 * @author Brian Leonel Gonzalez
 *
 */
public interface IResultado {

	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();
	
}
