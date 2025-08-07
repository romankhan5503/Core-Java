package methods;

public class Methods {

	static void sum() {
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println("sum=" +z);
	}
	
	static void add(int x,int y) {
		int z = x+y;
		System.out.println("add=" +z);
	}
	
	static void sub(int x, int y, String a, float f, boolean b) {
		
		System.out.println(x+y+a+f+b);
		
	}
	
	static boolean withdraw(String name,int pin) {
		if (name=="Roman" && pin== 7860)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome");

		sum();
		add(29,31);
		sub(20,30,"Roman",3.14f,true);
		System.out.println(withdraw("Roman",7860));
	}

}
