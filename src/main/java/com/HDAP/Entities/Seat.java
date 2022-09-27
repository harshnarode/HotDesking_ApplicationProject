package com.HDAP.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seatmaster")
public class Seat {

	@Id
	private int seatid;
	@Column(length=2)
	private String isactive;
	private int cubicleposition;
	private String qrnumber;
	private int seatnumber;
	private String seattype;
	@Column(nullable = false)
	private int floorid;
	@Column(nullable = false)
	private int seattypeid;
	public int getSeatid() {
		return seatid;
	}
	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public int getCubicleposition() {
		return cubicleposition;
	}
	public void setCubicleposition(int cubicleposition) {
		this.cubicleposition = cubicleposition;
	}
	public String getQrnumber() {
		return qrnumber;
	}
	public void setQrnumber(String qrnumber) {
		this.qrnumber = qrnumber;
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	public String getSeattype() {
		return seattype;
	}
	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}
	public int getFloorid() {
		return floorid;
	}
	public void setFloorid(int floorid) {
		this.floorid = floorid;
	}
	public int getSeattypeid() {
		return seattypeid;
	}
	public void setSeattypeid(int seattypeid) {
		this.seattypeid = seattypeid;
	}
	public Seat(int seatid, String isactive, int cubicleposition, String qrnumber, int seatnumber, String seattype,
			int floorid, int seattypeid) {
		super();
		this.seatid = seatid;
		this.isactive = isactive;
		this.cubicleposition = cubicleposition;
		this.qrnumber = qrnumber;
		this.seatnumber = seatnumber;
		this.seattype = seattype;
		this.floorid = floorid;
		this.seattypeid = seattypeid;
	}
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Seat [seatid=" + seatid + ", isactive=" + isactive + ", cubicleposition=" + cubicleposition
				+ ", qrnumber=" + qrnumber + ", seatnumber=" + seatnumber + ", seattype=" + seattype + ", floorid="
				+ floorid + ", seattypeid=" + seattypeid + "]";
	}
	
	
		
}
