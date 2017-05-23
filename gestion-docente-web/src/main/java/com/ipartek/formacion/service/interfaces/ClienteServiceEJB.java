package com.ipartek.formacion.service.interfaces;

import java.util.List;

import com.ipartek.formacion.cliente.ClienteServiceRemote;
import com.ipartek.formacion.persistence.Cliente;

public interface ClienteServiceEJB {

	public List<Cliente> getAll();

	public Cliente getById(long codigo);

	public void setClienteServiceRemote(ClienteServiceRemote clienteServiceRemote);
}