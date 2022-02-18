
import java.util.*;

public class SueñoDelTio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long P = sc.nextLong();
            long K = sc.nextLong();
            long N = sc.nextLong();

            double formula = 1 - (4 * P) + (4 * Math.pow(P, 2)) - (8 * K) + (8 * N);

            double x1 = (double) (-1 + (2 * P) + Math.sqrt(formula)) / (double) 2;
            double rta = 0;
            if (x1 % 2 == 0 || x1 % 2 == 1) {
                rta = x1 + 1;
            } else {
                rta = Math.ceil(x1);

            }
            System.out.println((long) rta);

        }
    }
}
