package com.HDAP.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="officemaster")
public class Office {

	@Id
	private int officeid;
	@Column(length=2)
	private String isactive;
	private String officename;
	@Column(nullable = false)
	private int cityid;
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public String getOfficename() {
		return officename;
	}
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public Office(int officeid, String isactive, String officename, int cityid) {
		super();
		this.officeid = officeid;
		this.isactive = isactive;
		this.officename = officename;
		this.cityid = cityid;
	}
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Office [officeid=" + officeid + ", isactive=" + isactive + ", officename=" + officename + ", cityid="
				+ cityid + "]";
	}
	
	
		
}
