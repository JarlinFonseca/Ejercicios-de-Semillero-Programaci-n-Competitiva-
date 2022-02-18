import java.util.*;
public class RectasPlanoCartesiano
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int casos=sc.nextInt();
        while(casos>0){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if(y1==y2&&x1!=x2){
                System.out.println("Recta paralela al eje X");
            }else if(x1==x2&&y1!=y2){
                System.out.println("Recta paralela al eje Y");
            }else{

                System.out.println("Recta no paralela a ningun eje");

            }

            casos--;
        }
    }

}
