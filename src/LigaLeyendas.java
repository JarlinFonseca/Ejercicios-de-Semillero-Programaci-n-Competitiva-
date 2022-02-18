import java.util.*;
public class LigaLeyendas {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int casos=sc.nextInt();
        while(casos-->0){
            int num=sc.nextInt();
            if(num>=0&&num<=5){
                System.out.println("leyenda");
            }
            
            else if(num>5&&num<=30){
                System.out.println("platino");
            }else if(num>30&&num<=155){
                System.out.println("oro");
            }else if(num>155&&num<=780){
                 System.out.println("plata");
            }else{
                System.out.println("bronce");
            }
            
            
        }
                
    }
}
