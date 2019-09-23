package com.philips.pms.test.patient;

import static org.junit.Assert.*;


import org.junit.Test;

import com.philips.pms.icu.BedHandler;
import com.philips.pms.objects.ListData;
import com.philips.pms.patient.PatientAdmiterImpl;

public class PatientAdmiterTest {

	@Test
	public void test() {
		
		PatientAdmiterImpl pa=new PatientAdmiterImpl();
		BedHandler bh=new BedHandler();
		bh.addBeds(3);
		assertEquals("bed is occupied", pa.patientAdmit(1));
		ListData.getBedList().get(2).unsubscribe();
		assertEquals("patiend added to bed :" + 2, pa.patientAdmit(2));
		
		
	}

}
