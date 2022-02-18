
import java.util.*;


public class TresHermanos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int darla = 0, daniel = 0, david = 0;

        while (sc.hasNext()) {

            int casos = sc.nextInt();
            int op = casos / 3;
            darla = op;
            daniel = op;
            david = op;
            if (casos % 3 == 1) {

                darla++;

            } else if (casos % 3 == 2) {
                darla++;
                david++;
            }

            System.out.println(darla + " " + david + " " + daniel);

        }

    }

}
