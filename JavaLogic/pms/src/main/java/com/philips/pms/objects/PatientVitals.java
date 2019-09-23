package com.philips.pms.objects;

public class PatientVitals {

	private PatientDetails patientDemographics;
	private PatientFeatures vitals;

	public PatientVitals() {
		
	}
	
	public PatientVitals(PatientDetails patientDemographics, PatientFeatures patientVitals) {
		super();
		this.setPatientDemographics(patientDemographics);
		this.setPatientVitals(patientVitals);
	}

	public PatientFeatures getPatientVitals() {
		return vitals;
	}

	public boolean setPatientVitals(PatientFeatures patientVitals) {
		this.vitals = patientVitals;
		return true;
	}

	public PatientDetails getPatientDemographics() {
		return patientDemographics;
	}

	public boolean setPatientDemographics(PatientDetails patientDemographics) {
		this.patientDemographics = patientDemographics;
		return true;
	}


}

