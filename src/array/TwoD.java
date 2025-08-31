package array;

public class TwoD {

	public static void main(String[] args) {
		int [] [] man = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(man [1] [2]);
		
		
		int [] [] name = {{7,8,9}, {1,2,3}, {4,5,6}, {10,11,12}, {13,14,15}};
		System.out.println(name[0][2]+" "+name [2][2]+" "+name[1][2]+" "+name[3][0]+" "+name[4][1]);
		
		int [][] krk = new int [4][6];
		
		krk [0][0] =1;
		krk [0][1] = 2;
		System.out.println(krk[0][0]+" "+krk[0][1]);
		/*[0] = {1,2,3}
		  [1] = {4,5,6}
		  [2] = {7,8,9}
		  these are rows
		  
		  [0] = {1} 
		  [1] = {2} 
		  [2] = {3} 
		  these are columns
		  
		  What is a 2D Array?
A 2D array is like a table (rows and columns), or an array of arrays.

notes:-
Not all inner arrays need to be the same length — it's called a jagged array.
		 */

	}

}
