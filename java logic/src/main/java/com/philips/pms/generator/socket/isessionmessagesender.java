package com.philips.pms.generator.socket;

import java.io.IOException;

import org.springframework.web.socket.WebSocketSession;

public interface ISessionMessageSender {

	public void sendMessage(WebSocketSession ws,String type) throws IOException;
}
