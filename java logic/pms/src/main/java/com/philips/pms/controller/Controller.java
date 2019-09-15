package com.philips.pms.controller;


import java.util.ArrayList;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.philips.pms.generator.WriteScheduler;
import com.philips.pms.objects.Beds;
import com.philips.pms.objects.ListData;
import com.philips.pms.objects.Patients;



@RestController
@RequestMapping("/pms")
public class Controller {
	
	
	int numberOfBeds=4;

	// to set number of beds
	@RequestMapping("/bed/config/{number}")
	public String createBeds(@PathVariable int number) {

		numberOfBeds=number;
		
		for(int i=0;i<number;++i)
		{
			ListData.bedList.add(new Beds());
			ListData.patientList.add(ListData.bedList.get(i).getPatient());
		}
		
		System.out.println(ListData.bedList.size()+" beds created");
		return ListData.bedList.size()+" beds created";

	}

	
	// to see all beds list
	@RequestMapping("/bed")
	public String getBedDetails(Model model) {

		
		for (Beds bed : ListData.bedList) {
			System.out.println(bed.getBed());
		}
		
		return "abc";

	}

	// to check particular bed
	@RequestMapping("/bed/{number}")
	public String function3(@PathVariable int number) {

		
		System.out.println(ListData.bedList.get(number).getBed());
		return "bed:"+number+" : "+ListData.bedList.get(number).getBed()+"";

	}

	// to free a particular bed or discharge
	@RequestMapping("/bed/config/{number}/unsuscribe")
	public String function4(@PathVariable int number) {

		ListData.bedList.get(number).unsubscribe();
		ListData.patientList.remove(number);
		return ListData.bedList.get(number).unsubscribe()+"";

	}

	// to see all patients
	@RequestMapping("/patients")
	public String function5(Model model) {

		for (Patients patient : ListData.patientList) {
			
			System.out.println(patient);
		}
		
		
		return ListData.patientList+"";

	}
	
	

	// to see a particular patient
	@RequestMapping("/patients/{number}")
	public String getPatients(@PathVariable int number) {

		System.out.println(ListData.patientList.get(number));
		return ListData.patientList.get(number)+"";

	}
	
	
	//to register new patient
	@RequestMapping("/patients/register/{number}")
	public String registerPatient(@PathVariable int number) {

		System.out.println("|| "+ListData.bedList.get(number).getPatient());
		//System.out.println(bedList);
		if(ListData.bedList.get(number).getPatient()==null) {
			ListData.patientList.add(ListData.bedList.get(number).setPatients());
			return "patiend added to bed :" +number;
		}
		else
			return "bed is occupied";
		

	}
	

	
	// to see alarms
	@RequestMapping("/patients/config/{number}/alarms")
	public String showAlarms(@PathVariable int number) {
		
		ListData.patientList.get(number).getActivatedAlarms();
		return ListData.patientList.get(number).getActivatedAlarms()+"";

	}

	
	// to turn off alarm
	@RequestMapping("/patients/config/{number}/alarms/unsuscribe")
	public boolean turnOffAlarm(@PathVariable int number) {


		return ListData.patientList.get(number).unsubscribe();
		

	}
	
	
	// to turn on alarm
	@RequestMapping("/patients/config/{number}/alarms/suscribe")
	public boolean turnOnAlarm(@PathVariable int number) {


		return ListData.patientList.get(number).subscribe();
		

	}
	

	/*
	 * //for generator
	 * 
	 * 
	 * @MessageMapping("/generator")
	 * 
	 * @SendTo("/data/user") public String getUser(String payload) {
	 * 
	 * 
	 * test.bed1=true; return "1st titme"; //return new WriteScheduler().schedule();
	 * 
	 * }
	 * 
	 * 
	 * @RequestMapping("/generator/stop") public String stopGenerator() {
	 * 
	 * 
	 * test.bed1=false; return "true";
	 * 
	 * }
	 * 
	 * @RequestMapping("/generator/start") public String startGenerator() {
	 * 
	 * 
	 * test.bed1=true; return "true";
	 * 
	 * }
	 */
	

}
