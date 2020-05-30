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
public class Usuario {
	
	//---------------------ATRIBUTOS------------------------
	
	/**
	 * Atributo que representa el ID del usuario.
	 */
	private long id;
	
	/**
	 * Atributo que representa elnombre del usuario.
	 */
	private String nombre;
	
	/**
	 * Atributo que representa que representa el apellido del usuario.
	 */
	private String apellido;
	
	/**
	 * Atributo que representa la fecha de nacimiento del usuario.
	 */
	private LocalDate fechaNacimiento;
	
	/**
	 * Atributo que representa la direccion del usuario.
	 */
	private String direccion;
	
	/**
	 * Atributo que representa el DNI del usuario.
	 */
	private long dni;
	
	/**
	 * Atributo que representa la fecha de alta del usuario.
	 */
	private LocalDate fechaAlta;
	
	/**
	 * Atributo que representa el tipo de usuario.
	 * Pueden ser: SOCIO, ADMIN, CONSULTOR.
	 */
	private String tipo;
	
	/**
	 * Atributo que representa la contraseña del usuario.
	 */
	private String password;

	//------------------------CONSTRUCTORES----------------------
	
	/**
	 * Constructores sin parametros
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	//-----------------METODO toString()-----------------------
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", tipo="
				+ tipo + ", password=" + password + "]";
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * @return the fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
