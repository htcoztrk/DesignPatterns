package org.egitim.spring.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.egitim.spring.domain.Home;
import org.egitim.spring.domain.Lessor;
import org.egitim.spring.domain.Renter;

public class SystemManager {
	private ArrayList<Home> homes;
	private HashSet<String> homeCategoryList;
	
	public ArrayList<Home> getHomes() {
		return homes;
	}
	public void setHomes(ArrayList<Home> homes) {
		this.homes = homes;
	}
	public HashSet<String> getHomeCategoryList() {
		return homeCategoryList;
	}
	public void setHomeCategoryList(HashSet<String> homeCategoryList) {
		this.homeCategoryList=homeCategoryList;
	}
	public void initMethod() {
		System.out.println("Sistem açıldı");
	}
	public void destroyMethod() {
		System.out.println("Sistem kapatıldı");
	}
}
