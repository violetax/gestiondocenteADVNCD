package com.ipartek.formacion.controller.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.ipartek.formacion.persistence.Imparticion;
import com.ipartek.formacion.service.interfaces.ImparticionServiceEJB;

public class ImparticionConverter implements Converter<String, Imparticion> {
	@Autowired
	ImparticionServiceEJB iS;
	private static final Logger LOGGER = LoggerFactory.getLogger(ImparticionConverter.class);

	@Override
	public Imparticion convert(String codigo) {
		LOGGER.info(codigo);
		Imparticion imparticion = iS.getById(Long.parseLong((String) codigo));

		LOGGER.info(imparticion.toString());
		return imparticion;
	}
}
