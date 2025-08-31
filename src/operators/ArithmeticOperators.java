package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int result = 1+2;
		System.out.println(result);
		
		int final_result= result;
		result= result - 1;
		System.out.println(result);
		
		final_result = result;
		result = result * 2;
		System.out.println(result);
		
		final_result = result;
		result = result / 2;
		System.out.println(result);
		
		final_result = result;
		result = result % 2;
		System.out.println(result);
		
		final_result = result;
		result = ++ result;
		System.out.println(result);
		
		final_result = result;
		result = -- result;
		System.out.println(result);
		

	}

}
//used to perform operations on variable and values
//Java divides the operators into the following groups:

/* 1. Arithmetic operators:- 
          used to perform common mathematical operations. 
          it has addition(+), substraction(-), multiplication(*), module(%), division(/), increment(++), decrement(--)
                
  2. Assignment operators(=):- 
          used to assign values to variables. it has (+=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=)
          
  3. Comparison operators:-
          Comparison operators are used to compare two values (or variables).
          it has Equal to(==), Not equal(!=), Greater than(>), Less than(<), Greater than or equal to(>=), Less than or equal to(<=)	

  4. Logical(conditional) operators:- 
          used to determine the logic between variables or values:
          it has Logical and(&&), Logical or(||), Logical not(!)	

  5. Bitwise operators:-
           
  
*/