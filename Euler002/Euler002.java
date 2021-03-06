/*	PROBLEM
 * 	-------------
 * 	Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 	By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * 	
 * 	ANALYSIS
 * 	------------
 * 	Our program will give us as a screen output the sum of all even fibonacci numbers smaller than 4M.
 * 
 * 	START
 * 		Get the sum of all fibonacci numbers below 4M
 * 		Print the answer
 * 	ENDPP
 */

public class Euler002 {
	
	public static void main (String[] args) {
		Fibonacci fibonacci = new Fibonacci();  //Create a new fibonacci object
		long total = fibonacci.sum(4000000,2);   //Call its sum method with 4M limit and 2 divisibleBy parameters
		System.out.println(total);              //Print the answer
	}
}

