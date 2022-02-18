
import java.util.*;

public class Inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        long valor=sc.nextLong();
        double ope= Math.pow((1+(1/(double)valor)),valor);
        System.out.printf("%.5f%n",ope);
           
        }
    }
    
}
