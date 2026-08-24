package com.sist.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
// STOMP 기반의 WebSocket 기능을 활성화
/*
 * 	new SockJS("/ws-chat") : 서버 연결
 * 		 |
 * 	SpringBoot WebSocket
 * 		 |
 * 	WebSocket 연결
 * 		 |
 * 	setAllowedOriginPatterns("*") 접속 허용
 *       |
 *   withSockJS()
 *   	=> new SockJS("ws-chat")
 * 
 */
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{

	// Client가  WebSocket 서버에 처음 접속할 주소 등록
	//  /ws-chat
	/*
	 * 	registry.addEndPoint("/ws-chat")
	 * 	=> new sockJS("/ws-chat")
	 */
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		// TODO Auto-generated method stub
		//WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
		// 1. 클라이언트가 서버에 접속할 URI 주소
		// origin => 모든 클라리언트가 접속이 가능하게 
		// => 실제는 지정된 도메인만 허용
		registry.addEndpoint("/ws-chat")
				.setAllowedOriginPatterns("*")
				.withSockJS();
	}
	// URI 이용 => 자바 채팅 => 번호
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		// TODO Auto-generated method stub
		//WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
		// 채널 => 클라이언트가 서버에서 보낸 데이터를 읽어서 출력
		registry.enableSimpleBroker("/topic");
		// 메세지를 보내는 경우(보내는 곳)
		registry.setApplicationDestinationPrefixes("/app");
	}
	
}
