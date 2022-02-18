import java.util.*;

public class CanteenQueue
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int casos;

        casos = sc.nextInt();
        while(casos>0){
            int estudiantes;
            estudiantes = sc.nextInt();
            int arrePrincipal[]= new int[estudiantes];
            int arre[]= new int[estudiantes];

            for(int i=arre.length-1; i>=0;i--){
                arrePrincipal[i]=sc.nextInt();
                arre[i]= arrePrincipal[i];

            }
            Arrays.sort(arre);
            int arre2[]= new int[estudiantes];
            for(int i=arre.length-1; i>=0;i--){
                arre2[i]=arre[i];
            }
            int conta=0;

            for(int i=0; i<arre.length;i++){

                if(arrePrincipal[i]==arre2[i]){
                    conta++;
                }

            }
            System.out.println(conta);
            conta=0;

            casos--;
        }
    }
}

