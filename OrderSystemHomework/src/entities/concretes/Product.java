package entities.concretes;


public class Product {
	
	//nesne degiskenleri
	private String description;
	private int id;
	private String name;
	private double retailPrice;
	//parametrsiz kurucu method
	public Product() {
		
	}
	public Product(String description, int id, String name, double retailPrice) {
		super();
		this.description = description;
		this.id = id;
		this.name = name;
		this.retailPrice = retailPrice;
	}
	//degiskenlere ait get ve set methodlari
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
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
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	
}
