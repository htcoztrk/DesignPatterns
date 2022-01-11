package entities.concretes;

public class OrderItem {
	//nesne degiskenleri
	private int lineNbr;
	//orderitem ile product arasinda bire bir iliski oldugundan dolayi orderitem, producti refeans olarak tutar
	private Product product;
	private int quantity;
	//parametreli ve parametresiz kurucu methodlar
	public OrderItem() {
		
	}
	public OrderItem(int lineNbr,Product product, int quantity) {
		this.lineNbr = lineNbr;
		this.product=product;
		this.quantity = quantity;
	}
	//bu method, her bir productin fiyati ile product adedini carparak total fiyati doner.
	public double getItemTotal() {
		return product.getRetailPrice()*quantity;
		
	}
	//degiskenlere ait get ve set moethodlari
    public int getLineNbr() {
		return lineNbr;
	}
	public void setLineNbr(int lineNbr) {
		this.lineNbr = lineNbr;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//bu method, producta ait birim fiyati doner.
    public double getUnitPrice() {
    	return product.getRetailPrice();
    }
    public double getTax() {
    	if(product instanceof Hardware) {
    		return ((Hardware) product).getTax();
    	}
    	return 0.0;
    }
    
}
