package com.TureClub.Demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assignment")
public class TrueClub {
	
	
	
	@Id
	
	@Column(name = "id")
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer id;
	
	
	@Column(name ="name")
	
	private String name;
	
	@Column(name ="address")
	
	private String address;
	
	@Column(name ="pincode")
	
	private Integer pincode;
	
	@Column(name = "state")
	
	private String state;
	
	

	public TrueClub(Integer id, String name, String address, Integer pincode, String state) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.state = state;
	}



	public TrueClub() {
		super();
		
	}



	@Override
	public String toString() {
		return "TrueClub [id=" + id + ", name=" + name + ", address=" + address + ", pincode=" + pincode + ", state="
				+ state + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Integer getPincode() {
		return pincode;
	}



	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
	
	
	

}
