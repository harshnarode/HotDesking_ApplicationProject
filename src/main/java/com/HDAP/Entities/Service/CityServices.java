package com.HDAP.Entities.Service;

import java.util.List;
import com.HDAP.Entities.City;

public interface CityServices {

	//Get List of City
	List<City> getAllCity();

	//Create new City
	City createCity(City city);
	
	//Update Existing City
	City updateCity(City city,int cityid);
	
	//Delete Existing City
	City deleteCity(int cityid);
}
