package com.surtidoraoaxaca.backend.api.rest.auth;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.surtidoraoaxaca.backend.api.rest.model.services.IUsuarioService;
import com.surtidoraoaxaca.backend.api.rest.models.entity.Usuario;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	
	@Autowired
	private IUsuarioService usuarioService;

	//En este metodo se configura la informacion adicional que tendra el token
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		//Con el objeto authentication se puede obtener informacion del usuario que esta ingresando
		Usuario usuario = usuarioService.findByUsername(authentication.getName());
		Map<String, Object> info = new HashMap<>();
		
		//Se puede ir agregando la informacion que queramos al map
		info.put("info_adicional", "Hola que tal!".concat(authentication.getName()));
		info.put("nombre", usuario.getNombre());
		info.put("apellido", usuario.getApellido());
		info.put("emial", usuario.getEmail());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}
