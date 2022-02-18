
import java.util.*;


public class TakeTheLand {

    static long matriz[][];

    static long maxRangeSum2D(long[][] a) {
        long maxSubRect = Long.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = i; k < a.length; k++) {
                    for (int l = j; l < a[k].length; l++) {
                        long sub = matriz[k][l];
                        
                        if (i > 0) sub -= matriz[i - 1][l];                          
                        if (j > 0) sub -= matriz[k][j - 1];
                        if (i > 0 && j > 0) sub += matriz[i - 1][j - 1];
                            
                        
                        maxSubRect = Math.max(sub, maxSubRect);
                    }

                }
            }
        }
        return Math.max(maxSubRect ,0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            
            int filas = sc.nextInt();
            int columnas = sc.nextInt();
            matriz = new long[filas][columnas];
            if (filas == 0 && columnas == 0) {
                break;
            } else {
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = sc.nextInt() == 0 ? 1 : Integer.MIN_VALUE;
                                            
                        if (i > 0)  matriz[i][j] += matriz[i - 1][j];
                        if (j > 0) matriz[i][j] += matriz[i][j - 1];
                        if (i > 0 && j > 0)  matriz[i][j] -= matriz[i - 1][j - 1];
                           
                        
                    }
                }
                System.out.println(maxRangeSum2D(matriz));

            }
        }
    }
}
