
import java.util.*;

public class CarlosYPromedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos > 0) {
            int suma = 0;
            int conta = 0;
            int arreglo[] = new int[50];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = sc.nextInt();
                suma += arreglo[i];
                conta++;
                if (arreglo[i] == 0) {
                    break;
                }
            }
            int promedio = suma / (conta - 1);
            System.out.println(promedio + " = " + suma + " / " + (conta - 1));

            casos--;
        }

    }

}
