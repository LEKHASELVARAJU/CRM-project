package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Interaction {
	@Id
	private int interid;
	private String intertype;
	private String duedate;
	private String status;
	public Interaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Interaction(int interid, String intertype, String duedate, String status) {
		super();
		this.interid = interid;
		this.intertype = intertype;
		this.duedate = duedate;
		this.status = status;
	}
	public int getInterid() {
		return interid;
	}
	public void setInterid(int interid) {
		this.interid = interid;
	}
	public String getIntertype() {
		return intertype;
	}
	public void setIntertype(String intertype) {
		this.intertype = intertype;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
