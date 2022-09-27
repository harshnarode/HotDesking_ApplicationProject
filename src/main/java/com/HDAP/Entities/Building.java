package com.HDAP.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buildingmaster")
public class Building {

	@Id
	private int buildingid;
	@Column(length=2)
	private String isactive;
	private String buildingname;
	@Column(nullable = false)
	private int officeid;
	public int getBuildingid() {
		return buildingid;
	}
	public void setBuildingid(int buildingid) {
		this.buildingid = buildingid;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public String getBuildingname() {
		return buildingname;
	}
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	public Building(int buildingid, String isactive, String buildingname, int officeid) {
		super();
		this.buildingid = buildingid;
		this.isactive = isactive;
		this.buildingname = buildingname;
		this.officeid = officeid;
	}
	public Building() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
}
