
import java.util.*;

public class Bisiesto {

    static long anio;

    static boolean esBisiesto(long anio, long x) {
        boolean verificar = false;
        if (anio % x == 0) {
            verificar = true;
        }
        return verificar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            anio = sc.nextLong();
            long diferenciaBisiesto = sc.nextLong();
            long aniosBisiestosPasados = sc.nextLong();
            long op = 0;

            long anioFinal = 0;
            if (esBisiesto(anio, diferenciaBisiesto) == false) {

                for (long i = anio; i > 0; i++) {
                    if (esBisiesto(i, diferenciaBisiesto) == true) {
                        anioFinal = i;
                        break;

                    }

                }
                op = anioFinal - (diferenciaBisiesto * aniosBisiestosPasados);

            } else {
                op = anio - (diferenciaBisiesto * (aniosBisiestosPasados - 1));
            }

            System.out.println(op);

        }
    }
}
