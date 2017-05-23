package com.ipartek.formacion.evaluacion;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.ipartek.formacion.persistence.Evaluacion;

/**
 * Session Bean implementation class EvaluacionServiceBean
 */
@Stateless
@LocalBean
public class EvaluacionServiceBean implements EvaluacionServiceRemote, EvaluacionServiceLocal {

	/**
	 * Default constructor.
	 */
	public EvaluacionServiceBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Evaluacion update(Evaluacion evaluacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evaluacion getById() {
		// TODO Auto-generated method stub
		return null;
	}

}
