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

import com.HDAP.Entities.Seat;
import com.HDAP.Entities.ServicesImpls.SeatServiceimpl;

@RestController
@RequestMapping("/hdap/seat")
public class SeatController {

	@Autowired
	SeatServiceimpl seatServiceimpl;
	
	@GetMapping("/getByFloorId")
	public List<Seat> getSeatByFloorId(@RequestParam int floorid){
		return seatServiceimpl.getSeatByFloorId(floorid);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Seat> createSeat(@RequestBody Seat seat) {
		return new ResponseEntity<Seat>(seatServiceimpl.createSeat(seat),HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{seatid}")
	public ResponseEntity<Seat> updateSeat(@RequestBody Seat seat,@PathVariable int seatid) {
		return new ResponseEntity<Seat>(seatServiceimpl.updateSeat(seat, seatid),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{seatid}")
	public ResponseEntity<Seat> deleteSeat(@PathVariable int seatid) {
		return new ResponseEntity<Seat>(seatServiceimpl.deleteSeat(seatid),HttpStatus.OK);
	}
	
}
