import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class ColaStrings
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       Queue<String> cola=new LinkedList();
        int casos=sc.nextInt();
        while(casos>0){
            String nombre=sc.next();
            if(nombre.equals("PUSH")){
                String nom=sc.next();
                cola.add(nom);
            }else if(nombre.equals("POP")){
               if(!cola.isEmpty()){
                System.out.println(cola.poll());
            }else{
                 System.out.println("-");
            }
            }
            
          
            casos--;
        }
    }
}
                    