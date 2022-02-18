import java.util.*;
public class Main2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos=sc.nextInt();
        sc.nextLine();
        while(casos-->0){
          
        String frase=sc.nextLine();
         String[]parts=frase.split(" ");
         List<String> fraseList = new ArrayList<String>();
         fraseList = Arrays.asList(parts);
        String pal="bro";
        boolean vef=true;
        for(int i=0; i<parts.length;i++){
        if(pal.equals(parts[i])){
            vef=true;
        }else{
        vef=false;
        }
        }
        if(vef==false){
            
             frase+=" bro";
            
            
        }
            System.out.println(frase);
}
        String palabra= "hola como estas? bro?.!"; 
palabra=palabra.replace('.',' ').replace('?',' ').replace('!',' '); 
System.out.println(palabra.replaceAll(" ", ""));  
         System.out.println(palabra);
 
}
}
