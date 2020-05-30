/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Brian Leonel Gonzalez
 *
 */

@Component	//marca a la clase como un bean de Spring
public class Cuota {

	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa el ID de la cuota.
	 */
	private long id;
	
	/**
	 * Atributo que representa la fecha de pago de la cuota.
	 */
	private LocalDate fechaPago;
	
	/**
	 * Atributo que representa el periodo de pago de la cuota.
	 */
	private String periodo;
	
	/**
	 * Atributo que representa el monto de dinero a pagar.
	 */
	private double monto;
	
	/**
	 * Atributo que representa el estado de la cuota.
	 */
	private String estado;
	
	/**
	 * Atributo que representa el usuario que efectua el pago.
	 */
	@Autowired	//Inyecta un Bean usando la autodetección de Spring.
	private Usuario usuario;
	
	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructores sin parametros
	 */
	public Cuota() {
		// TODO Auto-generated constructor stub
	}
	
	//-----------------METODO toString()-----------------------
	
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}

	//---------------------SETTERS Y GETTERS-------------------------

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	/**
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * @return the periodo
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
