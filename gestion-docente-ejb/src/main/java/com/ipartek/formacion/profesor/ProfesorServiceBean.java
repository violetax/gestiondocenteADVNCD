package com.ipartek.formacion.profesor;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.ipartek.formacion.persistence.Profesor;

/**
 * Session Bean implementation class ProfesorServiceBean
 */
@Stateless(name = "profesorServiceBean")
public class ProfesorServiceBean implements ProfesorServiceRemote {

	@PersistenceContext(unitName = "gestiondocente")
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ProfesorServiceBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Profesor> getAll() {
		TypedQuery<Profesor> pprofesores = entityManager.createNamedQuery("profesor.getAll", Profesor.class);
		return pprofesores.getResultList();
	}

	@Override
	public Profesor getById(long codigo) {
		Profesor profesor = entityManager.find(Profesor.class, codigo);
		return profesor;
	}

	@Override
	public Profesor create(Profesor profesor) {

		return null;
	}

	@Override
	public Profesor update(Profesor profesor) {
		try {
			entityManager.merge(profesor);
			// tx.commit();
		} catch (Exception e) {
			// tx.rollback();
		}
		return null;
	}

	@Override
	public void delete(long codigo) {
		try {
			entityManager.remove(entityManager.find(Profesor.class, codigo));
			// tx.commit();
		} catch (Exception e) {
			// tx.rollback();
		}

	}

}
