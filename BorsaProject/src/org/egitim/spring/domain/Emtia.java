package org.egitim.spring.domain;

import java.util.ArrayList;
import java.util.List;

public class Emtia implements Stock {

	private double price;
	private String group; // enerji urunleri, kimyasallar, gida maddeleri
	private List<UserObserver> observers;

	@Override
	public void chancePrice() {
		System.out.println("Emtia fiyati degisti");

		notifyAllObservers();
	}

	@Override
	public void notifyAllObservers() {
		for (UserObserver observer : observers) {
			observer.update();
		}

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public List<UserObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<UserObserver> observers) {
		this.observers = observers;
	}

}
