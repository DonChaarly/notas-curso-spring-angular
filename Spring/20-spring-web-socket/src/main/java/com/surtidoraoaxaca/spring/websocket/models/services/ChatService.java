package com.surtidoraoaxaca.spring.websocket.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surtidoraoaxaca.spring.websocket.models.dao.IChatRepository;
import com.surtidoraoaxaca.spring.websocket.models.entitys.Mensaje;

@Service
public class ChatService implements IChatService{
	
	@Autowired
	private IChatRepository chatDao;

	@Override
	public List<Mensaje> obtenerUltimos10Mensajes() {
		return chatDao.findFirst10ByOrderFechaDesc();
	}

	@Override
	public Mensaje guardar(Mensaje mensaje) {
		return chatDao.save(mensaje);
	}

}
