package com.philips.pms.objects;

public class PatientFeatures {
	
	double pulseRate;
	double insulinLevel;
	
	public PatientFeatures(double pulseRate, double insulinLevel) {
		super();
		this.pulseRate = pulseRate;
		this.insulinLevel = insulinLevel;
	}
	public PatientFeatures() {		
	}
	

	public double getPulseRate() {
		return pulseRate;
	}
	public boolean setPulseRate(double pulseRate) {
		this.pulseRate = pulseRate;
		return true;
	}
	public double getInsulinLevel() {
		return insulinLevel;
	}
	public boolean setInsulinLevel(double insulinLevel) {
		this.insulinLevel = insulinLevel;
		return true;
	}
	
}
