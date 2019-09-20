package com.philips.pms.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.philips.pms.App;

public class AppTest {

	@RunWith(SpringRunner.class)
	@SpringBootTest(classes = App.class)
	public class ApplicationTests {

	    @Test
	    public void contextLoads() {
	    }
	}
}
