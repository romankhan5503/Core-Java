package oops;

abstract class A{
	//abstract int x = 10; //it doesn't work because we cannot give it abstract onto data.
	
abstract void show(); //in here if we do it declaration then it shows error
//abstract final void show(); //abstract on final not work shows error 
//abstract private void show(); //abstract on private not work shows error
//abstract static void show(); //abstract on static not work shows error

void disp() {
	System.out.println("disp....");
}
}

abstract class B extends A{
	
}

public class Abstraction extends A{

	public static void main(String[] args) {
		//A a = new A(); //cannot create an object of an abstract class
		
		A a; //we can create reference variable
		Abstraction t = new Abstraction();
		t.show();
		t.disp();

	}

	@Override
	void show() {
		System.out.println("show....");
		
	}

}
