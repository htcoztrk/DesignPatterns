package AbstractFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Twitter";
		App app = create(name);
		app.yazdir();

	}

	private static App create(String name) {
		App app;
		AbstractFactory factory;
		if (name.equalsIgnoreCase("Youtube")) {
			factory = new YoutubeContent();
			app = new App(factory);

		} else {
			factory = new TwitterContent();
			app = new App(factory);

		}
		return app;
	}

}
