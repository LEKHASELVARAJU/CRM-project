package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	 @Column(name = "id", updatable = false, nullable = false)
	private int prodid;
	private String productname;
	private float cost;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodid, String productname, float cost) {
		super();
		this.prodid = prodid;
		this.productname = productname;
		this.cost = cost;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	

}
