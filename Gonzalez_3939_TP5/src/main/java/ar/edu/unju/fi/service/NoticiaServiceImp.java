/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.repository.INoticia;

/**
 * @author Brian Leonel Gonzalez
 *
 */

@Repository
public class NoticiaServiceImp implements INoticiaService {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa la implementacion de un INoticia.
	 */
	@Autowired
	private INoticia inoticia;
		
	//------------------------CONSTRUCTORES----------------------
		
	/**
	 * Constructor sin parametros.
	 */
	public NoticiaServiceImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite guardar una noticia.
	 */
	@Override
	public void guardar() {
		inoticia.guardar();
	}

	/**
	 * Metodo que permite mostrar una noticia.
	 */
	@Override
	public Noticia mostrar() {
		Noticia noticia = inoticia.mostrar();
		return noticia;
	}

	/**
	 * Metodo que permite eliminar una noticia.
	 */
	@Override
	public void eliminar() {
		inoticia.eliminar();
	}

	/**
	 * Metodo que permite modificar un usuario.
	 */
	@Override
	public Noticia modificar() {
		Noticia noticia = inoticia.modificar();
		return noticia;
	}

}
