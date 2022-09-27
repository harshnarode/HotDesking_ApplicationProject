package com.HDAP.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="floormaster")
public class Floor {

	@Id
	private Integer floorid;
	@Column(length=2)
	private String isactive;
	private String floorname;
	private String floorplan;
	@Column(nullable = false)
	private Integer buildingid;
	public Integer getFloorid() {
		return floorid;
	}
	public void setFloorid(Integer floorid) {
		this.floorid = floorid;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public String getFloorname() {
		return floorname;
	}
	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}
	public String getFloorplan() {
		return floorplan;
	}
	public void setFloorplan(String floorplan) {
		this.floorplan = floorplan;
	}
	public Integer getBuildingid() {
		return buildingid;
	}
	public void setBuildingid(Integer buildingid) {
		this.buildingid = buildingid;
	}
	public Floor(Integer floorid, String isactive, String floorname, String floorplan, Integer buildingid) {
		super();
		this.floorid = floorid;
		this.isactive = isactive;
		this.floorname = floorname;
		this.floorplan = floorplan;
		this.buildingid = buildingid;
	}
	public Floor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Floor [floorid=" + floorid + ", isactive=" + isactive + ", floorname=" + floorname + ", floorplan="
				+ floorplan + ", buildingid=" + buildingid + "]";
	}
	
		
}
