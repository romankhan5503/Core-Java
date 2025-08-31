package overriding;

class Car{
	void run() {
		System.out.println("Car is slower then bike, sometime....");
	}
}

class Bike extends Car{
	void run() {
		super.run();
		System.out.println("Bike is Fast....");
	}
}

public class Overriding extends Bike{

	void run() {
		super.run();
		System.out.println("Bike is too Fast....");
	}
	public static void main(String[] args) {
		Overriding o = new Overriding();
		o.run();

	}

}
