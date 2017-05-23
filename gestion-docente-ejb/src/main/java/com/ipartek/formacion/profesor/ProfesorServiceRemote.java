package com.ipartek.formacion.profesor;

import java.util.List;

import javax.ejb.Remote;

import com.ipartek.formacion.persistence.Profesor;

@Remote
public interface ProfesorServiceRemote {

	public List<Profesor> getAll();

	public Profesor getById(long codigo);

	public Profesor create(Profesor profesor);

	public Profesor update(Profesor profesor);

	public void delete(long codigo);

}
