package com.henriqueborges.cursomcLinux.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriqueborges.cursomcLinux.domain.Cliente;
import com.henriqueborges.cursomcLinux.repositories.ClienteRepository;
import com.henriqueborges.cursomcLinux.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ",  Tipo: " + Cliente.class.getName()));
		
	}
}
