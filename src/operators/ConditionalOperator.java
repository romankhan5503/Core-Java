package operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		if ((a == b) && (a > b)){
			System.out.println("false");
		}
		if ((a <= b) || (b >= a)) {
			System.out.println("true");
		}

	}

}
