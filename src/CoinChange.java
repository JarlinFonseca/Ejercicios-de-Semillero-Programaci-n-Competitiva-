
import java.util.*;

public class CoinChange {

    public static int[] valoresMonedas = {1, 5, 10, 25, 50};
    public static int[][] memo;

    public static int formasCambios(int tipo, int valor) {
        if (valor == 0) {
            return 1;
        }
        if (valor < 0 || tipo == 5) {
            return 0;
        }
        if (memo[tipo][valor] != -1) {
            return memo[tipo][valor];
        }
        return memo[tipo][valor] = formasCambios(tipo + 1, valor) + formasCambios(tipo, valor - valoresMonedas[tipo]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        memo = new int[5][7500];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(formasCambios(0, n));
        }
    }
}
