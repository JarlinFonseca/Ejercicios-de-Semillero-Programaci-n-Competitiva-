

import java.util.*;
 public class Invertido {
    
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int cantidadNumeros=sc.nextInt();
        int []arre= new int[cantidadNumeros];
        for(int i=0;i<arre.length;i++){
            arre[i]=sc.nextInt();
        }
         for(int i=arre.length-1;i>=0;i--){
             System.out.println(arre[i]);
        }
        
      
        
    }
    
    
}
