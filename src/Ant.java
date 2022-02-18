
import java.util.*;

public class Ant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            int op = (int) Math.ceil(Math.sqrt(N));
            int aux = (((op * op) - op) + 1);
            int x = op;
            int y = op;

            if (op % 2 == 0) {
                if (N > aux) {
                    y -= N - aux;
                } else {
                    x -= aux - N;
                }
            } else {
                if (N > aux) {
                    x -= N - aux;
                } else {
                    y -= aux - N;
                }
            }
            System.out.println(x + " " + y);
        }
    }

}
