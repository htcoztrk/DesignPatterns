package org.egitim.spring.domain;

public class Company extends UserObserver {

	private String companyName;
	@Override
	public void update() {
		System.out.println(this.companyName+" kullanicisi borsa degisiklikleri hakkinda bilgilendirildi.");		
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
