package com.HDAP.Entities.ServicesImpls;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HDAP.Entities.Building;
import com.HDAP.Entities.ExceptionsHandling.BusinessException;
import com.HDAP.Entities.ExceptionsHandling.ErrorModel;
import com.HDAP.Entities.Repository.BuildingRepo;
import com.HDAP.Entities.Service.BuildingServices;

@Service
public class BuildingServiceImpl implements BuildingServices {

	@Autowired
	private BuildingRepo buildingrepo;
	
///////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public List<Building> getBuildingByOfficeId(int officeid) {
		List<Building> bl = buildingrepo.findAll();
		if(bl!=null) {
			List<Building> list = buildingrepo.findAll();
			List<Building> l = new ArrayList<>();
			for(Building b: list) {
				if(b.getOfficeid()==officeid) {
					l.add(b);
				}
			}
			return l;
		}
		else
		{
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_OFFICE ID");
			errorModel.setMessage("Enter Valid Office Id");
			errorlist.add(errorModel);
			System.out.println("4");
			throw new BusinessException(errorlist);
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Building createBuilding(Building building) {
		return buildingrepo.save(building);
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Building updateBuilding(Building building, int buildingid) {
		Building b = new Building();
//		List<Building> bl =buildingrepo.findAll();
//		if(bl!=null){
		if(buildingrepo.findById(buildingid).isPresent()) {
			b = (buildingrepo.findById(buildingid).get());
			b.setBuildingname(building.getBuildingname());
			b.setOfficeid(building.getOfficeid());
			b.setIsactive(building.getIsactive());
			return buildingrepo.save(b);
		}
		else{
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_BUILDING ID");
			errorModel.setMessage("Enter Valid Building Id");
			errorlist.add(errorModel);
			System.out.println("4");
			throw new BusinessException(errorlist);
		}
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Building deleteBuilding(int buildingid) {
		Building b = new Building();
		if(buildingrepo.findById(buildingid).isPresent()) {
//		List<Building> bl =buildingrepo.findAll();
//		if(bl!=null){
			b = buildingrepo.findById(buildingid).get();
			buildingrepo.delete(b);
			return b;
		}
		else{
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_BUILDING ID");
			errorModel.setMessage("Enter Valid Building Id");
			errorlist.add(errorModel);
			System.out.println("4");
			throw new BusinessException(errorlist);
		}
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////
}
