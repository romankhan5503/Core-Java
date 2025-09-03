package constructor;

public class Main {

	String name;
	int rollno;
	
	public Main(String s, int rl) {
		name = s;
		rollno = rl;
	}
	
	public static void main(String args[]) {
		Main m = new Main("Roman",21);
		
		System.out.println("Name: " + m.name + "\nRoll No. " + m.rollno); 
		
	}
}
