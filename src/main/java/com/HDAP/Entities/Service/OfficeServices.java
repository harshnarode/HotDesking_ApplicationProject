package com.HDAP.Entities.Service;

import java.util.List;

import com.HDAP.Entities.City;
import com.HDAP.Entities.Office;
import com.HDAP.Entities.ExceptionsHandling.BusinessException;

public interface OfficeServices {

	//Get List of Office
	List<Office> getOfficeByCityId(int cityid) throws BusinessException;
	
	//Create new Office
	Office createOffice(Office office);
	
	//Update Existing Office
	Office updateOffice(Office office,int officeid);
	
	//Delete Existing Office
		Office deleteOffice(int officeid);
}
