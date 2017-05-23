package com.ipartek.formacion.service.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Cliente;

public interface ClienteService {
	public Cliente create(Cliente cliente);

	public Cliente getById(int codigo);

	public List<Cliente> getAll();

	public Cliente update(Cliente cliente);

	public void delete(int codigo);

	public Cliente getByIdentificador(String identificador);

	public Cliente getInforme(int codigo);

}
