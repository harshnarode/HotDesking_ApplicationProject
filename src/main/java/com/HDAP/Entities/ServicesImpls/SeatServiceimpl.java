package com.HDAP.Entities.ServicesImpls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HDAP.Entities.Office;
import com.HDAP.Entities.Seat;
import com.HDAP.Entities.ExceptionsHandling.BusinessException;
import com.HDAP.Entities.ExceptionsHandling.ErrorModel;
import com.HDAP.Entities.Repository.SeatRepo;
import com.HDAP.Entities.Service.SeatServices;

@Service
public class SeatServiceimpl implements SeatServices{


	@Autowired
	private SeatRepo seatrepo;

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Seat createSeat(Seat seat) {
		return seatrepo.save(seat);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public List<Seat> getSeatByFloorId(int floorid) {
		//if(seatrepo.findById(floorid).isPresent()) {
		List<Seat> sl = seatrepo.findAll();
		if(sl!=null) {
			List<Seat> list = seatrepo.findAll();
			List<Seat> l = new ArrayList<>();
			for(Seat s: list) {
				if(s.getFloorid()==floorid) {
					l.add(s);
				}
			}
			return l;
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_FLOOR ID");
			errorModel.setMessage("Enter Valid Floor Id");
			errorlist.add(errorModel);
			throw new BusinessException(errorlist);
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Seat updateSeat(Seat seat, int seatid) {
		if(seatrepo.findById(seatid).isPresent()) {
//		List<Seat> sl = seatrepo.findAll();
//		if(sl!=null) {
			Seat s = seatrepo.findById(seatid).get();
			s.setCubicleposition(seat.getCubicleposition());
			s.setFloorid(seat.getFloorid());
			s.setIsactive(seat.getIsactive());
			s.setQrnumber(seat.getQrnumber());
			s.setSeatnumber(seat.getSeatnumber());
			s.setSeattype(s.getSeattype());
			s.setSeattypeid(seat.getSeattypeid());
			seatrepo.save(s);
			return s;
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_SEAT ID");
			errorModel.setMessage("Enter Valid Seat Id");
			errorlist.add(errorModel);
			throw new BusinessException(errorlist);
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Seat deleteSeat(int seatid) {
		if(seatrepo.findById(seatid).isPresent()) {
//		List<Seat> sl = seatrepo.findAll();
//		if(sl!=null) {
			Seat s = seatrepo.findById(seatid).get();
			seatrepo.deleteById(seatid);
			return s;
		}
		else {
			List<ErrorModel> errorlist = new ArrayList<>();
			ErrorModel errorModel = new ErrorModel();
			errorModel.setCode("INVALID_SEAT ID");
			errorModel.setMessage("Enter Valid Seat Id");
			errorlist.add(errorModel);
			throw new BusinessException(errorlist);
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
}
