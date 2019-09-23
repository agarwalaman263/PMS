package com.philips.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.philips.pms.objects.ListData;

import com.philips.pms.patient.IPatientAdmiter;

@RestController
@RequestMapping("/pms")
public class PatientController {

	@Autowired
	IPatientAdmiter patientAdmit;

	// to see all patients
	@GetMapping("/patients")
	public String function5(Model model) {

		return ListData.getPatientList().toString();

	}

	// to see a particular patient
	@GetMapping("/patients/{number}")
	public String getPatients(@PathVariable int number) {

		return ListData.getPatientList().get(number).toString();

	}

	// to register new patient
	@GetMapping("/patients/register/{number}")
	public String registerPatient(@PathVariable int number) {

		return (patientAdmit.patientAdmit(number));

	}

}
