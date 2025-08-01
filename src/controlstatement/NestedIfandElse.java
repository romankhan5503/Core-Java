package controlstatement;

public class NestedIfandElse {

	public static void main(String[] args) {
		int i = 50;
		
		if (i == 50) {
			System.out.println("i is 50");
			
			if(i < 75) {
				System.out.println("i is less than 75");
				
				if(i < 90) {
					System.out.println("i is less than 90");
				}
			}
		}

	}

}

