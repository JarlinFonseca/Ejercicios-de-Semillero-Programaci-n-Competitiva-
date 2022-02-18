
import java.math.BigInteger;
import java.util.*;

public class HowManyWays{

    public static BigInteger factorial(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            f = f.multiply(new BigInteger(i + ""));
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int resta = m - n;
            if (n == 0 && m == 0) {
                break;
            } else {
                BigInteger op = factorial(m);
                BigInteger op2 = (factorial(resta).multiply(factorial(n)));
                BigInteger rta = op.divide(op2);
                System.out.println(rta);
            }

        }

    }

}
