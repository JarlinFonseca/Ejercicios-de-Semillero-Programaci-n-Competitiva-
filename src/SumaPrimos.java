
import java.util.*;
public class SumaPrimos {
    public static boolean esPrimo(int numero)
{
    boolean esPrimoActual = true;
    if(numero<2)
    {
        esPrimoActual = false;
    }
    else
    {
        for(int x=2; x*x<=numero; x++)
        {
            if( numero%x==0 ){esPrimoActual = false;break;}
        }
    }
    return esPrimoActual;
}
  
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
  while(sc.hasNext()){
            int N=sc.nextInt();
            if(N==(0)){break;}
            int suma=0;
            int num2=N;
          
                for(Integer i=1;i<=num2;i++){

                   if(esPrimo(i)){
                        suma+=i;
                   }
                       
                    
                
            }

            System.out.println(suma);
  }
    }
    
}
