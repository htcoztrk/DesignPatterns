package org.egitim.spring.domain;

public class Renter extends User{

	private String identityNum;
	private String name;
	public String getIdentityNum() {
		return identityNum;
	}
	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Name: "+name+" - Email: "+super.getEmail();
		
	}

}
