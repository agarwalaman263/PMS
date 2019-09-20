package com.philips.pms.objects;

public class PatientDetails {
	
	String patientId;
	String  type;
   
	

	public boolean setType(String type) {
		this.type = type;
		return true;
	}



	public PatientDetails(String id,String type) {
		super();
		this.patientId = id;
		this.type=type;
	}



	public boolean setId(String id) {
		this.patientId=id;
		return true;
		
	}


}
