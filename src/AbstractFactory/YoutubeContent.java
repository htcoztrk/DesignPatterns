package AbstractFactory;

public class YoutubeContent implements AbstractFactory {

	@Override
	public Account creatAccount() {
		// TODO Auto-generated method stub
		return new Youtube();
	}

	@Override
	public Content createContent() {
		// TODO Auto-generated method stub
		return new Video();
	}

}
