package com.guoh.mybatis.helloworld1;

import java.util.Date;

public class Student {
	private Integer studId;
	private String name;
	private String email;
	private Date dob;
	
	private Enabled enabled;
	
	
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Enabled getEnabled() {
		return enabled;
	}
	public void setEnabled(Enabled enabled) {
		this.enabled = enabled;
	}
	
	
}