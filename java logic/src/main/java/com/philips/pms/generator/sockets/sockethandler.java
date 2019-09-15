package com.philips.pms.generator.sockets;

import com.philips.pms.generator.WriteScheduler;
import com.philips.pms.objects.ListData;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class SocketHandler extends TextWebSocketHandler {
	private Timer timer = new Timer();
	static List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

	
	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message)
			throws InterruptedException, IOException {

		ListData.msg.sendMessage(session,  "GeneratorSetter");

		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {

				try {
					if (!ListData.patientAdmitQueue.isEmpty()) {

						session.sendMessage(new TextMessage(new WriteScheduler()
								.schedule(ListData.patientAdmitQueue.poll().getId(), "GeneratorSetter")));

					} else if (!ListData.patientDischargeQueue.isEmpty()) {

						session.sendMessage(new TextMessage(new WriteScheduler()
								.schedule(ListData.patientDischargeQueue.poll().getId(), "DeleatPatient")));

					} else {
						
						ListData.msg.sendMessage(session,  "Generator");

					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}, 1000, 5000);

	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		// the messages will be broadcasted to all users.
		sessions.add(session);
	}

}