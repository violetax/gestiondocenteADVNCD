package com.ipartek.formacion.evaluacion;

import javax.ejb.Remote;

import com.ipartek.formacion.persistence.Evaluacion;

@Remote
public interface EvaluacionServiceRemote {

	public Evaluacion getById();
}
