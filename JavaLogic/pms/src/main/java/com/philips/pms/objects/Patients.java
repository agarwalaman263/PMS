package com.philips.pms.objects;

public class Patients {

	private int id;
	

	public Patients() {
		this.id = ListData.setPatientIdCounter(ListData.getPatientIdCounter()+1);
	
	}

	public int getId() {
		return id;
	}

	
	
	@Override
	public String toString() {
		return "{patientsId :" + id + "}";
	}

}
