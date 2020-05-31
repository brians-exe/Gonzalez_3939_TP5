/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase que permite representar a un objeto de tipo resultado en el mundo real.
 * Se puede almacenar los datos de 2 equipos, la fecha del partido y los resultados del mismo.
 * 
 * @author Brian Leonel Gonzalez
 *
 */

@Component	//marca a la clase como un bean de Spring
public class Resultado {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa la fechadel partido jugado.
	 */
	private LocalDate fecha;
	
	/**
	 * Atributo que representa el equipo1 que jugó.
	 */
	private Equipo equipo1;
	
	/**
	 * Atributo que representa el equipo2 que jugó.
	 */
	private Equipo equipo2;
	
	/**
	 * Atributo que representa la cantidad de goles del equipo1.
	 */
	private int golesEquipo1;
	
	/** 
	 * Atributo que representa la cantidad de goles del equipo2.
	 */
	private int golesEquipo2;
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructores sin parametros
	 */
	public Resultado() {
		// TODO Auto-generated constructor stub
	}
	
	//-----------------METODO toString()-----------------------
	
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}

	//---------------------SETTERS Y GETTERS-------------------------
	
	/**
	 * Permite devolver el valor correspodiente a la fecha del partido.
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
	 * Permite devolver el valor correspodiente al equipo1.
	 * @return the equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "equipo1".
	 * @param equipo1 the equipo1 to set
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	/**
	 * Permite devolver el valor correspodiente al equipo2.
	 * @return the equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "equipo2".
	 * @param equipo2 the equipo2 to set
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	/**
	 * Permite devolver el valor correspodiente a la cantidad de goles del equipo1.
	 * @return the golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "golesEquipo1".
	 * @param golesEquipo1 the golesEquipo1 to set
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	/**
	 * Permite devolver el valor correspodiente a la cantidad de goles del equipo2.
	 * @return the golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "golesEquipo2".
	 * @param golesEquipo2 the golesEquipo2 to set
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
}
