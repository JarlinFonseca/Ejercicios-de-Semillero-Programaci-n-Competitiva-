
import java.util.*;

public class DoblementeGlorioso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            int casos = sc.nextInt();
            int puntos = 0;
            while (casos > 0) {
                int Cucuta = sc.nextInt();
                int otro = sc.nextInt();

                if (Cucuta > otro) {
                    puntos += 3;
                } else if (Cucuta < otro) {
                    puntos += 0;
                } else {
                    puntos += 1;
                }
                System.out.println(puntos);

                casos--;
            }

            cases--;
        }

    }

}
