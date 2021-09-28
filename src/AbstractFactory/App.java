package AbstractFactory;

public class App {

	private Account account;
	
	private Content content;

	public App(AbstractFactory factory) {
		
		account = factory.creatAccount();
		
		content = factory.createContent();
	}

	public void yazdir() {
		
		account.createAddress();
		
		content.createContent();
	}
}
