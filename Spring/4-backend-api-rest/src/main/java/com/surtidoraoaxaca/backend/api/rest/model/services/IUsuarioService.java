package com.surtidoraoaxaca.backend.api.rest.model.services;

import com.surtidoraoaxaca.backend.api.rest.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
