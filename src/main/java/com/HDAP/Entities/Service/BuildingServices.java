package com.HDAP.Entities.Service;

import java.util.List;

import com.HDAP.Entities.Building;
import com.HDAP.Entities.Office;

public interface BuildingServices {

	//Get List of Building
	List<Building> getBuildingByOfficeId(int officeid);
	
	//Create new Building
	Building createBuilding(Building building);
	
	//Update Existing Building
	Building updateBuilding(Building building,int buildingid);
	
	//Delete Existing Building
	Building deleteBuilding(int buildngid);
}
