package com.HDAP.Entities.ServicesImpls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.HDAP.Entities.Office;
import com.HDAP.Entities.ExceptionsHandling.BusinessException;
import com.HDAP.Entities.ExceptionsHandling.ErrorModel;
import com.HDAP.Entities.Repository.OfficeRepo;
import com.HDAP.Entities.Service.OfficeServices;

@Service
public class OfficeServiceImpl implements OfficeServices{

	@Autowired
	private OfficeRepo officerepo;
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Office createOffice(Office office) {
		return officerepo.save(office);
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public List<Office> getOfficeByCityId(int cityid) throws BusinessException {
		//if(officerepo.findById(cityid).isPresent()) {
		List<Office> ol = officerepo.findAll();
		if(ol!=null) {
			List<Office> list = officerepo.findAll();
			List<Office> l =new ArrayList<>();
			for(Office o: list) {
				if(o.getCityid()==cityid) {
					l.add(o);
				}
			}
			return l;
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_CITYID");
			errorModel.setMessage("Enter Valid City Id");
			errorlist.add(errorModel);
			throw new BusinessException(errorlist);
		}
	}

	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Office updateOffice(Office office, int officeid) {
		if(officerepo.findById(officeid).isPresent()) {
//		List<Office> ol = officerepo.findAll();
//		if(ol!=null) {
			Office o = officerepo.findById(officeid).get();
			o.setCityid(office.getCityid());
			o.setIsactive(office.getIsactive());
			o.setOfficename(office.getOfficename());
			return officerepo.save(o);
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_OFFICE ID");
			errorModel.setMessage("Enter Valid Office Id");
			errorlist.add(errorModel);
			throw new BusinessException(errorlist);
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Office deleteOffice(int officeid) {
		if(officerepo.findById(officeid).isPresent()) {
//		List<Office> ol = officerepo.findAll();
//		if(ol!=null) {
			Office o = officerepo.findById(officeid).get();
			officerepo.deleteById(officeid);
			return o;
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_OFFICE ID");
			errorModel.setMessage("Enter Valid Office Id");
			errorlist.add(errorModel);
			throw new BusinessException(errorlist);
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
}
