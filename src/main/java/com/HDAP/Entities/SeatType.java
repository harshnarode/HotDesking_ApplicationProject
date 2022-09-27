package com.HDAP.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seattype")
public class SeatType {

	@Id
	private int seatypeid;
	private String seatcode;
	private String seatname;
	
	
	public int getSeatypeid() {
		return seatypeid;
	}
	public void setSeatypeid(int seatypeid) {
		this.seatypeid = seatypeid;
	}
	public String getSeatcode() {
		return seatcode;
	}
	public void setSeatcode(String seatcode) {
		this.seatcode = seatcode;
	}
	public String getSeatname() {
		return seatname;
	}
	public void setSeatname(String seatname) {
		this.seatname = seatname;
	}
	public SeatType(int seatypeid, String seatcode, String seatname) {
		super();
		this.seatypeid = seatypeid;
		this.seatcode = seatcode;
		this.seatname = seatname;
	}
	public SeatType() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SeatType [seatypeid=" + seatypeid + ", seatcode=" + seatcode + ", seatname=" + seatname + "]";
	}
	
	
	
}
