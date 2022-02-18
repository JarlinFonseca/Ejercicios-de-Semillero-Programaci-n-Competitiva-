
import java.util.*;

public class KsushAndArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int casos = sc.nextInt();
            int[] arre = new int[casos];

            boolean vef = true;

            for (int i = 0; i < arre.length; i++) {
                arre[i] = sc.nextInt();
            }

            Arrays.sort(arre);

            int m = arre[0];
            for (int i = 0; i <arre.length; i++) {
                if (arre[i] % m != 0) {
                    vef = false;
                    break;
                }
            }

            if (vef) {
                System.out.println(m);
            } else {
                System.out.println("-1");
            }

        }
    }
}
