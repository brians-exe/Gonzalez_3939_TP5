/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuario;

/**
 * Clase que representa la implementacion de la interfaz IUsuarioService
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Repository
public class UsuarioServiceImp implements IUsuarioService {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa la implementacion de un usuario.
	 */
	@Autowired
	private IUsuario iusuario;
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructor sin parametros.
	 */
	public UsuarioServiceImp() {
		// TODO Auto-generated constructor stub
	}

	//---------------------------METODOS--------------------
	
	/**
	 * Metodo que permite guardar un usuario.
	 */
	@Override
	public void guardar() {
		iusuario.guardar();
	}

	/**
	 * Metodo que permite mostrar un usuario.
	 */
	@Override
	public Usuario mostrar() {
		Usuario usuario = iusuario.mostrar();
		return usuario;
	}

	/**
	 * Metodo que permite eliminar un usuario.
	 */
	@Override
	public void eliminar() {
		iusuario.eliminar();
	}

	/**
	 * Metodo que permite modificar un usuario.
	 */
	@Override
	public Usuario modificar() {
		Usuario usuario = iusuario.modificar();
		return usuario;
	}

}
