package com.philips.pms.icu;

import org.springframework.stereotype.Service;

import com.philips.pms.objects.Bed;
import com.philips.pms.objects.ListData;

@Service
public class BedHandler implements IBedHandler {

	@Override
	public String addBeds(int number)
	{
		for(int i=0;i<number;++i)
		{
			ListData.getBedList().add(new Bed());
			ListData.getPatientList().add(ListData.getBedList().get(i).getPatient());
		}
		
		return ListData.getBedList().size()+" beds created";
	}
}
