package com.surtidoraoaxaca.spring.websocket.models.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.surtidoraoaxaca.spring.websocket.models.entitys.Mensaje;

public interface IChatRepository extends MongoRepository<Mensaje, String>{
	
	public List<Mensaje> findFirst10ByOrderFechaDesc();
	

}
