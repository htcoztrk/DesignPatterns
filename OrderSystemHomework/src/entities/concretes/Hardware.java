package entities.concretes;

import entities.abstracts.Taxable;

//Hardware sinifi, Product sinifini extends ederek product sinifindan turemis oldu.
//Harware sinifi, Taxable Interface'ini implement ederek methodlari override edip kullanabilecek.
public class Hardware extends Product implements Taxable{
	private int warrantyPeriod;

	public Hardware(String description, int id, String name, double retailPrice,int warrantyPeriod) {
		super(description, id,  name, retailPrice);
		this.warrantyPeriod = warrantyPeriod;
	}
	public Hardware() {
		super();
	}
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	//Taxable interfaceine ait getTax() methodu override edildi.
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return this.getRetailPrice() * 15/ 100;
	}


}
