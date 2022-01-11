package entities.concretes;

//Her Company bir Customerdir. 
//Company Customer sınıfını kalıtım yolu ile özelliklerine erişebilir.
public class Company extends Customer{
   //nesne degiskenleri
   private int discount;
   private String contact;
//parametresiz kurucu method
public Company() {
	
}
//parametreli kurucu method
public Company(int id, String name, String address, String phone,int discount, String contact) {
	super( id,  name,  address,  phone);
	this.discount = discount;
	this.contact = contact;
}
//degiskenlere ait get ve set metodlari.
public int getDiscount() {
	return discount;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public void setDiscount(int discount) {
	this.discount = discount;
}

}
