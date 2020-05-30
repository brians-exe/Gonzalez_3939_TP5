/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;

/**
 * @author Brian Leonel Gonzalez
 *
 */

@Repository
public class EquipoServiceImp implements IEquipoService {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa una implementacion de un equipo.
	 */
	@Autowired
	private IEquipo iequipo;
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructor sin parametros.
	 */
	public EquipoServiceImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite guardar un equipo.
	 */
	@Override
	public void guardar() {
		iequipo.guardar();
	}

	/**
	 * Metodo que permite mostrar un equipo.
	 */
	@Override
	public Equipo mostrar() {
		Equipo equipo = iequipo.mostrar();
		return equipo;
	}

	/**
	 * Metodo que permite eliminar un equipo.
	 */
	@Override
	public void eliminar() {
		iequipo.eliminar();
	}

	/**
	 * Metodo que permite modificar un equipo.
	 */
	@Override
	public Equipo modificar() {
		Equipo equipo = iequipo.modificar();
		return equipo;
	}

}
