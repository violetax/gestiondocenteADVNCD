package com.ipartek.formacion.cliente;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.ipartek.formacion.persistence.Cliente;

/**
 * Session Bean implementation class ClienteServiceBean
 */
@Stateless(name = "clienteServiceBean")
public class ClienteServiceBean implements ClienteServiceRemote {

	@PersistenceContext(unitName = "gestiondocente")
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ClienteServiceBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Cliente> getAll() {
		TypedQuery<Cliente> pcliente = entityManager.createNamedQuery("cliente.getAll", Cliente.class);

		return pcliente.getResultList();
	}

	@Override
	public Cliente getById(long codigo) {
		return entityManager.find(Cliente.class, codigo);
	}

}
