package com.philips.pms.test.controller;

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
import com.philips.pms.objects.ListData;
import com.philips.pms.objects.Patients;
import com.philips.pms.patient.IPatientAdmiter;

@RunWith(SpringRunner.class)
@WebMvcTest(PatientController.class)
public class PatientControllerTest {

	private MockMvc mockMvc;

	@Mock
	private IPatientAdmiter patientAdmit;

	@InjectMocks
	private PatientController patientController;

	@Before
	public void setUp() throws Exception {

		mockMvc = MockMvcBuilders.standaloneSetup(patientController).apply(sharedHttpSession()).build();
		ListData.getPatientList().add(new Patients());

	}

	@Test
	public void testHelloWorld() throws Exception {

		mockMvc.perform(get("/pms/patients")).andExpect(status().isOk());

		mockMvc.perform(get("/pms/patients/register/0")).andExpect(status().isOk());

		mockMvc.perform(get("/pms/patients/0")).andExpect(status().isOk());
	}

}
