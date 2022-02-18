import java.util.*;
public class TestingTheCatcher {
    static ArrayList<Integer> patrones = new ArrayList<Integer>();
    static int [][] memo;
    
    static int maximoMisiles(int i, int j){
        if(j >= patrones.size())
            return 0;
        else if(memo[i][j] != -1)
            return memo[i][j];
        else
            return memo[i][j] = patrones.get(i) >= patrones.get(j) ? (Math.max(1 + maximoMisiles(j, j+1), maximoMisiles(i, j+1))) : maximoMisiles(i, j+1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int patron=0;
        int casos = 0;
        while((patron = sc.nextInt()) != -1){
            if(casos > 1) System.out.print("\n");
               
            patrones.clear();
            patrones.add(Integer.MAX_VALUE);
            while(patron != -1){
                patrones.add(patron);
                 patron = sc.nextInt();
            }
         memo();
            System.out.println(maximoMisiles(0, 1));
        }     
    }
    
    static void memo(){
           memo = new int[patrones.size()][patrones.size()];
            for (int i = 0; i < patrones.size(); i++) {
                for (int j = 0; j < patrones.size(); j++) {
                    memo[i][j] = -1;
                }
            }
    }
}