package AbstractFactory;

public class TwitterContent implements AbstractFactory {

	@Override
	public Account creatAccount() {
		// TODO Auto-generated method stub
		return new Twitter();
	}

	@Override
	public Content createContent() {
		// TODO Auto-generated method stub
		return new Blog();
	}

}
