package com.HDAP.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citymaster")
public class City {

	@Id
	private int cityid;
	@Column(length=2)
	private String isactive;
	private String cityname;
	private String country;
	private String pincode;
	private String statename;
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public City(int cityid, String isactive, String cityname, String country, String pincode, String statename) {
		super();
		this.cityid = cityid;
		this.isactive = isactive;
		this.cityname = cityname;
		this.country = country;
		this.pincode = pincode;
		this.statename = statename;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", isactive=" + isactive + ", cityname=" + cityname + ", country=" + country
				+ ", pincode=" + pincode + ", statename=" + statename + "]";
	}
	
	
}
