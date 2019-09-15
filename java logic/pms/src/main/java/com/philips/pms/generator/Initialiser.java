package com.philips.pms.generator;

import java.text.DecimalFormat;

import com.philips.pms.objects.Constants;
import com.philips.pms.objects.PatientFeatures;

public class Initialiser {


	private DecimalFormat df = new DecimalFormat(Constants.DECIMAL_FORMATTER);
	private Randomiser rand = new Randomiser();

	public PatientFeatures initialise() {

		return (new PatientFeatures(rand.randomInt(Constants.PULSE_RATE_MIN, Constants.PULSE_RATE_MAX),
				rand.randomInt(Constants.INSULINE_LEVEL_MIN, Constants.INSULINE_LEVEL_MAX)
				));

	}

}
