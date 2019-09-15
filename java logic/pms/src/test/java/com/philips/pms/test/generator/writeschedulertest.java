package com.philips.pms.test.generator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philips.pms.generator.WriteScheduler;

public class WriteSchedulerTest {

	@Test
	public void test() {
		WriteScheduler ws=new WriteScheduler();
		assertTrue(ws.schedule(2, "Generator").contains("patientDemographics"));
	}

}
