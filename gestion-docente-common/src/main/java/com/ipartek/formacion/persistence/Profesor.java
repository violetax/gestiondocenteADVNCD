package com.ipartek.formacion.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.ipartek.formacion.listeners.ProfesorListener;

@Entity(name = "profesor")
@Table(name = "profesor")
@EntityListeners(ProfesorListener.class)
@NamedQueries({ @NamedQuery(name = "profesor.getAll", query = "SELECT p FROM profesor as p WHERE p.activo =true") })
public class Profesor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 865873567733136148L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	private String nombre;
	private String apellidos;
	private String nss;
	private String dni;
	private String email;
	private String direccion;
	private Integer codigopostal;
	private String telefono;
	private String poblacion;
	private boolean activo;
	private Date fNacimiento;
	@Transient
	private List<Curso> cursos;
	@Transient
	private String fullName;

	public Profesor() {
		super();
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	 * @return the nss
	 */
	public String getNss() {
		return nss;
	}

	/**
	 * @param nss
	 *            the nss to set
	 */
	public void setNss(String nss) {
		this.nss = nss;
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
	public Integer getCodigopostal() {
		return codigopostal;
	}

	/**
	 * @param codigopostal
	 *            the codigopostal to set
	 */
	public void setCodigopostal(Integer codigopostal) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nss=" + nss
				+ ", dni=" + dni + ", email=" + email + ", direccion=" + direccion + ", codigopostal=" + codigopostal
				+ ", telefono=" + telefono + ", poblacion=" + poblacion + ", activo=" + activo + ", fNacimiento="
				+ fNacimiento + "]";
	}

	/**
	 * @return the cursos
	 */
	public List<Curso> getCursos() {
		return cursos;
	}

	/**
	 * @param cursos
	 *            the cursos to set
	 */
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
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
		if (!(obj instanceof Profesor)) {
			return false;
		}
		Profesor other = (Profesor) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

}
