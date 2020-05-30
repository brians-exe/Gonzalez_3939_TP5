/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
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
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
}
