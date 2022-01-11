package entities.concretes;

//Manual sinifi Product sinifini extends ederek, product sinifindan turemis olacak.
public class Manual extends Product{
	private String publisher;
	public Manual(String description, int id, String name, double retailPrice,String publisher) {
		super(description,  id,  name,  retailPrice);
		this.publisher=publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
