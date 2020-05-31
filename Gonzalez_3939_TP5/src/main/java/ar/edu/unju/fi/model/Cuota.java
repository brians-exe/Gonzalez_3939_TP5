/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que permite representar a un objeto de tipo cuota en el mundo real.
 * 
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
	 * Permite devolver el valor correspodiente al id.
	 * @return el id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Permite establecer un valor del atributo "id" de la clase.
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Permite devolver el valor correspodiente a la fecha de pago.
	 * @return fechaPago la fecha de pago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	/**
	 * Permite establecer un valor del atributo "fechaPago" de la clase.
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * Permite devolver el valor correspodiente al periodo.
	 * @return the periodo
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * Permite establecer un valor del atributo "periodo" de la clase.
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * Permite devolver el valor correspodiente al monto a pagar.
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * Permite establecer un valor del atributo "monto" de la clase.
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * Permite devolver el valor correspodiente al estado del pago.
	 * Puede ser: 
	 * 				PAGADO - Si se pagó
	 * 				DEUDOR - Si no pagó
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Permite establecer un valor del atributo "estado" de la clase.
	 * Puede ser: 
	 * 				PAGADO - Si se pagó
	 * 				DEUDOR - Si no pagó
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Permite devolver el valor correspodiente a usuario.
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Permite establecer el valor correspondiente al atributo "usuario".
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
