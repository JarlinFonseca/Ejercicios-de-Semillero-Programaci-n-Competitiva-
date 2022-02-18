
import java.util.*;

public class NightAtTheMuseum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String pal = sc.next();
            char[] c = pal.toCharArray();
            int conta = 0;
            for (int i = 0; i < c.length; i++) {
                int num = 0;
                if (i == 0) {
                    num = 97;

                } else {
                    num = c[i - 1];
                }
                int resta = Math.abs(num - c[i]);
                int op2 = 26 - resta;
                if (resta < op2) {
                    conta += resta;
                } else if (resta > op2) {
                    conta += op2;
                } else {
                    conta += resta;
                }

            }
            System.out.println(conta);
        }
    }

}
