package entities.concretes;

//Individual sinifi Customer sinifindan tureyen bir sniniftir.
//
public class Individual extends Customer{
	//nesne degiskeni
	private String licNumber;
	//kurucu method
	public Individual(int id, String name, String address, String phone,String licNumber) {
		super( id,  name,  address,  phone);
		this.licNumber=licNumber;
	}

	public String getLicNumber() {
		return licNumber;
	}

	public void setLicNumber(String licNumber) {
		this.licNumber = licNumber;
	}
	//toString() methodu override edilerek individual sinifina ozel olarak yazildi.
	@Override
	public String toString() {
		return "Id: "+super.getId()+" Name: "+this.getName()+" Phone: "+super.getPhone()+"LicNum: "+this.getLicNumber();
	}

}
