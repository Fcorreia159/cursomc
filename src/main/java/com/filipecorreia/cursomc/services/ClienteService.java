package com.filipecorreia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filipecorreia.cursomc.domain.Cliente;
import com.filipecorreia.cursomc.repositories.ClienteRepository;
import com.filipecorreia.cursomc.services.exception.ObjectNotFoundException;



@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(()->new ObjectNotFoundException ("Objeto não encontrado: "+ id +", tipo: " + Cliente.class.getName()));
	}
}
