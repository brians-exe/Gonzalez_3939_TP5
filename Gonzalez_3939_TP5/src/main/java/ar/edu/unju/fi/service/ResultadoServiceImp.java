/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.repository.IResultado;

/**
 * Clase que representa la implementacion de la interfaz IResultadoService
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Repository
public class ResultadoServiceImp implements IResutadoService {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa la implementacion de una IResultado.
	 */
	@Autowired
	private IResultado iresultado;
			
	//------------------------CONSTRUCTORES----------------------
			
	/**
	 * Constructor sin parametros.
	 */
	public ResultadoServiceImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite guardar un resultado.
	 */
	@Override
	public void guardar() {
		iresultado.guardar();
	}

	/**
	 * Metodo que permite mostrar un resultado.
	 */
	@Override
	public Resultado mostrar() {
		Resultado resultado = iresultado.mostrar();
		return resultado;
	}

	/**
	 * Metodo que permite eliminar un resultado.
	 */
	@Override
	public void eliminar() {
		iresultado.eliminar();
	}

	
	@Override
	public Resultado modificar() {
		Resultado resultado = iresultado.modificar();
		return resultado;
	}

}
