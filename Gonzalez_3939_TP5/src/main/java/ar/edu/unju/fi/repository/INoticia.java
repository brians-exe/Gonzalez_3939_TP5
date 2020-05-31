/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;

/**
 * Interfaz que permite disminuir el acoplamiento la aplicación 
 * y nos permitie interactuar con los datos.
 * 
 * @author Brian Leonel Gonzalez
 *
 */
public interface INoticia {

	public void guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();
	
}
