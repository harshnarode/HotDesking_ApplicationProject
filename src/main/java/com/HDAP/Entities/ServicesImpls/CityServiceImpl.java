package com.HDAP.Entities.ServicesImpls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HDAP.Entities.City;
import com.HDAP.Entities.ExceptionsHandling.BusinessException;
import com.HDAP.Entities.ExceptionsHandling.ErrorModel;
import com.HDAP.Entities.Repository.CityRepo;
import com.HDAP.Entities.Service.CityServices;

@Service
public class CityServiceImpl implements CityServices{

	@Autowired
	private CityRepo cityrepo;
	

//////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public City createCity(City city) {
		return cityrepo.save(city);
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public List<City> getAllCity() {
		List<City> list = cityrepo.findAll();
		if(list.isEmpty()) {
			list=null;
		}
		return list;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public City updateCity(City city, int cityid) {
		City c = new City();
		List<City> cl = cityrepo.findAll();
		if(cl!=null){
			c = cityrepo.findById(cityid).get();
			c.setCityname(city.getCityname());
			c.setCountry(city.getCountry());
			c.setIsactive(city.getIsactive());
			c.setPincode(city.getPincode());
			c.setStatename(c.getStatename());
			return cityrepo.save(c);
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_CITY ID");
			errorModel.setMessage("Enter Valid City Id");
			errorlist.add(errorModel);
			System.out.println("4");
			throw new BusinessException(errorlist);
		}
	}

	
	@Override
	public City deleteCity(int cityid) {
		City c = new City();
		List<City> cl = cityrepo.findAll();
		if(cl!=null){
			c = cityrepo.findById(cityid).get();
			cityrepo.deleteById(cityid);
			return c;
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_CITY ID");
			errorModel.setMessage("Enter Valid City Id");
			errorlist.add(errorModel);
			System.out.println("4");
			throw new BusinessException(errorlist);
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
}
