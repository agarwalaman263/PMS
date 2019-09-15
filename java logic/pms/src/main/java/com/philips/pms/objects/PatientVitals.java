package com.philips.pms.objects;

public class PatientVitals {

	private PatientDetails patientDemographics;
	private PatientFeatures patientVitals;

	public PatientVitals(PatientDetails patientDemographics, PatientFeatures patientVitals) {
		super();
		this.patientDemographics = patientDemographics;
		this.patientVitals = patientVitals;
	}

	/*
	 * public PatientFeatures getContent() { return patientVitals ; }
	 */
}

