package com.ipartek.formacion.alumno;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.ipartek.formacion.persistence.Alumno;

/**
 * Session Bean implementation class AlumnoServiceBean
 */
@Stateless(name = "alumnoServiceBean")
public class AlumnoServiceBean implements AlumnoServiceRemote {

	@PersistenceContext(unitName = "gestiondocente")
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public AlumnoServiceBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Alumno getById(long codigo) {
		return entityManager.find(Alumno.class, codigo);
	}

	@Override
	public List<Alumno> getAll() {
		TypedQuery<Alumno> palumno = entityManager.createNamedQuery("alumno.getAll", Alumno.class);
		return palumno.getResultList();
	}

}
