package com.ipartek.formacion.imparticion;

import java.util.List;

import javax.ejb.Remote;

import com.ipartek.formacion.persistence.Imparticion;

@Remote
public interface ImparticionServiceRemote {

	public List<Imparticion> getAll();

	public Imparticion create(Imparticion imparticion);

	public Imparticion getById(long codigo);

	public void delete(long codigo);

	public Imparticion update(Imparticion imparticion);
}
