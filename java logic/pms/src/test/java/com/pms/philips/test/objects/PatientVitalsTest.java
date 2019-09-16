package com.pms.philips.test.objects;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philips.pms.objects.PatientDetails;
import com.philips.pms.objects.PatientFeatures;
import com.philips.pms.objects.PatientVitals;

public class PatientVitalsTest {

	@Test
	public void test() {
		
		PatientVitals pv=new PatientVitals();
		
		PatientDetails pd=new PatientDetails("123","test");
		PatientFeatures pf= new PatientFeatures(111,222);
		pv=new PatientVitals(new PatientDetails("1","dummy"),new PatientFeatures(1,2));
		assertTrue(pv.setPatientVitals(pf));
		assertTrue(pv.setPatientDemographics(pd));
		assertEquals(pf, pv.getPatientVitals());
		assertEquals(pd, pv.getPatientDemographics());
		
		
		
	}

}
