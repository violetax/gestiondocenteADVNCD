package com.ipartek.formacion.service.interfaces;

import java.util.List;

import com.ipartek.formacion.imparticion.ImparticionServiceRemote;
import com.ipartek.formacion.persistence.Imparticion;

public interface ImparticionServiceEJB {
	public List<Imparticion> getAll();

	public Imparticion create(Imparticion imparticion);

	public Imparticion getById(long codigo);

	public void delete(long codigo);

	public void update(Imparticion imparticion);

	public void setImparticionServiceRemote(ImparticionServiceRemote imparticionService);

}
