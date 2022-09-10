package com.surtidoraoaxaca.backend.api.rest.auth;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter{
	
	//se agrega una instancia del encriptador de contrasena
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	//Se agrega una intancia del metodo authenticationManager 
	@Autowired
	@Qualifier("authenticationManager")
	private AuthenticationManager authenticationManager;
	
	//Se agrega una intancia de la clase infoAdicionalToken
	@Autowired
	private InfoAdicionalToken infoAdicionalToken;

	//Este metodo se encarga de configurar los permisos de nuestro endpoints o rutas de acceso
	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security.tokenKeyAccess("permitAll()")
		.checkTokenAccess("isAuthenticated()");
	}

	//Este metodo se encarga de la configuracin de clientes tienene autorizacion a conectarse al backend
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		
		//Se coloca el nombre del usuario que sera nuestro cliente angular
		//Se coloca la contrasena, la cual se codifica con el metodo encode
		//Se coloca los permisos que tendra, en este caso de lectura y escritura
		//Se coloca el tip de concecion que tendra la aplicacion en este caso por password y refresh token, el cual renueva el token automaticamente cada que va a caducar
		//Se tiene otros tipos de autenticacion a parte de password, como el authorization Code, implicita
		//Se coloca tambien el tiempo en que caducara el token
		//Se coloca tambien el tiempo en que se renovara el token automaticamente
		clients.inMemory().withClient("angularapp")
		.secret(passwordEncoder.encode("12345"))
		.scopes("read", "write")
		.authorizedGrantTypes("password", "refresh_token")
		.accessTokenValiditySeconds(3600)
		.refreshTokenValiditySeconds(3600);
	}

	//Este metodo se encarga de todo el proceso de autenticacion y validar el token
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
		tokenEnhancerChain.setTokenEnhancers(Arrays.asList(infoAdicionalToken, accessTokenConverter()));
		
		endpoints.authenticationManager(authenticationManager)
		.tokenStore(tokenStore())
		.accessTokenConverter(accessTokenConverter())
		.tokenEnhancer(tokenEnhancerChain);
	}
	//Este metodo se puede omitir al igual que el .tokenStore de arriba
	@Bean
	public JwtTokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}
	
	//Este metodo se encarga de traduccion de la informacion del token para decodificar los datos y codificarlos tambien 
	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
		jwtAccessTokenConverter.setSigningKey(JwtConfig.RSA_PRIVADA);
		jwtAccessTokenConverter.setVerifierKey(JwtConfig.RSA_PUBLICA);
		return jwtAccessTokenConverter;
	}
	
	

}
