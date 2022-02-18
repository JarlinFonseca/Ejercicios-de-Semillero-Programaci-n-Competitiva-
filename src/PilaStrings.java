import java.util.*;
import java.util.Stack;
public class PilaStrings
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Stack<String> pila=new Stack<String>();
        int casos=sc.nextInt();
        while(casos>0){
            String nombre=sc.next();
            if(nombre.equals("PUSH")){
                String nom=sc.next();
                pila.push(nom);
            }else if(nombre.equals("POP")){
               if(!pila.isEmpty()){
                System.out.println(pila.pop());
            }else{
                 System.out.println("-");
            }
            }
            
          
            casos--;
        }
    }
}
  