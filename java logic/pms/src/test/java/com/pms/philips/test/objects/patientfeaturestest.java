package com.pms.philips.test.objects;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philips.pms.objects.PatientFeatures;

public class PatientFeaturesTest {

	@Test
	public void test() {
		PatientFeatures pf=new PatientFeatures(123,321);
		pf=new PatientFeatures();
		assertTrue(pf.setPulseRate(111));
		assertTrue(pf.setInsulinLevel(112));
		assertTrue(111.0==pf.getPulseRate());
		assertTrue(112.0==pf.getInsulinLevel());

	}

}
