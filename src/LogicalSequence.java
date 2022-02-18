import java.util.*;
public class LogicalSequence {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int cantidad=sc.nextInt();
        System.out.println(getSequence(cantidad)); 
        
        
        
    
    }
    
    static String getSequence(int n){
        String cadena="";
        int conta=1;
        int num1,num2,num3;
        while(conta<=n){
        num1=conta;
        num2=num1*num1;
        num3=num1*num2;
        cadena+=num1+" "+num2+" "+num3+"\n";
        if(conta<n)
            cadena+=num1+" "+(++num2)+" "+(++num3)+"\n";
        else
             cadena+=num1+" "+(++num2)+" "+(++num3);
            
        conta++;
        
        }
        
        return cadena;
    
    
    }
    
}
