package org.egitim.spring.domain;

public class Lessor extends User{

	private String companyName;
	private String website;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String toString() {
		return "CompanyName: "+companyName+"- Website: "+website;
		
	}
}
