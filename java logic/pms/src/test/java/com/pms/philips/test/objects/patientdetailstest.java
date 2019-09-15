package com.pms.philips.test.objects;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philips.pms.objects.PatientDetails;

public class PatientDetailsTest {

	@Test
	public void test() {
		
		PatientDetails pd=new PatientDetails("12", "Dummy");
		assertTrue(pd.setType("Test"));
		assertTrue(pd.setId("12"));

	}

}
