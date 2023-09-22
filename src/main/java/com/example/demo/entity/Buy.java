package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Buy {
	@Id
	private int bid;
	private String bname;
	private String des;
	private float price;
	public Buy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Buy(int bid, String bname, String des, float price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.des = des;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
