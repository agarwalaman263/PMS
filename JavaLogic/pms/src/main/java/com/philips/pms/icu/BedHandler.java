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
			ListData.bedList.add(new Bed());
			ListData.patientList.add(ListData.bedList.get(i).getPatient());
		}
		
		return ListData.bedList.size()+" beds created";
	}
}
