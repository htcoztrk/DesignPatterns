package org.egitim.spring.domain;

import java.util.List;

public class AraciKurum {

	private int id;
	private String name;
	private List<Stock> stocks;
	private List<UserObserver> users;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	public List<UserObserver> getUsers() {
		return users;
	}
	public void setUsers(List<UserObserver> users) {
		this.users = users;
	}
	
}
