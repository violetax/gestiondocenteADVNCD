package com.ipartek.formacion.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ipartek.formacion.cliente.ClienteServiceRemote;
import com.ipartek.formacion.persistence.Cliente;
import com.ipartek.formacion.service.interfaces.ClienteServiceEJB;

public class ClienteServiceEJBImp implements ClienteServiceEJB {
	@Autowired
	private ClienteServiceRemote clienteServiceRemote;
	private final static Logger LOGGER = LoggerFactory.getLogger(ClienteServiceEJBImp.class);

	/**
	 * @return the clienteServiceRemote
	 */
	public ClienteServiceRemote getClienteServiceRemote() {
		return clienteServiceRemote;
	}

	@Override
	public void setClienteServiceRemote(ClienteServiceRemote clienteServiceRemote) {
		this.clienteServiceRemote = clienteServiceRemote;
	}

	@Override
	public List<Cliente> getAll() {

		return clienteServiceRemote.getAll();
	}

	@Override
	public Cliente getById(long codigo) {

		return clienteServiceRemote.getById(codigo);
	}

	/**
	 * @param clienteServiceRemote
	 *            the clienteServiceRemote to set
	 */

}
