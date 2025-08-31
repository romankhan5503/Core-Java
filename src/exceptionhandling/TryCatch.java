package exceptionhandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

//		String s1 = null;
//		System.out.println(s1.length());
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int x=s.nextInt();
		System.out.println("Enter Second Number:");
		int y=s.nextInt();
		int z = x + y;
		System.out.println("Sum : "+z);
		int z1 = x-y;
		System.out.println("Sub : "+z1);
		
		try {
			String s1 = null;
			System.out.println(s1.length());
			
		int z2 = x/y;
		System.out.println("Div : "+z2);
		}
//		catch(Exception r) {
//			System.out.println("Right");
//		}
		
		//we cannot write statement in between try and catch
		catch(ArithmeticException r) {
			System.out.println(r);
		}
		//we can do multiple catch on one try
		catch(NullPointerException r) {
			System.out.println("NullPointerException");
		}
		
		catch(NumberFormatException r) {
			System.out.println("NumberFormatException");
		}
		
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		int z3 = x*y;
		System.out.println("Mult : "+z3);
		
		System.out.println("normal flow....");
		}


	}


