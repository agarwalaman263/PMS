package com.philips.pms.objects;

public class PatientDetails {
	
	String patientId;
	String  type;
   
	

	public void setType(String type) {
		this.type = type;
	}



	public PatientDetails(String id,String type) {
		super();
		this.patientId = id;
		this.type=type;
	}



	public void setId(String id) {
		this.patientId=id;
		
	}


}
