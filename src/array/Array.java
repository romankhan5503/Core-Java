package array;

public class Array {

	public static void main(String[] args) {
		
		//normal using array also called 1d(one dimensional) through creating object
		int[] mrk = new int [4];
		
		mrk [0] = 1;
		mrk [1] = 2;
		mrk [2] = 3;
		
		System.out.println(mrk[0]);
		System.out.println(mrk[1]);
		System.out.println(mrk[2]);
		
		//print in single line
		System.out.println(mrk[0]+""+mrk[1]+mrk[2]);
		
		
		//print single value in single line 
		String[] srk = {"shahrukh khan"};
		System.out.println(srk[0]);
		
		//print multiple value / Access the Elements of an Array
		String[] sk = {"Salman","khan"};
		System.out.println(sk[0]+" "+sk[1]);
		System.out.println(sk.length);
		
	}
}

 /*
 array are used to store multiple value in a single variable  /  array is collection of similar type of data store into contagious memory location
 

Why use Arrays?
To store multiple values in one variable.
To handle a fixed number of elements efficiently.
 */

