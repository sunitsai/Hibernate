package com.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="dept")
public class Dept {

	private int deptno;
	private String dname;
	private Set<Emp> emp;
	
	@Id
	@GenericGenerator(name="inc",strategy="increment")
	@GeneratedValue(generator="inc")
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Column(name="DNAME")
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@OneToMany(cascade=CascadeType.ALL,mappedBy="dept")
	public Set<Emp> getEmp() {
		return emp;
	}
	public void setEmp(Set<Emp> emp) {
		this.emp = emp;
	}
	
	
}
