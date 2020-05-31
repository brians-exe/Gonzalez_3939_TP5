/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Gonzalez3939Tp5Application;
import ar.edu.unju.fi.model.Estadio;

/**
 * Clase que representa la implementacion de la interfaz IEstadio.
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Repository("EstadioImp")
public class EstadioImp implements IEstadio {
	
	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa a un estadio.
	 */
	@Autowired
	private Estadio estadio;

	/**
	 * Variable estática que por el momento funcionará para simular 
	 * las acciones de los métodos.
	 */
	public static Logger LOG = LoggerFactory.getLogger(Gonzalez3939Tp5Application.class);
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructor sin parametros.
	 */
	public EstadioImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite informar del guardado de los datos de una cuota.
	 */
	@Override
	public void guardar() {
		LOG.info("Se guardó el Estadio " + estadio.getNombre());
	}

	/**
	 * Permite mostrar los datos del objeto estadio.
	 */
	@Override
	public Estadio mostrar() {
		LOG.info("Mostrar los datos del Estadio");
		return estadio;
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se eliminó una estadio.
	 */
	@Override
	public void eliminar() {
		LOG.info("Se eliminó los datos del Estadio de la BD.");
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se modificaron
	 * los datos de un objeto estadio.
	 */
	@Override
	public Estadio modificar() {
		LOG.info("Se modificó el estadio " + estadio.getNombre());
		return estadio;
	}

}
