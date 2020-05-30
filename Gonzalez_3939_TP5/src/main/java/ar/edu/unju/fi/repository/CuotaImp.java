/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Gonzalez3939Tp5Application;
import ar.edu.unju.fi.model.Cuota;

/**
 * @author Brian Leonel Gonzalez
 *
 */

@Repository("CuotaImp")
public class CuotaImp implements ICuota {

	//---------------------ATRIBUTOS------------------------
	
	/**
	* Atributo que representa a un usuario.
	*/
	@Autowired
	private Cuota cuota;
	
	/**
	 * Variable estática que por el momento funcionará para simular 
	 * las acciones de los métodos.
	 */
	public static Logger LOG = LoggerFactory.getLogger(Gonzalez3939Tp5Application.class);
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructor sin parametros.
	 */
	public CuotaImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite informar del guardado de los datos de una cuota.
	 */
	@Override
	public void guardar() {
		LOG.info("Se guardo la cuota con ID " + cuota.getId() + ", con estado " + cuota.getEstado() 
				+ ", del usuario " + cuota.getUsuario().getApellido());

	}

	/**
	 * Permite mostrar los datos del objeto cuota
	 */
	@Override
	public Cuota mostrar() {
		LOG.info("Mostrar los datos de la cuota");
		return cuota;
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se eliminó una cuota.
	 */
	@Override
	public void eliminar() {
		LOG.info("Se eliminó los datos de la Cuota de la BD.");
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se modificaron
	 * los datos de un objeto cuota.
	 */
	@Override
	public Cuota modificar() {
		LOG.info("Se modificó la cuota " + cuota.getId());
		return cuota;
	}

}
