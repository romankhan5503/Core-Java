package controlstatement;

public class IfandElseandElseif {

	public static void main(String[] args) {
		//if else statement
		int marks = 70;
		
		if (marks >= 70) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		//if, else if, else statement
		int number = 90;
		
		if (number <= 70) {
			System.out.println(true);
		} else if (number >= 80) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		//real life example of door lock
		int door_lock = 4362;
		
		if (door_lock == 4362) {
			System.out.println("Door is Open");
		} else {
			System.out.println("Wrong Password");
		}
		
		//real life example to find even or odd
		int num = 7;
		
		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}
}


/*
 if (if a specified condition is true, then block of code will be executed)

 else (if the same condition is false, then else statement is to be executed)

 else if (if the first condition is false, then else if statement is to be executed)

 switch (Instead of writing many if..else statements, you can use the switch statement.)
*/