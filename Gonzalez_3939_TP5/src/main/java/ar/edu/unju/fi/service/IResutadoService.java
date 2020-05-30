/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Resultado;

/**
 * @author Brian Leonel Gonzalez
 *
 */

public interface IResutadoService {

	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();
	
}
