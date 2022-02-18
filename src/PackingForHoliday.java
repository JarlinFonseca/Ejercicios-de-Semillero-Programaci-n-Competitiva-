
import java.util.*;

public class PackingForHoliday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int conta=0;
        while (casos-- > 0) {
            int L = sc.nextInt();
            int W = sc.nextInt();
            int H = sc.nextInt();
            conta++;
            if (L <= 20 && W <= 20 && H <= 20) {
                System.out.println("Case " + conta + ": good");
            } else {
                System.out.println("Case " + conta + ": bad");
            }

        }
    }
}
