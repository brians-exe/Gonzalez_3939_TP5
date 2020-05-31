/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Gonzalez3939Tp5Application;
import ar.edu.unju.fi.model.Equipo;

/**
 * Clase que representa la implementacion de la interfaz IEquipo.
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Repository("EquipoImp")
public class EquipoImp implements IEquipo {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa a un usuario.
	 */
	@Autowired
	private Equipo equipo;
		
	/**
	 * Variable estática que por el momento funcionará para simular 
	 * las acciones de los métodos.
	 */
	public static Logger LOG = LoggerFactory.getLogger(Gonzalez3939Tp5Application.class);

	//------------------------CONSTRUCTORES----------------------
		
	/**
	 * Constructor sin parametros.
	 */
	public EquipoImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite informar del guardado de los datos de un usuario.
	 */
	@Override
	public void guardar() {
		LOG.info("Se guardó el Equipo " + equipo.getNombre() + ", del estadio " + equipo.getEstadio().getNombre());
	}

	/**
	 * Metodo que permite mostrar los datos de un Equipo.
	 */
	@Override
	public Equipo mostrar() {
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se eliminó un equipo.
	 */
	@Override
	public void eliminar() {
		LOG.info("Se eliminó el Equipo de la BD.");
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se modificó un equipo.
	 */
	@Override
	public Equipo modificar() {
		LOG.info("Se modificó el equipo " + equipo.getNombre());
		return equipo;
	}

}
