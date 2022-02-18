// Steve J Hodges, Computer Science, Cabrillo College
// CS20j Java Programming, Fall 2010
// Recursion example: factorial
//    for limited values of "n"

import java.util.*;

public class Factorial{
    // calculate factorial(n) recursively
    // pre-requisite: n >= 1
    // uses a long for larger range than int
    // for a bigger range we could use the BigInteger class
    public static long factorial(long n){

	if (n==1)
	    return 1;
	return n * factorial(n-1);
}
    
    // calculate factorial(n) iterativly
    // pre-requisite: n >= 1 
    public static long factorialIterative(long n){
	long soln=1;
	for(int i=1; i <=n; i++){
	    soln *= i;
	}
	return soln;
    }

    // calculate approximate value of n!
    //  using Stirling's approximation:
    //  sqrt(2pi*n)*(n^n)*e^(-n)
    public static double factorialApproximation(long n){
	return Math.sqrt(2.0*Math.PI*n)*Math.pow(n,n)*Math.pow(Math.E, -n);
    }


    public static void main (String[] args)
    {
	long n;
	Scanner keyboard = new Scanner (System.in);
	System.out.println("CS20j Factorial Recursion Example");
	System.out.print("n? ");
	while( keyboard.hasNextLong() ){
	    n = keyboard.nextLong();
	    System.out.println("Recursive: "+factorial(n));
	    System.out.println("Iterative: "+factorialIterative(n));
	    System.out.println("Stirling's: "+factorialApproximation(n));
	    System.out.print("n? ");
	}

    }
}