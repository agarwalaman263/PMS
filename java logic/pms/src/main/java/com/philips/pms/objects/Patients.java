package com.philips.pms.objects;

public class Patients {

	private String id;
	private Alarms activatedAlarms;

	public Patients() {
		super();
		this.id = ListData.idCounter+++"";
		this.activatedAlarms = new Alarms();
	}

	public String getId() {
		return id;
	}

	public Alarms getActivatedAlarms() {
		return activatedAlarms;
	}
	
	public boolean unsubscribe() {
		activatedAlarms=null;
		return true;
	}

	public boolean subscribe() {
		activatedAlarms=new Alarms();
		return true;
	}
	
	@Override
	public String toString() {
		return "patients [id=" + id + "]";
	}

}
