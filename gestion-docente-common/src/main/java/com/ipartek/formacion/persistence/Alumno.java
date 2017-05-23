package com.ipartek.formacion.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "alumno")
@Table(name = "alumno")
@NamedQueries({ @NamedQuery(name = "alumno.getAll", query = "SELECT a FROM alumno as a WHERE a.activo =true") })
public class Alumno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -468805280262731464L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private long codigo;
	private String nombre;
	private String apellidos;
	private Date fNacimiento;
	private String dni;
	private String email;
	private String poblacion;
	private String direccion;
	private Integer codigopostal;
	private String telefono;
	private int nHermanos;
	private boolean activo;
	@Transient
	private List<Curso> curso;
	// @Fetch(FetchMode.JOIN)// Se fuesese imprescindible una List se tendria
	// que incluir esta anotacion con JOIN o SUBSELECT

	public Alumno() {
		super();
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos
	 *            the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fNacimiento
	 */
	public Date getfNacimiento() {
		return fNacimiento;
	}

	/**
	 * @param fNacimiento
	 *            the fNacimiento to set
	 */
	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni
	 *            the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion
	 *            the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the codigopostal
	 */
	public int getCodigopostal() {
		return codigopostal;
	}

	/**
	 * @param codigopostal
	 *            the codigopostal to set
	 */
	public void setCodigopostal(int codigopostal) {
		this.codigopostal = codigopostal;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 *            the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the nHermanos
	 */
	public int getnHermanos() {
		return nHermanos;
	}

	/**
	 * @param nHermanos
	 *            the nHermanos to set
	 */
	public void setnHermanos(int nHermanos) {
		this.nHermanos = nHermanos;
	}

	/**
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * @param activo
	 *            the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	/**
	 * @return the curso
	 */
	public List<Curso> getCurso() {
		return curso;
	}

	/**
	 * @param curso
	 *            the curso to set
	 */
	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

	/**
	 * @param codigopostal
	 *            the codigopostal to set
	 */
	public void setCodigopostal(Integer codigopostal) {
		this.codigopostal = codigopostal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fNacimiento="
				+ fNacimiento + ", dni=" + dni + ", email=" + email + ", poblacion=" + poblacion + ", direccion="
				+ direccion + ", codigopostal=" + codigopostal + ", telefono=" + telefono + ", nHermanos=" + nHermanos
				+ ", activo=" + activo + ", curso=" + curso + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Alumno)) {
			return false;
		}
		Alumno other = (Alumno) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

}
