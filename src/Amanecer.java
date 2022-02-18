import java.util.*;

public class Amanecer
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int casos;
        casos = sc.nextInt();
       
        while(casos>0){
          TreeSet<Integer> num = new TreeSet<>();
          int dias;
          dias = sc.nextInt();
          
            while(dias>0){
               
                
                num.add(sc.nextInt());
        
                 dias--;
                }
              
             System.out.println("Horas diferentes: "+num.size());
             System.out.println("Temprano: "+num.first()/60+":"+num.first()%60);
             System.out.println("Tarde: "+num.last()/60+":"+num.last()%60);
            casos--;
           
        }
        
    }
}