package com.HDAP.Entities.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.HDAP.Entities.Floor;
import com.HDAP.Entities.Seat;

public interface SeatServices {

	//Get List of Seat
	List<Seat> getSeatByFloorId(int floorid);
	
	//Create new Seat
	Seat createSeat(Seat seat);

	//Update Existing Seat
	Seat updateSeat(Seat seat, int seatid);
	
	//Delete Existing Seat
	Seat deleteSeat(int seatid);
}
