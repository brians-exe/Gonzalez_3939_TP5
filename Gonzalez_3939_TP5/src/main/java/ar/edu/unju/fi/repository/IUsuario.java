/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

/**
 * Interfaz que permite disminuir el acoplamiento la aplicación 
 * y nos permitie interactuar con los datos.
 * 
 * @author Brian Leonel Gonzalez
 *
 */
public interface IUsuario {

	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();
	
}
