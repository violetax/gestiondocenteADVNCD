package com.ipartek.formacion.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name = "imparticion")
@Table(name = "imparticion")
@NamedQueries({ @NamedQuery(name = "imparticion.getAll", query = "SELECT i FROM imparticion as i") })
public class Imparticion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "alumno_codigo", referencedColumnName = "codigo")
	private Alumno alumno;
	@Column(name = "fMatriculacion")
	Date fMatriculacion;

	public Imparticion() {
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
	 * @return the alumno
	 */
	public Alumno getAlumno() {
		return alumno;
	}

	/**
	 * @param alumno
	 *            the alumno to set
	 */
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	/**
	 * @return the fMatriculacion
	 */
	public Date getfMatriculacion() {
		return fMatriculacion;
	}

	/**
	 * @param fMatriculacion
	 *            the fMatriculacion to set
	 */
	public void setfMatriculacion(Date fMatriculacion) {
		this.fMatriculacion = fMatriculacion;
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
		if (!(obj instanceof Imparticion)) {
			return false;
		}
		Imparticion other = (Imparticion) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Imparticion [codigo=" + codigo + ", alumno=" + alumno + ", fMatriculacion=" + fMatriculacion + "]";
	}

}
