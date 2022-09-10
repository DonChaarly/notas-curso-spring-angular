package com.surtidoraoaxaca.backend.api.rest.model.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.surtidoraoaxaca.backend.api.rest.models.entity.Cliente;
import com.surtidoraoaxaca.backend.api.rest.models.entity.Region;

public interface IClienteService {
	
	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById	(Long id);
	
	public Cliente save (Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();
	

}
