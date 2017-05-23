package com.ipartek.formacion.service.interfaces;

import java.util.List;

import com.ipartek.formacion.alumno.AlumnoServiceRemote;
import com.ipartek.formacion.persistence.Alumno;

public interface AlumnoServiceEJB {
	public void setAlumnoServiceRemote(AlumnoServiceRemote alumnoRemote);

	public List<Alumno> getAll();

	public Alumno getById(long codigo);
}
