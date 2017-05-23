package com.ipartek.formacion.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.alumno.AlumnoServiceRemote;
import com.ipartek.formacion.persistence.Alumno;
import com.ipartek.formacion.service.interfaces.AlumnoServiceEJB;

@Service("alumnoServiceEJBImp")
public class AlumnoServiceEJBImp implements AlumnoServiceEJB {
	@Autowired
	private AlumnoServiceRemote alumnoServiceRemote;
	private final static Logger LOGGER = LoggerFactory.getLogger(AlumnoServiceEJBImp.class);

	@Override
	public void setAlumnoServiceRemote(AlumnoServiceRemote alumnoRemote) {
		this.alumnoServiceRemote = alumnoRemote;

	}

	@Override
	public List<Alumno> getAll() {
		return alumnoServiceRemote.getAll();
	}

	@Override
	public Alumno getById(long codigo) {

		return alumnoServiceRemote.getById(codigo);
	}
}
