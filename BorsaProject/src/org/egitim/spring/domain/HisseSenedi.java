package org.egitim.spring.domain;

import java.util.List;

public class HisseSenedi implements Stock{

	private double price;
	private String type;  //nama, hamiline
	public List<UserObserver> observers;
	
	@Override
	public void chancePrice() {
		System.out.println("Hisse Senedi fiyati degisti.");
		notifyAllObservers();
		
	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		for(UserObserver observer:observers) {
			observer.update();
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<UserObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<UserObserver> observers) {
		this.observers = observers;
	}

	

}
