/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.repository.IEstadio;

/**
 * Clase que representa la implementacion de la interfaz IEstadioService
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Repository
public class EstadioServiceImp implements IEstadioService {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa la implementacion de un estadio.
	 */
	@Autowired
	private IEstadio iestadio;
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructor sin parametros.
	 */
	public EstadioServiceImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite informar del guardado de una estadio.
	 */
	@Override
	public void guardar() {
		iestadio.guardar();
	}

	/**
	 * Metodo que permite mostrar un estadio.
	 */
	@Override
	public Estadio mostrar() {
		Estadio estadio = iestadio.mostrar();
		return estadio;
	}

	/**
	 * Metodo que permite informar de la eliminación de un estadio.
	 */
	@Override
	public void eliminar() {
		iestadio.eliminar();
	}

	/**
	 * Metodo que permite informar de la modificacion de un estadio.
	 */
	@Override
	public Estadio modificar() {
		Estadio estadio = iestadio.modificar();
		return estadio;
	}

}
