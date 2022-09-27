package com.HDAP.Entities.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HDAP.Entities.City;
import com.HDAP.Entities.Floor;
import com.HDAP.Entities.ServicesImpls.CityServiceImpl;

@RestController
@RequestMapping("/hdap/city")
public class CityController {

	
	@Autowired 
	private CityServiceImpl cityServiceImpl;

	@GetMapping("/getAll")
	public List<City> getAllCity(){
		return cityServiceImpl.getAllCity();
	}
	
	@PostMapping("/create")
	public ResponseEntity<City> createCity(@RequestBody City city) {
		return new ResponseEntity<City>(cityServiceImpl.createCity(city),HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{cityid}")
	public ResponseEntity<City> updateCity(@RequestBody City city,@PathVariable int cityid) {
		return new ResponseEntity<City>(cityServiceImpl.updateCity(city, cityid),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{cityid}")
	public ResponseEntity<City> deleteCity(@PathVariable int cityid) {
		return new ResponseEntity<City>(cityServiceImpl.deleteCity(cityid),HttpStatus.OK);
	}
}
