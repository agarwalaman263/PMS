package com.philips.pms.test.icu;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philips.pms.icu.BedHandler;
import com.philips.pms.icu.DischargerImpl;
import com.philips.pms.objects.ListData;

public class DischargerImplTest {

	@Test
	public void test() {
		BedHandler bh=new BedHandler();
		bh.addBeds(3);
		DischargerImpl dl=new DischargerImpl();
		assertEquals(dl.unsubscribeBed(2), ListData.getBedList().get(2).unsubscribe());
	}

}
