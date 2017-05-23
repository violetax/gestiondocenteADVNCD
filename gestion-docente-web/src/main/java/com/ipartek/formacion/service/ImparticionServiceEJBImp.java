package com.ipartek.formacion.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.imparticion.ImparticionServiceRemote;
import com.ipartek.formacion.persistence.Imparticion;
import com.ipartek.formacion.service.interfaces.ImparticionServiceEJB;

@Service("imparticionServiceImp")
public class ImparticionServiceEJBImp implements ImparticionServiceEJB {

	@Autowired
	ImparticionServiceRemote imparticionServiceRemote;
	private final static Logger LOGGER = LoggerFactory.getLogger(ImparticionServiceEJBImp.class);

	@Override
	public List<Imparticion> getAll() {

		return imparticionServiceRemote.getAll();
	}

	@Override
	public Imparticion create(Imparticion imparticion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Imparticion getById(long codigo) {

		return imparticionServiceRemote.getById(codigo);
	}

	@Override
	public void delete(long codigo) {
		imparticionServiceRemote.delete(codigo);
	}

	@Override
	public void update(Imparticion imparticion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setImparticionServiceRemote(ImparticionServiceRemote imparticionService) {
		this.imparticionServiceRemote = imparticionService;
	}

}
