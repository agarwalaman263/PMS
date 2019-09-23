package com.philips.pms.test.icu;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philips.pms.icu.BedHandler;
import com.philips.pms.objects.ListData;

public class BedHandlerTest {

	@Test
	public void test() {
		BedHandler bh=new BedHandler();
		assertEquals(bh.addBeds(2), ListData.getBedList().size()+" beds created");;
		
	}

}
