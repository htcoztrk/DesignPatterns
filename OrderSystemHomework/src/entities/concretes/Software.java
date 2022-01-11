package entities.concretes;

//software sinifi, product sinifindan turer. Diger bir ifadeyle Software bir Producttir.

public class Software extends Product{
	private String license; //degisken
	
	//kurucu method. 
	public Software() {
		
	}
    //parametreli kurucu method
	public Software(String description, int id, String name, double retailPrice,String license) {
		super(description, id,  name, retailPrice);
		this.license = license;
	}
    //get ve set methodlari
	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}
	
}
