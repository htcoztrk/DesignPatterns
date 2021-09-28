package Visitor;

public class VisitorProvider implements Visitor {

	@Override
	public void visitUcma(Animal animal) {
		// TODO Auto-generated method stub
		if(animal instanceof Bird) {
			System.out.println("kuslar ucabilir");
		}
		else if(animal instanceof Cat) {
			System.out.println("kediler ucamaz");
		}
	}

	@Override
	public void visitTirmalama(Animal animal) {
		// TODO Auto-generated method stub
		if(animal instanceof Bird) {
			System.out.println("kuslar tirmalamaz");
		}
		else if(animal instanceof Cat) {
			System.out.println("kediler tirmalar");
		}
	}

}
