/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.repository.ICuota;

/**
 * Clase que representa la implementacion de la interfaz ICuotaService.
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Repository
public class CuotaServiceImp implements ICuotaService {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa la implementacion de una cuota.
	 */
	@Autowired
	private ICuota icuota;
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	* Constructor sin parametros.
	*/
	public CuotaServiceImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite informar del guardado de una cuota.
	 */
	@Override
	public void guardar() {
		icuota.guardar();
	}

	/**
	 * Metodo que permite mostrar una cuota.
	 */
	@Override
	public Cuota mostrar() {
		Cuota cuota = icuota.mostrar();
		return cuota;
	}

	/**
	 * Metodo que permite informar de la eliminación de una cuota.
	 */
	@Override
	public void eliminar() {
		icuota.eliminar();
	}

	/**
	 * Metodo que permite informar de la modificacion de una cuot.
	 */
	@Override
	public Cuota modificar() {
		Cuota cuota = icuota.modificar();
		return cuota;
	}

}
