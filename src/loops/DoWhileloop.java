package loops;

public class DoWhileloop {

	public static void main(String[] args) {
		//do while loop runs atleast once, even if the condition is false
		do {
			System.out.println(a);
			a++ ;
		}
		while (a <= 5);
        
		//while loop
		int b = 10;
		while(b <= 5) {
			System.out.println(b);
			b++;
		}
	}

}

/*The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested
*/