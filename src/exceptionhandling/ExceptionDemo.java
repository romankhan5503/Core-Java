package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String args[]) {
		
		//String st = null;
		//System.out.println(st.length());
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int x=s.nextInt();
		System.out.println("Enter Second Number:");
		int y=s.nextInt();
		int z = x + y;
		System.out.println("Sum : "+z);
		int z1 = x-y;
		System.out.println("Sub : "+z1);
		
		//try {
		int z2 = x/y;
		System.out.println("Div : "+z2);
		//}
		//we cannot write statement in between try and catch
		//catch(ArithmeticException r) {
			//System.out.println(r);
		//}
		
		int z3 = x*y;
		System.out.println("Mult : "+z3);
		
		System.out.println("normal flow....");
		}
}
