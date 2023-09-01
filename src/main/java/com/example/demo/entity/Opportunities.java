package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Opportunities {
	@Id
	private int opid;
	private String opname;
	private String stage;
	private float amount;
	private String closedate;
	public Opportunities() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Opportunities(int opid, String opname, String stage, float amount, String closedate) {
		super();
		this.opid = opid;
		this.opname = opname;
		this.stage = stage;
		this.amount = amount;
		this.closedate = closedate;
	}
	public int getOpid() {
		return opid;
	}
	public void setOpid(int opid) {
		this.opid = opid;
	}
	public String getOpname() {
		return opname;
	}
	public void setOpname(String opname) {
		this.opname = opname;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getClosedate() {
		return closedate;
	}
	public void setClosedate(String closedate) {
		this.closedate = closedate;
	}
	

}
