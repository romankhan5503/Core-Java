package reusability;

class B{
	int x = 10;
	
	void show() {
		System.out.println("show....");
	}
}

public class Association {

	public static void main(String[] args) {
		B b = new B(); //Association
		b.show();
		
		new B(); //Composition
		B b1; //Aggregation

	}

}
//like another example















