package com.philips.pms.patient;

import org.springframework.stereotype.Service;

import com.philips.pms.objects.ListData;

@Service
public class PatientAdmiterImpl implements IPatientAdmiter {

	@Override
	public String patientAdmit(int number) {
		if (ListData.getBedList().get(number).getPatient() == null) {
			ListData.getPatientList().add(ListData.getBedList().get(number).setPatients());
			ListData.getPatientAdmitQueue().add(ListData.getBedList().get(number).getPatient());
			return "patiend added to bed :" + number;
		} else {
			return "bed is occupied";
		}
	}

}
