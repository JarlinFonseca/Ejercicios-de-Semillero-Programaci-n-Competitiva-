import java.util.*;

public class Diccionario
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int casos;
        casos = sc.nextInt();
        while(casos>0){
          TreeSet<String> pal = new TreeSet<>();
          int palabras;
          palabras = sc.nextInt();
            while(palabras>0){
                 pal.add(sc.next());
                 
                 palabras--;
                }
                
             for(String p : pal){
             System.out.println(p);
            }
            System.out.println("-");
            casos--;
           
        }
        
    }
}

                    