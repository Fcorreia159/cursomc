package com.filipecorreia.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandartError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessege> erros = new ArrayList<>();
	


	public ValidationError(Long timestamp, Integer status, String error, String message, String path) {
		super(timestamp, status, error, message, path);
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
