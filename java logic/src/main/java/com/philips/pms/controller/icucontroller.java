package com.philips.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.philips.pms.icu.IBedHandler;
import com.philips.pms.icu.IDischarger;

import com.philips.pms.objects.ListData;

@RestController
@RequestMapping("/pms")
public class IcuController {

	@Autowired
	IBedHandler bedHandler;

	@Autowired
	IDischarger discharge;

	// to set number of beds
	@GetMapping("/bed/config/{number}")
	public String createBeds(@PathVariable int number) {

		return (bedHandler.addBeds(number));

	}

	// to see all beds list
	@GetMapping("/bed")
	public String getBedsDetails(Model model) {

		return (ListData.bedList.toString());

	}

	// to check particular bed
	@GetMapping("/bed/{number}")
	public String getBedDeatils(@PathVariable int number) {

		return ("bed:" + number + " : " + ListData.bedList.get(number).getBed());

	}

	// to free a particular bed or discharge
	@GetMapping("/bed/config/{number}/unsubscribe")
	public boolean function4(@PathVariable int number) {

		return discharge.unsubscribeBed(number);

	}
/*
	// to see alarms
	@RequestMapping("/patients/config/{number}/alarms")
	public String showAlarms(@PathVariable int number) {

		ListData.patientList.get(number).getActivatedAlarms();
		return ListData.patientList.get(number).getActivatedAlarms() + "";

	}

	// to turn off alarm
	@RequestMapping("/patients/config/{number}/alarms/unsubscribe")
	public boolean turnOffAlarm(@PathVariable int number) {

		return ListData.patientList.get(number).unsubscribe();

	}

	// to turn on alarm
	@RequestMapping("/patients/config/{number}/alarms/subscribe")
	public boolean turnOnAlarm(@PathVariable int number) {

		return ListData.patientList.get(number).subscribe();

}*/	

}
