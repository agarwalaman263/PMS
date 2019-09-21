package com.philips.pms.test.generator.socket;



import java.io.IOException;
import java.net.InetSocketAddress;	
import java.net.URI;
import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketExtension;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.philips.pms.generator.sockets.SocketHandler;
import com.philips.pms.objects.ListData;
import com.philips.pms.objects.Patients;



public class WebSocketConfigTest extends TextWebSocketHandler{
	
	
	//private MockMvc mockMvc;

	@Test
	public void test() throws Exception {
		
		SocketHandler sh= new SocketHandler();
		//sh.afterConnectionEstablished(WebSocketSession session)
		WebSocketSession ws=new WebSocketSession() {
			
			@Override
			public void setTextMessageSizeLimit(int messageSizeLimit) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBinaryMessageSizeLimit(int messageSizeLimit) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void sendMessage(WebSocketMessage<?> message) throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isOpen() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public URI getUri() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getTextMessageSizeLimit() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public InetSocketAddress getRemoteAddress() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Principal getPrincipal() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public InetSocketAddress getLocalAddress() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public HttpHeaders getHandshakeHeaders() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<WebSocketExtension> getExtensions() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getBinaryMessageSizeLimit() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Map<String, Object> getAttributes() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getAcceptedProtocol() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void close(CloseStatus status) throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
		
		TextMessage tm = new TextMessage("test");
		ListData.patientAdmitQueue.add(new Patients());
		sh.afterConnectionEstablished(ws);
		sh.handleMessage(ws, tm);

		
		
		
		
	}

}
