package com.philips.pms.generator.socket;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.philips.pms.generator.WriteScheduler;
import com.philips.pms.objects.ListData;
import com.philips.pms.objects.Patients;

@Service
public class SessionMessageSenderImpl implements ISessionMessageSender {

	@Override
	public void sendMessage(WebSocketSession ws,String type) throws IOException {
		for (Patients patient : ListData.patientList) {
			ws.sendMessage(new TextMessage(new WriteScheduler().schedule(patient.getId(), type)));
		}
		
	}

}
