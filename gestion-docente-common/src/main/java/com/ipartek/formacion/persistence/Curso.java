package com.ipartek.formacion.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Table(name = "curso")
@Entity(name = "curso")
@NamedQueries({ @NamedQuery(name = "curso.getAll", query = "SELECT c FROM curso as c WHERE c.activo =true") })
@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "curso.getAlumnos", procedureName = "alumnogetByCurso", resultClasses = Alumno.class, parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class) }) })
public class Curso implements Serializable {

	public static final int CODIGO_NULO = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(name = "nombre")
	private String nombre;
	private String identificador;
	private Date finicio;
	private Date ffin;
	private int nhoras;
	private String temario;
	private double precio;
	// @Fetch(FetchMode.JOIN)

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "cliente_codigo")
	private Cliente cliente;

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "profesor_codigo")
	private Profesor profesor;
	/*
	 * @JoinTable(name = "imparticion", joinColumns = {
	 * 
	 * @JoinColumn(name = "curso_codigo", referencedColumnName = "codigo") },
	 * inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "codigo") })
	 */
	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "curso_codigo", referencedColumnName = "codigo")
	private List<Imparticion> imparticiones;
	private boolean activo;

	public Curso() {
		super();
		this.imparticiones = new ArrayList<Imparticion>();
	}

	/**
	 * @return the imparticiones
	 */
	public List<Imparticion> getImparticiones() {
		return imparticiones;
	}

	/**
	 * @param imparticiones
	 *            the imparticiones to set
	 */
	public void setImparticiones(List<Imparticion> imparticiones) {
		this.imparticiones = imparticiones;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador
	 *            the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the finicio
	 */
	public Date getFinicio() {
		return finicio;
	}

	/**
	 * @param finicio
	 *            the finicio to set
	 */
	public void setFinicio(Date finicio) {
		this.finicio = finicio;
	}

	/**
	 * @return the ffin
	 */
	public Date getFfin() {
		return ffin;
	}

	/**
	 * @param ffin
	 *            the ffin to set
	 */
	public void setFfin(Date ffin) {
		this.ffin = ffin;
	}

	/**
	 * @return the nhoras
	 */
	public int getNhoras() {
		return nhoras;
	}

	/**
	 * @param nhoras
	 *            the nhoras to set
	 */
	public void setNhoras(int nhoras) {
		this.nhoras = nhoras;
	}

	/**
	 * @return the temario
	 */
	public String getTemario() {
		return temario;
	}

	/**
	 * @param temario
	 *            the temario to set
	 */
	public void setTemario(String temario) {
		this.temario = temario;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 *            the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
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
		boolean iguales = false;
		if (obj != null && obj instanceof Curso && this.codigo == ((Curso) obj).getCodigo()) {
			iguales = true;
		}
		return iguales;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nombre=" + nombre + ", identificador=" + identificador + ", finicio="
				+ finicio + ", ffin=" + ffin + ", nhoras=" + nhoras + ", temario=" + temario + ", precio=" + precio
				+ "]";
	}

	/**
	 * @return the profesor
	 */
	public Profesor getProfesor() {
		return profesor;
	}

	/**
	 * @param profesor
	 *            the profesor to set
	 */
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
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

}
