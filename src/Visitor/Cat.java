package Visitor;


public class Cat implements Animal {

	private String name;
	
public String getName() {
	return this.name;
}

@Override
public void beslenme() {
	// TODO Auto-generated method stub
	System.out.println("kedi beslendi");
}

@Override
public void accept(Visitor visitor) {
	// TODO Auto-generated method stub
	visitor.visitTirmalama(this);
}
}
