import java.util.*;
public class TingoTango{


    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int N=sc.nextInt();
            int F=sc.nextInt();
            int K=sc.nextInt(); 
            int mov=0;
            int pelota = K;

            if(N==0&&F==0&&K==0){
                break;
            }else{

                
                while(pelota!=F){
                    if(pelota<N){
                        pelota++;
                    }else{
                        pelota=1;
                    }
                    mov++;
                }
                System.out.println(mov); 

            }
        }
    }
}

                                   