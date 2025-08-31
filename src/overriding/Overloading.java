package overriding;

class Calculator {
	int add(int a, int b) {
		return a+b;	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(double a, double b) {
		return a+b;
	}
}

class Student{
	void show(String name) {
		System.out.println("Name is : " +name);
	}
	
	void show(String name, int age) {
		System.out.println("Name is : " + name + "  Age is : " + age);
	}
	
	void show(String name, int age, float bp) {
		System.out.println("Name is : " + name + "  Age is : " + age + "  Book Price is : " + bp);

	}
}

public class Overloading {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(5,10));
		System.out.println(cal.add(10,20,20));
		System.out.println(cal.add(2.5,3.5));

		Student s = new Student();
		s.show("Roman");
		s.show("Shabaz",24);
		s.show("Roman",22,300.40f);
	}

}
