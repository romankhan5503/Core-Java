package string;

public class StringBuilder {
	public StringBuilder(String string) {
		
	}

	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);  // Hello World (modified same object)
    }

	private void append(String string) {
		
	}
}

