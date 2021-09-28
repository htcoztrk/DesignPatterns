package Visitor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VisitorProvider visitor=new VisitorProvider();
		
		Animal cat=new Cat();
		
		Animal bird=new Bird();
		
		cat.accept(visitor);
		
		bird.accept(visitor);
	}

}
