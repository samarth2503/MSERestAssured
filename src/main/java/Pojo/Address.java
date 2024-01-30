package Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Address {
	
	public Address(int houseNo, String streetname, String city, String state, String country) {
		//super();
		this.houseNo = houseNo;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public Address()
	{
		
	}
	
	private int houseNo;
	private String streetname;
	private String city;
	private String state;
	private String country;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
