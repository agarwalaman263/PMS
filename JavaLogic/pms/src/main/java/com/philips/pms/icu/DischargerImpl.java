package com.philips.pms.icu;

import org.springframework.stereotype.Service;

import com.philips.pms.objects.ListData;

@Service
public class DischargerImpl implements IDischarger{

	@Override
	public boolean unsubscribeBed(int number) {
		
		ListData.getPatientDischargeQueue().add(ListData.getBedList().get(number).getPatient());
		ListData.getPatientList().remove(ListData.getBedList().get(number).getPatient());
		ListData.getBedList().get(number).unsubscribe();
		return ListData.getBedList().get(number).unsubscribe();
		
	}

}
