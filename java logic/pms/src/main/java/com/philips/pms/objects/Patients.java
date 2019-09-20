package com.philips.pms.objects;

public class Patients {

	private int id;
	//private Alarm activatedAlarms;

	public Patients() {
		super();
		this.id = ListData.patientIdCounter++;
	//	this.activatedAlarms = new Alarm();
	}

	public int getId() {
		return id;
	}

	/*
	 * public Alarm getActivatedAlarms() { return activatedAlarms; }
	 * 
	 * public boolean unsubscribe() { activatedAlarms=null; return true; }
	 * 
	 * public boolean subscribe() { activatedAlarms=new Alarm(); return true; }
	 */	
	
	@Override
	public String toString() {
		return "{patientsId :" + id + "}";
	}

}
