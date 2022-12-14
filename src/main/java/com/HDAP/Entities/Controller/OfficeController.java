package com.HDAP.Entities.Controller;

import java.util.ArrayList;
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

import com.HDAP.Entities.Office;
import com.HDAP.Entities.ExceptionsHandling.BusinessException;
import com.HDAP.Entities.Repository.OfficeRepo;
import com.HDAP.Entities.ServicesImpls.OfficeServiceImpl;

@RestController
@RequestMapping("/hdap/office")
public class OfficeController {
	
	@Autowired
	private OfficeRepo officeRepo;
	
	@Autowired
	private OfficeServiceImpl officeServiceImpl;
	
	@GetMapping("/getCityById")
	public List<Office> getOfficeByCityId(@RequestParam int cityid) throws BusinessException {
		return officeServiceImpl.getOfficeByCityId(cityid);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Office> createOffice(@RequestBody Office office) {
		return new ResponseEntity<Office>(officeServiceImpl.createOffice(office),HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{officeid}")
	public ResponseEntity<Office> updateOffice(@RequestBody Office office,@PathVariable int officeid) {
		return new ResponseEntity<Office>(officeServiceImpl.updateOffice(office,officeid),HttpStatus.OK);	
	}
	
	@DeleteMapping("/delete/{officeid}")
	public ResponseEntity<Office> deleteOffice(@PathVariable int officeid) {
		return new ResponseEntity<Office>(officeServiceImpl.deleteOffice(officeid),HttpStatus.OK);
	}
}
