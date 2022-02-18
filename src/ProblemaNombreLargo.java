import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

 public class   ProblemaNombreLargo {	


    public static void main(String [] args) throws IOException{
      
       Scanner sc = new Scanner();

       int cant=Integer.parseInt(sc.next());
       while(cant>0){
           String s=sc.next();
      
       if(s.equals("0")){
           System.out.println(1);
       }else if(s.equals("1")){
            System.out.println(66);
       }else{
            int a = (int)(s.charAt(s.length() - 1) - '0');
           if(a==0||a==5){
                System.out.println(76);
           }
           if(a==1||a==6){
                System.out.println(16);
           }
           if(a==2||a==7){
                System.out.println(56);
           }
            if(a==3||a==8){
                System.out.println(96);
           }
             if(a==4||a==9){
                System.out.println(36);
           }
       }
       
       cant--;
       }
    }
    static class Scanner {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        int spaces = 0;
       
        
        public String nextLine() throws IOException {
            if (spaces-- > 0) {
                return "";
            } else if (st.hasMoreTokens()) {
                return new StringBuilder(st.nextToken("\n")).toString();
            }
            return br.readLine();
        }

        public String next() throws IOException {
            spaces = 0;
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public boolean hasNext() throws IOException {
            while (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) {
                    return false;
                }
                if (line.equals("")) {
                    spaces = Math.max(spaces, 0) + 1;
                }
                st = new StringTokenizer(line);
            }
            return true;
        }
      
           
    }
     
}

