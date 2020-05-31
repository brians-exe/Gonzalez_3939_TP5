/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase que permite representar a un objeto de tipo noticia en el mundo real.
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Component	//marca a la clase como un bean de Spring
public class Noticia {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa la fecha de publicacion de la noticia.
	 */
	private LocalDate fecha;
	
	/**
	 * Atributo que representa el titulo de la noticia.
	 */
	private String titulo;
	
	/**
	 * Atributo que representa un resumen de la noticia.
	 */
	private String resumen;
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructor si parametros
	 */
	public Noticia() {
		// TODO Auto-generated constructor stub
	}
	
	//-----------------METODO toString()-----------------------
	
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}
	

	//---------------------SETTERS Y GETTERS-------------------------

	/**
	 * Permite devolver el valor correspodiente a la fecha de la noticia.
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "fecha".
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Permite devolver el valor correspodiente al titulo de la noticia.
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "titulo".
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Permite devolver el valor correspodiente al resumen de la noticia.
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "resumen".
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
}
