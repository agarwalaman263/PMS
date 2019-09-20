package com.philips.pms.icu;

import org.springframework.stereotype.Service;

import com.philips.pms.objects.ListData;

@Service
public class DischargerImpl implements IDischarger{

	@Override
	public boolean unsubscribeBed(int number) {
		
		ListData.patientDischargeQueue.add(ListData.bedList.get(number).getPatient());
		ListData.patientList.remove(ListData.bedList.get(number).getPatient());
		ListData.bedList.get(number).unsubscribe();
		return ListData.bedList.get(number).unsubscribe();
		
	}

}
