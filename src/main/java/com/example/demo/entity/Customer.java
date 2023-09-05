package com.example.demo.entity;



import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@Column(updatable = false, nullable=false)
	private int id;
	private String name;
	private String email;
	private String phno;
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="opportunityid")
	private List<Opportunities> o;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="interactionid")
	private Interaction i;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String email, String phno, String address, List<Opportunities> o,
			Interaction i) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.address = address;
		this.o = o;
		this.i = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Opportunities> getO() {
		return o;
	}

	public void setO(List<Opportunities> o) {
		this.o = o;
	}

	public Interaction getI() {
		return i;
	}

	public void setI(Interaction i) {
		this.i = i;
	}
	
	
	}
