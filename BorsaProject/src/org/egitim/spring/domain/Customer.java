package org.egitim.spring.domain;

public class Customer extends UserObserver{

	private String name;
	@Override
	public void update() {
		System.out.println(this.name+" kullanicisi borsa degisiklikleri hakkinda bilgilendirildi.");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
