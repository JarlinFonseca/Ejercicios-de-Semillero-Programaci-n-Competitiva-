
import java.util.*;

public class VueltaEspaña {

    public static int calcularMenor(int arre[]) {
        int menor = arre[0];
        for (int i = 0; i < arre.length; i++) {
            if (arre[i] < menor) {
                menor = arre[i];
            }
        }
        return menor;
    }

    public static int calcularMayor(int arre[]) {
        int mayor = arre[0];
        for (int i = 0; i < arre.length; i++) {
            if (arre[i] > mayor) {
                mayor = arre[i];
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos > 0) {
            int numeroCiclistas = sc.nextInt();
            int minutosCiclistas[] = new int[numeroCiclistas];
            for (int i = 0; i < minutosCiclistas.length; i++) {
                minutosCiclistas[i] = sc.nextInt();
            }
            int operacion = calcularMayor(minutosCiclistas) - calcularMenor(minutosCiclistas);
            System.out.println(operacion);

            casos--;
        }

    }

}
