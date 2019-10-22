package com.henriqueborges.cursomcLinux.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriqueborges.cursomcLinux.domain.Pedido;
import com.henriqueborges.cursomcLinux.repositories.PedidoRepository;
import com.henriqueborges.cursomcLinux.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ",  Tipo: " + Pedido.class.getName()));
		
	}
}
