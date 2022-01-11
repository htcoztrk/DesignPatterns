package org.egitim.spring.domain;

import java.util.List;

public class Doviz implements Stock {

	private String vadeliIslem; // Dolar/TL, Euro/TL, EUR/USD
	private int islemHacmi;
	List<UserObserver> observers;
	public String getVadeliIslem() {
		return vadeliIslem;
	}

	public void setVadeliIslem(String vadeliIslem) {
		this.vadeliIslem = vadeliIslem;
	}

	public int getIslemHacmi() {
		return islemHacmi;
	}

	public void setIslemHacmi(int islemHacmi) {
		this.islemHacmi = islemHacmi;
	}

	public List<UserObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<UserObserver> observers) {
		this.observers = observers;
	}

	

	@Override
	public void chancePrice() {
		System.out.println("Doviz fiyati degisti.");

		notifyAllObservers();
	}

	@Override
	public void notifyAllObservers() {
		for (UserObserver observer : observers) {
			observer.update();
		}

	}

}
