package com.surtidoraoaxaca.backend.api.rest.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.surtidoraoaxaca.backend.api.rest.models.entity.Cliente;
import com.surtidoraoaxaca.backend.api.rest.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long>{
	
	
	@Query("from Region")
	public List<Region> findAllRegiones();
	

}
