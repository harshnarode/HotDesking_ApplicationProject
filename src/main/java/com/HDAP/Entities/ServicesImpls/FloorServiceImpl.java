package com.HDAP.Entities.ServicesImpls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HDAP.Entities.Floor;
import com.HDAP.Entities.ExceptionsHandling.BusinessException;
import com.HDAP.Entities.ExceptionsHandling.ErrorModel;
import com.HDAP.Entities.Repository.FloorRepo;
import com.HDAP.Entities.Service.FloorServices;

@Service
public class FloorServiceImpl implements FloorServices{

	@Autowired
	private FloorRepo floorrepo;
	

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Floor createFloor(Floor floor) {
		return floorrepo.save(floor);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public List<Floor> getFloorByBuildingId(int buildingid) {
		Boolean b = floorrepo.existsById(buildingid);
		System.out.println(b+" :b");
		List<Floor> fl = floorrepo.findAll();
		if(fl!=null) {
		//if(floorrepo.findById(buildingid).isPresent()) {
			List<Floor> list = floorrepo.findAll();
			List<Floor> l = new ArrayList<>();
			for(Floor f: list) {
				if(f.getBuildingid()==buildingid) {
					l.add(f);
				}
			}
			return l;
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_FloorId");
			errorModel.setMessage("Enter Valid Floor Id");
			errorlist.add(errorModel);
			throw new BusinessException(errorlist);
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Floor updateFloor(Floor floor, int floorid) {
		Floor f = new Floor();
		if(floorrepo.findById(floorid).isPresent()){
//		List<Floor> fl = floorrepo.findAll();
//		if(fl!=null) {
			f = floorrepo.findById(floorid).get();
			f.setBuildingid(floor.getBuildingid());
			f.setFloorname(floor.getFloorname());
			f.setFloorplan(floor.getFloorplan());
			f.setIsactive(floor.getIsactive());
			floorrepo.save(f);
			return f;
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_FloorId");
			errorModel.setMessage("Enter Valid Floor Id");
			errorlist.add(errorModel);
			throw new BusinessException(errorlist);
		}
	}

	
////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Floor deleteFloor(int floorid) throws BusinessException {
		Floor f = new Floor();
		if(floorrepo.findById(floorid).isPresent()) {
//		List<Floor> fl = floorrepo.findAll();
//		if(fl!=null) {
			f = floorrepo.findById(floorid).get();
			floorrepo.deleteById(floorid);
		}
		else 
		{
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_FloorId");
			errorModel.setMessage("Enter Valid Floor Id");
			errorlist.add(errorModel);
			throw new BusinessException(errorlist);
		}
		return f;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
}
