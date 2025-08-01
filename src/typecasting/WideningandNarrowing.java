package typecasting;

public class WideningandNarrowing {

	public static void main(String[] args) {
		
//		//Widening
		byte a = 30;
		short b = a;
		int c = a;
		long d = a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
//		//Narrowing
		long e = 300;
		int f = (int)e;
		short g = (short)f;
		byte h = (byte)e;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}

}
/*
convert one data type into another
it has 2 types
1. widening [implicit] (smaller type to a larger type Done automatically by Java (no need to write extra code))
                 int → long → float → double
2. narrowing [explicit] (a larger type to a smaller type. You have to do it manually using a cast)
                 double → float → int → byte
*/