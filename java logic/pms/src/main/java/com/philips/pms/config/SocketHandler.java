package com.philips.pms.config;

import com.google.gson.Gson;
import com.philips.pms.generator.WriteScheduler;
import com.philips.pms.objects.ListData;
import com.philips.pms.objects.Patients;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class SocketHandler extends TextWebSocketHandler {
	private Timer timer = new Timer();
	List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message)
			throws InterruptedException, IOException {
		
		System.out.println("attacked");
		for (Patients 	patient	 : ListData.patientList) {
			
				session.sendMessage(new TextMessage(new WriteScheduler().schedule(patient.getId(),"GeneratorSetter")));
			} 
		
		
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				for (Patients 	patient	 : ListData.patientList) {
					try {
						session.sendMessage(new TextMessage(new WriteScheduler().schedule(patient.getId(),"Generator")));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}, 1000, 5000);
		
		
	}
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		//the messages will be broadcasted to all users.
		sessions.add(session);
	}

}