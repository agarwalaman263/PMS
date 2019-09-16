package com.philips.pms.generator;

import java.text.DecimalFormat;

import com.philips.pms.objects.Constants;
import com.philips.pms.objects.PatientFeatures;

public class Initialiser {


	public DecimalFormat df = new DecimalFormat(Constants.DECIMAL_FORMATTER);
	public Randomiser rand = new Randomiser();

	public PatientFeatures patientFeatures;
	
	public PatientFeatures initialise() {

		patientFeatures=new PatientFeatures(rand.randomInt(Constants.PULSE_RATE_MIN, Constants.PULSE_RATE_MAX),
				rand.randomInt(Constants.INSULINE_LEVEL_MIN, Constants.INSULINE_LEVEL_MAX)
				);
		return (patientFeatures);

	}

}
