package org.egitim.spring.domain;

public class SatisIslemiFacade {

	private Stock stock;
	private UserObserver alici;
	private UserObserver satici;
	private AraciKurum araciKurum;
	
	public void alisverisYap() {
		System.out.println("Araci Kurum: "+araciKurum.getName());
		System.out.println("Alici: "+getUserName(alici));
		System.out.println("Satici: "+getUserName(satici));
		System.out.println("Stock: "+getStockDetay());
	}
	
	public String getUserName(UserObserver user) {
		if(user instanceof Customer) {
			return (((Customer) user).getName());
		}
		return ((Company) user).getCompanyName();
	}
	
	public String getStockDetay() {
		if(this.stock instanceof HisseSenedi) {
			return "Hisse Senedi("+((HisseSenedi) stock).getType()+") - Price: "+((HisseSenedi) stock).getPrice();
		}
		if(this.stock instanceof Emtia) {
			return "Emtia("+(((Emtia) this.stock).getGroup())+") - Price: "+((Emtia) this.stock).getPrice();
		}
		return "Doviz("+((Doviz) this.stock).getVadeliIslem()+") - Islem Hacmi: "+((Doviz) this.stock).getIslemHacmi();
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public UserObserver getAlici() {
		return alici;
	}
	public void setAlici(UserObserver alici) {
		this.alici = alici;
	}
	public UserObserver getSatici() {
		return satici;
	}
	public void setSatici(UserObserver satici) {
		this.satici = satici;
	}
	public AraciKurum getAraciKurum() {
		return araciKurum;
	}
	public void setAraciKurum(AraciKurum araciKurum) {
		this.araciKurum = araciKurum;
	}
	
}
