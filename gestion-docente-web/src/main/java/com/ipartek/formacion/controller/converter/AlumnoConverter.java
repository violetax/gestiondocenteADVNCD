package com.ipartek.formacion.controller.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.ipartek.formacion.persistence.Alumno;
import com.ipartek.formacion.service.interfaces.AlumnoServiceEJB;

public class AlumnoConverter implements Converter<String, Alumno> {
	@Autowired
	AlumnoServiceEJB aS;
	private static final Logger LOGGER = LoggerFactory.getLogger(AlumnoConverter.class);

	@Override
	public Alumno convert(String codigo) {
		Alumno alumno = aS.getById(Long.parseLong(codigo));
		return alumno;
	}

}
