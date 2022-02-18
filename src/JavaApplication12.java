
import java.util.Scanner;

public class JavaApplication12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            int datos = sc.nextInt();
            int v[] = new int[datos];
            for (int x = 0; x < datos; x++) {
                v[x] = sc.nextInt();
            }
            System.out.println("Case #" + i + ":");
            encontrarEdificio(datos, v);
            System.out.println("");
        }
    }

    public static void encontrarEdificio(int datos, int vector[]) {
        for (int z = 0; z < datos; z++) {
            int altura = -1;
            for (int j = z + 1; j < datos; j++) {
                if (vector[z] < vector[j]) {
                    altura = vector[j];
                    break;
                }
            }
            String rta = "";
            String alturaS = String.valueOf(altura);
            rta = (z == datos - 1) ? alturaS : alturaS + " ";
            System.out.print(rta);

        }
    }
}
