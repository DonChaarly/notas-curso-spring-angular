package com.surtidoraoaxaca.backend.api.rest.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.surtidoraoaxaca.backend.api.rest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
