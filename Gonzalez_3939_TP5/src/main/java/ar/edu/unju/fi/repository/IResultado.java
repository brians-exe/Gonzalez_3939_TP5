/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;

/**
 * @author Brian Leonel Gonzalez
 *
 */
public interface IResultado {

	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();
	
}
