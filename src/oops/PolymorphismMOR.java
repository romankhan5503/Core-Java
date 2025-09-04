package oops;

class Animals{
	void sound() {
		System.out.println("m1() method in class Animals");
	}
}

class Dog extends Animals{
	void sound() {
		System.out.println("m2() method in class Dog");
	}
}

public class PolymorphismMOR {

	public static void main(String[] args) {
		Animals a = new Dog();
	
		a.sound();
	}
}
