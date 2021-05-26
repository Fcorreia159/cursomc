package com.filipecorreia.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filipecorreia.cursomc.domain.Estado;
import com.filipecorreia.cursomc.repositories.EstadoRepositoy;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepositoy repo;

	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}
	
}
