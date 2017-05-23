package com.ipartek.formacion.imparticion;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import com.ipartek.formacion.persistence.Imparticion;

/**
 * Session Bean implementation class ImparticionServiceBean
 */
@Stateless(name = "imparticionServiceBean")
public class ImparticionServiceBean implements ImparticionServiceRemote {
	private static final Logger LOGGER = Logger.getLogger(ImparticionServiceBean.class);

	@PersistenceContext(unitName = "gestiondocente")
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ImparticionServiceBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Imparticion> getAll() {
		TypedQuery<Imparticion> pimparticion = entityManager.createNamedQuery("imparticion.getAll", Imparticion.class);
		return pimparticion.getResultList();

	}

	@Override
	public Imparticion create(Imparticion imparticion) {
		LOGGER.info(imparticion.toString());

		imparticion = entityManager.merge(imparticion);

		return imparticion;
	}

	@Override
	public Imparticion getById(long codigo) {

		return entityManager.find(Imparticion.class, codigo);

	}

	@Override
	public void delete(long codigo) {
		entityManager.remove(entityManager.find(Imparticion.class, codigo));

	}

	@Override
	public Imparticion update(Imparticion imparticion) {
		LOGGER.info("update:" + imparticion.toString());
		imparticion = entityManager.merge(imparticion);
		return imparticion;

	}

}
