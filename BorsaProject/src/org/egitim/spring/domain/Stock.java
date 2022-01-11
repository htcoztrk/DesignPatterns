package org.egitim.spring.domain;

import java.util.List;

public interface Stock {

	//borsa araclari veya stocklari fiyatlarinda bir degisiklik oldugunda bu method
	//araciligi ile ilgili kullanicilar(sirket veya musteriler) bilgilendirilir.
	void notifyAllObservers();
	void chancePrice();
	
	}
