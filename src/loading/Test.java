package loading;

import java.util.Scanner;

class A //extends B
{
	static int x = 10;
	static {
		System.out.println("A is loading...");
	}
}

class B{
	static {
		System.out.println("B is loading...");
	}
}

public class Test //extends A
{
	static {
//		A a = new A();
//		B b = new B();
		//System.out.println(A.x);
		System.out.println("class is loading...");
		//System.exit(0);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of clss to be loaded");
		String name = s.next();
		try {
			Class.forName(name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		//System.out.println("main...");

	}

}
