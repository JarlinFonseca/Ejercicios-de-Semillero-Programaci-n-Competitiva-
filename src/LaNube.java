/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;


public class LaNube {

    static int albums;
    static int limitePeso;
    static int memo[][];
    static int canciones[];
    static int peso[];

      static  int f(int idx, int w) {
        
        int inf = 1000000000;
        if (w < 0) {
            return -inf;
        }
        if (idx >= albums) {
            return 0;
        }
        if (memo[idx][w] != -1) {
            return memo[idx][w];
        }
        int ans = Math.max(f(idx + 1, w), f(idx + 1, w - peso[idx]) + canciones[idx]);
        memo[idx][w] = ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int casos = sc.nextInt();
      
        while (casos > 0) {
           albums = sc.nextInt();
            limitePeso = sc.nextInt()*1024;
            
              memo = new int[albums+5][limitePeso+5];

            for (int i = 0; i < memo.length; i++) {
                for (int j = 0; j < memo[i].length; j++) {
                    memo[i][j] = -1;
                }
            }

            canciones = new int[albums];
            peso = new int[albums];

            for (int i = 0; i < canciones.length; i++) {
                canciones[i] = sc.nextInt();

            }
            for (int i = 0; i < peso.length; i++) {

                peso[i] = sc.nextInt();
            }

            int rta = f(0, limitePeso);

            System.out.println(rta);
            casos--;
        }
    }
}
