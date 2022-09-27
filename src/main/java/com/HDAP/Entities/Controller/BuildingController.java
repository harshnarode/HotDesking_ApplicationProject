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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.HDAP.Entities.Building;
import com.HDAP.Entities.ServicesImpls.BuildingServiceImpl;

@RestController
@RequestMapping("/hdap/building")
public class BuildingController {

	
	@Autowired
	private BuildingServiceImpl buildingServiceImpl;
	
	@GetMapping("/getByOfficeId")
	public List<Building> getBuildingByOfficeId(@RequestParam int officeid){
		List<Building> list = buildingServiceImpl.getBuildingByOfficeId(officeid);
		return list;
	}
	
	//Create new Building
	@PostMapping("/create")
	public ResponseEntity<Building> createBuilding(@RequestBody Building building) {
		return new ResponseEntity<>(buildingServiceImpl.createBuilding(building),HttpStatus.CREATED);
	}
	
	//Update Existing Building
	@PutMapping("/update/{buildingid}")
	public ResponseEntity<Building> updateBuilding(@RequestBody Building building,@PathVariable int buildingid) {
		return new ResponseEntity<Building>(buildingServiceImpl.updateBuilding(building, buildingid),HttpStatus.OK);
	}
	
	//Delete Existing Building
	@DeleteMapping("/delete/{buildingid}")
	public ResponseEntity<Building> deleteBuilding(@PathVariable int buildingid) {
		return new ResponseEntity<Building>(buildingServiceImpl.deleteBuilding(buildingid),HttpStatus.OK);
	}
}
