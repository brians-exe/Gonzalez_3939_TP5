/**
 * 
 */
package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;

/**
 * Se encarga de tomar las peticiones del usuario y controlar que respuesta 
 * debe ser presentada en la vista (página html).
 * 
 * @author Brian Leonel Gonzalez
 */

@Controller
public class MainController {

	/**
	 * Inyecta un objeto que implemente la interface IUsuarioService.
	 */
	@Autowired
	private IUsuarioService usuarioService;

	/**
	 *  Permite adjuntar atributos que irán directo a la vista html.
	 *   Aca se envia el nombre del usuario a la vista html.
	 * @param model
	 * @return la pagina html que se debe mostrar
	 */
	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("usuario", usuarioService.mostrar().getNombre());
		return "index";
	}
}
