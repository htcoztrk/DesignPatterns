package org.egitim.jpa.model.data;

public enum Ehliyet {

	A("MOTOSIKLET"),
	B("OTOMOBIL"),
	C("KAMYON"),
	D("OTOBUS"),
	F("TRACTOR"),
	G("IS_MAKINASI");

	String result;
	Ehliyet(String result){
		this.result=result;
	}
	
}
