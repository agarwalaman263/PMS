package com.philips.pms.objects;

public class Beds {

	
	Patients patientObj;

	public Beds() {
		patientObj=new Patients();
	}
	
	
	public Patients getBed()
	{
		return patientObj;
	}
	

	
	public boolean unsubscribe()
	{
		
		patientObj=null;
		return true;
	}

	public Patients getPatient() {
		return patientObj;
	}
	
	public Patients setPatients() {
		patientObj=new Patients();
		return patientObj;
		
	}
}
