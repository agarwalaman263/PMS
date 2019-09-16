package com.philips.pms.patient;

import org.springframework.stereotype.Service;

import com.philips.pms.objects.ListData;

@Service
public class PatientAdmiterImpl implements IPatientAdmiter {

	@Override
	public String patientAdmit(int number) {
		if (ListData.bedList.get(number).getPatient() == null) {
			ListData.patientList.add(ListData.bedList.get(number).setPatients());
			ListData.patientAdmitQueue.add(ListData.bedList.get(number).setPatients());
			return "patiend added to bed :" + number;
		} else
			return "bed is occupied";

	}

}
