package com.ipartek.formacion.curso;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import com.ipartek.formacion.persistence.Curso;

/**
 * Session Bean implementation class CursoServiceBean
 */
@Stateless(name = "cursoServiceBean")
public class CursoServiceBean implements CursoServiceRemote {
	private static final Logger LOGGER = Logger.getLogger(CursoServiceBean.class);

	@PersistenceContext(unitName = "gestiondocente")
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 * 
	 * public CursoServiceBean() { // TODO Auto-generated constructor stub }
	 */
	@Override
	public List<Curso> getAll() {
		LOGGER.debug("Carga de cursos");
		TypedQuery<Curso> pcursos = entityManager.createNamedQuery("curso.getAll", Curso.class);
		return pcursos.getResultList();
	}

	@Override
	public Curso getById(long codigo) {
		Curso curso = entityManager.find(Curso.class, codigo);
		/*
		 * StoredProcedureQuery spq =
		 * entityManager.createNamedStoredProcedureQuery("curso.getAlumnos");
		 * spq.setParameter(1, codigo); List<Alumno> alumnos = (List<Alumno>)
		 * spq.getResultList(); curso.setAlumnos(alumnos);
		 */
		return curso;
	}

	@Override
	public Curso update(Curso curso) {
		// EntityTransaction tx = entityManager.getTransaction();
		// tx.begin();
		LOGGER.info("" + curso.toString());
		LOGGER.info("" + curso.getImparticiones().toString());
		curso = entityManager.merge(curso);
		// tx.commit();

		return curso;
	}

	@Override
	public Curso create(Curso curso) {
		// EntityTransaction tx = entityManager.getTransaction();
		// tx.begin();

		LOGGER.debug("create:" + curso.toString());

		curso = entityManager.merge(curso);
		// entityManager.flush();

		return curso;
	}

	@Override
	public void delete(long codigo) {
		// EntityTransaction tx = entityManager.getTransaction();
		// tx.begin();

		entityManager.remove(entityManager.find(Curso.class, codigo));
		// tx.commit();

	}

}
