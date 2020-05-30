/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Noticia;

/**
 * @author Brian Leonel Gonzalez
 *
 */
public interface INoticiaService {

	public void guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();
	
}
