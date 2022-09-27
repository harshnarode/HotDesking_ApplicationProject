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

import com.HDAP.Entities.Floor;
import com.HDAP.Entities.ExceptionsHandling.BusinessException;
import com.HDAP.Entities.ExceptionsHandling.ErrorModel;
import com.HDAP.Entities.Repository.FloorRepo;
import com.HDAP.Entities.ServicesImpls.FloorServiceImpl;

@RestController
@RequestMapping("/hdap/floor")
public class FloorController {

	
	@Autowired
	private FloorServiceImpl floorServiceImpl;
	
	@GetMapping("/getByBuildingId")
	public List<Floor> getFloorByBuildingId(@RequestParam int buildingid){
		return floorServiceImpl.getFloorByBuildingId(buildingid);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Floor> createFloor(@RequestBody Floor floor) {
		return new ResponseEntity<Floor>(floorServiceImpl.createFloor(floor),HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{floorid}")
	public ResponseEntity<Floor> updateFloor(@RequestBody Floor floor,@PathVariable int floorid) {
		return new ResponseEntity<Floor>(floorServiceImpl.updateFloor(floor, floorid),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{floorid}")
	public ResponseEntity<Floor> deleteFloor(@PathVariable int floorid) throws BusinessException {
		return new ResponseEntity<Floor>(floorServiceImpl.deleteFloor(floorid),HttpStatus.OK);
	}
	
}
