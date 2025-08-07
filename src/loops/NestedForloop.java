package loops;

public class NestedForloop {

	public static void main(String[] args) {
		for (int i = 1;i<=3;i++) {
			System.out.println("Outer:" +i);
			
			for (int j = 1; j<=4;j++) {
				System.out.println("Inner:" +j);
			}
		}

		//for multiplication
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i*j + " ");
			}
			System.out.println();
		}
		
		
		//for loop with array
		int arr[][] = {
	            {2, 7, 9},
	            {3, 6, 1},
	            {7, 4, 2}
	        };

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        /*what is we doing in upper for loop with array?
	             in this loop we are doing array with loop, like in line 32  it print like normal loop but in this 
	             program this [i][j] are showing array's row and column 
	             eg:-  we have 1t for loop(i) it print 0 and the another for loop(j) also print 0,  so we have 
	                    0 or 0, [0][0] in are this show row and column and the final output is 2
	        */
	}

}
