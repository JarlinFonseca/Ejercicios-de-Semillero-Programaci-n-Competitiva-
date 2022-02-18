import java.util.*;
public class TrianguloRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int casos=sc.nextInt();
        while(casos-->0){
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
         double hipotenusa=0;
         double op= 0; 
          if (n1 > n2) {
            if (n1 > n3) {
                hipotenusa=n1;
                op=Math.sqrt(Math.pow(n2, 2)+Math.pow(n3, 2));
 
            } else {
                 op=Math.sqrt(Math.pow(n2, 2)+Math.pow(n1, 2));
                 hipotenusa=n3;
            
            }
        } else if (n2 > n3) {
            hipotenusa=n2;
             op=Math.sqrt(Math.pow(n1, 2)+Math.pow(n3, 2));
 
        } else {
            hipotenusa=n3;
             op=Math.sqrt(Math.pow(n2, 2)+Math.pow(n1, 2));
         
        }
          
          if(op==hipotenusa){
              System.out.println("SI");
          }else System.out.println("NO");
    }
        
    }
    
}
