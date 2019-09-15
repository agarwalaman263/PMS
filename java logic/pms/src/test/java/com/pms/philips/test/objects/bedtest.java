package com.pms.philips.test.objects;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philips.pms.objects.Bed;
import com.philips.pms.objects.Patients;

public class BedTest {

	@Test
	public void test() {
		Bed b=new Bed();
		Patients patient1=b.setPatients();
		Patients patient2=b.getPatient();
		// assertTrue(b.toString().contains("first=" + first));
		b.toString();
		assertTrue(patient1.equals(patient2));
		assertTrue(patient1.equals(b.getBed()));
		assertTrue(b.unsubscribe());
		
		
	}

}
