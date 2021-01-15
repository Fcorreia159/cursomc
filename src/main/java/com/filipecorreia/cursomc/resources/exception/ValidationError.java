package com.filipecorreia.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandartError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessege> erros = new ArrayList<>();
	
	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
		
	}

	public List<FieldMessege> getErros() {
		return erros;
	}

	public void setList(List<FieldMessege> list) {
		this.erros = list;
	}

	public void addError(String fieldName, String messagem) {
		erros.add(new FieldMessege(fieldName, messagem));
	}

}
