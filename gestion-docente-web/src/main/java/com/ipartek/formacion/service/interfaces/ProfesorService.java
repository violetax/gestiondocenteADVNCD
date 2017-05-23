package com.ipartek.formacion.service.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Profesor;

public interface ProfesorService<T> extends TrabajadorService<T> {

	public Profesor create(Profesor profesor);

	public List<Profesor> getAll();

	public Profesor getById(int codigo);

	public Profesor update(Profesor profesor);

	public void delete(int codigo);

}
