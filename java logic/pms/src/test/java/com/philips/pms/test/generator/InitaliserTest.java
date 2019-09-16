package com.philips.pms.test.generator;

import static org.junit.Assert.*;



import org.junit.Test;

import com.philips.pms.generator.Initialiser;

import com.philips.pms.objects.PatientFeatures;

public class InitaliserTest {

	@Test
	public void test() {
		Initialiser in=new Initialiser();

		PatientFeatures pf=in.initialise();
		assertEquals(in.patientFeatures,pf);
		
	}

}
