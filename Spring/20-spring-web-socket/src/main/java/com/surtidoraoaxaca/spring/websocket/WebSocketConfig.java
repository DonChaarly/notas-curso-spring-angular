package com.surtidoraoaxaca.spring.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{

	//Este metodo configura las rutas de los clientes que podran conectarse al servidor
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		
		//Con addEnpoint se especifica una ruta URL con la que el cliente se conectara al servidor
		//Con setAllowedOriginPatterns se especifica la ruta del cliente al que se le permitira conectarse al servidor
		//withSockJs nos permie utilizar el protocolo http para conectarnos al servidor de webSocket
		registry.addEndpoint("/chat-websocket")
		.setAllowedOriginPatterns("http://localhost:4200")
		.withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		//Con enableSimpleBroker se especifica el nombre del evento que causara el servidor al emitir un mensaje
		//los clientes se podran suscribir a este evento
		registry.enableSimpleBroker("/chat/");
		//Con setApplicationDestinationPrefixes se especifica el nombre de destino al que el cliente enviara mensajes
		registry.setApplicationDestinationPrefixes("/app");
	
	}
	
	

}
