
import java.util.*;

public class LogicalSequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        int arre[]= new int[y];         
        int conta=1;

        while(conta<=y){
           arre[conta-1]=conta;   
           conta++;    
        }
            
        for (int i = 0,j=1; i < arre.length; i++,j++) {   
                if(j==x){
                    System.out.print(arre[i]);
                    System.out.println("");
                   
                    j=0;
                }else
                    System.out.print(arre[i]+" ");
                     
        }
 
    }
    
}
