/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Gonzalez3939Tp5Application;
import ar.edu.unju.fi.model.Resultado;

/**
 * Clase que representa la implementacion de la interfaz IResultado.
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Repository("ResultadoImp")
public class ResultadoImp implements IResultado {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa a un usuario.
	 */
	@Autowired
	private Resultado resultado;
			
	/**
	 * Variable estática que por el momento funcionará para simular 
	 * las acciones de los métodos.
	 */
	public static Logger LOG = LoggerFactory.getLogger(Gonzalez3939Tp5Application.class);

	//------------------------CONSTRUCTORES----------------------
			
	/**
	 * Constructor sin parametros.
	 */
	public ResultadoImp() {
		
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite informar del guardado de los datos del resultado.
	 */
	@Override
	public void guardar() {
		LOG.info(
					"Se guardó el resultado de " + resultado.getEquipo1() +
					" VS " + resultado.getEquipo2()
				);
	}

	/**
	 * Metodo que permite mostrar los datos del resultado.
	 */
	@Override
	public Resultado mostrar() {
		LOG.info("Mostrar los resultados");
		return resultado;
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se eliminaron los resultados.
	 */
	@Override
	public void eliminar() {
		LOG.info("Se eliminaron los resultados de la BD.");
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se modificaron los resultados.
	 */
	@Override
	public Resultado modificar() {
		LOG.info(
				"Se modificaron los resultados de " + resultado.getEquipo1().getNombre()
				+ " VS " + resultado.getEquipo2().getNombre()
				);
		return resultado;
	}

}
