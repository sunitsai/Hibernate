package com.Bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="EmpPersonalInfo")
public class EmpPersonaliNfo {

	private int epi;
	private String fname,email,address;
	private EmployeeBean emp;
	
	@Id
	@GenericGenerator(name="inc",strategy="increment")
	@GeneratedValue(generator="inc")
	public int getEpi() {
		return epi;
	}
	public void setEpi(int epi) {
		this.epi = epi;
	}
	@Column(name="First Name")
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@Column(name="Email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="Address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="epi")
	public EmployeeBean getEmp() {
		return emp;
	}
	public void setEmp(EmployeeBean emp) {
		this.emp = emp;
	}
	
	
}
