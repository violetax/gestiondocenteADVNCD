package com.ipartek.formacion.evaluacion;

import javax.ejb.Local;

import com.ipartek.formacion.persistence.Evaluacion;

@Local
public interface EvaluacionServiceLocal {

	public Evaluacion update(Evaluacion evaluacion);
}
