package com.HDAP.Entities.Service;

import java.util.List;

import com.HDAP.Entities.Building;
import com.HDAP.Entities.Floor;
import com.HDAP.Entities.ExceptionsHandling.BusinessException;

public interface FloorServices {

	//Get List of Floor
	List<Floor> getFloorByBuildingId(int buildingid);
	
	//Create new Floor
	Floor createFloor(Floor floor);
	
	//Update Existing Floor
	Floor updateFloor(Floor floor,int floorid);
	
	//Delete Existing Floor
	Floor deleteFloor(int floorid) throws BusinessException;
}
