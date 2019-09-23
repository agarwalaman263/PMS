package com.philips.pms.test.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.SharedHttpSessionConfigurer.sharedHttpSession;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.philips.pms.controller.IcuController;
import com.philips.pms.controller.PatientController;
import com.philips.pms.icu.IBedHandler;
import com.philips.pms.icu.IDischarger;
import com.philips.pms.objects.Bed;
import com.philips.pms.objects.ListData;
import com.philips.pms.objects.Patients;
import com.philips.pms.patient.IPatientAdmiter;


@RunWith(SpringRunner.class)
@WebMvcTest(PatientController.class)
public class IcuControllerTest {

	private MockMvc mockMvc;

	@Mock
	private IBedHandler bedHandler;

	@Mock
	private IDischarger discharge;


	@InjectMocks
	private IcuController icuController;


	@Before
	public void setUp() throws Exception {

		mockMvc = MockMvcBuilders.standaloneSetup(icuController).apply(sharedHttpSession()).build();
		ListData.getPatientList().add(new Patients());
		ListData.getBedList().add(new Bed());

	}

	@Test
	public void testHelloWorld() throws Exception {

		mockMvc.perform(get("/pms/bed/config/4")).andExpect(status().isOk());

		mockMvc.perform(get("/pms/bed")).andExpect(status().isOk());
		
		mockMvc.perform(get("/pms/bed/0")).andExpect(status().isOk());

		mockMvc.perform(get("/pms/bed/config/0/unsubscribe")).andExpect(status().isOk());
	}

	


}
