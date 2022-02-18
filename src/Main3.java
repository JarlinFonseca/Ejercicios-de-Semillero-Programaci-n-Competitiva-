import java.util.*;

public class Main3 {
    
    
    public static void main(String [] args){
            
            Scanner sc = new Scanner(System.in);
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            long rta=factorialIterative(num1);
            System.out.println(rta);
            
            
    
}
      public static long factorialIterative(long n){
	long soln=1;
	for(int i=1; i <=n; i++){
	    soln *= i;
	}
	return soln;
    }
      public static long factorial(int n){

	if (n==1)
	    return 1;
	return n * factorial(n-1);
}
    
    public static long modInverse(int a, int mod) {
    long d = extendedEuclid(a, mod);
    if (d > 1) {
        return -1;
    }
    return (x % mod + mod) % mod;
}
    
    static int x, y;

static int extendedEuclid(int a, int b) {
    if (b == 0) { 
    	x = 1;
    	y = 0;
    	return a;
    }
    int d = extendedEuclid(b, a % b);
    int temp = x;
    x = y;
    y = temp - ((a/b)*y);
    return d;
}
}
