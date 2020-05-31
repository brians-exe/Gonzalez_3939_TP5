/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Gonzalez3939Tp5Application;
import ar.edu.unju.fi.model.Noticia;

/**
 * Clase que representa la implementacion de la interfaz INoticia.
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Repository("NoticiaImp")
public class NoticiaImp implements INoticia {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa a un usuario.
	 */
	@Autowired
	private Noticia noticia;
		
	/**
	 * Variable estática que por el momento funcionará para simular 
	 * las acciones de los métodos.
	 */
	public static Logger LOG = LoggerFactory.getLogger(Gonzalez3939Tp5Application.class);

	//------------------------CONSTRUCTORES----------------------
		
	/**
	 * Constructor sin parametros.
	 */
	public NoticiaImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite informar del guardado de los datos de una noticia.
	 */
	@Override
	public void guardar() {
		LOG.info("Se guardó la noticia con título " + noticia.getTitulo());
	}

	/**
	 * Metodo que permite mostrar los datos de una noticia.
	 */
	@Override
	public Noticia mostrar() {
		LOG.info("Mostrar la noticia");
		return noticia;
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se eliminó una noticia.
	 */
	@Override
	public void eliminar() {
		LOG.info("Se eliminó la noticia de la BD.");
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se modificó un usuario.
	 */
	@Override
	public Noticia modificar() {
		LOG.info("Se modificó la noticia \"" + noticia.getTitulo() +"\"");
		return noticia;
	}

}
