package Visitor;

public interface Animal {

	void beslenme();
	
	void accept(Visitor visitor);
	//void ucma();
}
