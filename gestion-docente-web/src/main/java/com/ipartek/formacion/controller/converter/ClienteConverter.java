package com.ipartek.formacion.controller.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.ipartek.formacion.persistence.Cliente;
import com.ipartek.formacion.service.interfaces.ClienteServiceEJB;

public class ClienteConverter implements Converter<String, Cliente> {

	@Autowired
	ClienteServiceEJB cS;

	@Override
	public Cliente convert(String codigo) {
		long cod = Long.parseLong(codigo);
		return cS.getById(cod);
	}

}
