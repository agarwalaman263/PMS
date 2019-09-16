package com.philips.pms.objects;

public class Bed {

	
	Patients patientObj;
	int id;

	public Bed() {
		patientObj=new Patients();
		id=ListData.bedIdCounter++;
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


	@Override
	public String toString() {
		return "{BedId :"+id+", "+ "registeredPatient: {" + patientObj + "}";
	}
}
