package com.philips.pms.generator;

import java.util.Timer;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.philips.pms.objects.PatientDetails;
import com.philips.pms.objects.PatientFeatures;
import com.philips.pms.objects.PatientVitals;

@Component
public class WriteScheduler {

	private Gson gson = new GsonBuilder().setPrettyPrinting().create();
	public static final Timer timer = new Timer();
	private long currentTime;
	String jsonString;

	public String schedule(int id,String type) {

		PatientDetails patientDetails = new PatientDetails(id+"",type);
		setCurrentTime(System.currentTimeMillis());
		PatientFeatures features = new Initialiser().initialise();
		PatientVitals ft = new PatientVitals(patientDetails, features);
		jsonString = gson.toJson(ft);
		

		return jsonString;

	}

	public long getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
	}

}