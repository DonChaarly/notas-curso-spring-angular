package com.surtidoraoaxaca.spring.websocket.models.services;

import java.util.List;

import com.surtidoraoaxaca.spring.websocket.models.entitys.Mensaje;

public interface IChatService {
	
	public List<Mensaje> obtenerUltimos10Mensajes();
	public Mensaje guardar(Mensaje mensaje);

}
