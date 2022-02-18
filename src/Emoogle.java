
import java.util.*;

public class Emoogle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        while (sc.hasNext()) {
            int eventos = sc.nextInt();
            int contadorCero = 0;
            int contadorMayorCero = 0;

            if (eventos == 0) {
                break;
            } else {

                int arre[] = new int[eventos];
                for (int i = 0; i < arre.length; i++) {
                    arre[i] = sc.nextInt();
                    if (arre[i] > 0) {
                        contadorMayorCero++;
                    }
                    if (arre[i] == 0) {
                        contadorCero++;
                    }

                }
                cont++;

                int op = contadorMayorCero - contadorCero;

                System.out.println("Case " + cont + ": " + op);

            }

        }

    }

}
