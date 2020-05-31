/**
 * 
 */
package ar.edu.unju.fi.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Gonzalez3939Tp5Application;
import ar.edu.unju.fi.model.Usuario;

/**
 * Clase que representa la implementacion de la interfaz IUsuario.
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Repository("UsuarioImp")
public class UsuarioImp implements IUsuario {
	
	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa a un usuario.
	 */
	@Autowired
	private Usuario usuario;
	
	/**
	 * Variable estática que por el momento funcionará para simular 
	 * las acciones de los métodos.
	 */
	public static Logger LOG = LoggerFactory.getLogger(Gonzalez3939Tp5Application.class);

	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructor sin parametros.
	 */
	public UsuarioImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite informar del guardado de los datos de un usuario.
	 */
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto usuario en la BD.
		LOG.info("El usuario fué guardado " + usuario.getApellido() + ", " + usuario.getNombre());
	}

	/**
	 * Metodo que permite mostrar los datos de un usuario.
	 */
	@Override
	public Usuario mostrar() {
		// Se recuperan todos los datos del usuario.
		LOG.info("Mostrar los datos del usuario:");
		return usuario;
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se eliminó un usuario.
	 */
	@Override
	public void eliminar() {
		// Se elimina el objeto usuario de la BD
		LOG.info("Se eliminó el usuario de la BD.");
	}

	/**
	 * Metodo que permite mostrar un mensaje, informando que se modificó un usuario.
	 */
	@Override
	public Usuario modificar() {
		LOG.info("Se modificó el usuario " + usuario.getApellido() + ", " + usuario.getNombre());
		return usuario;
	}

}
