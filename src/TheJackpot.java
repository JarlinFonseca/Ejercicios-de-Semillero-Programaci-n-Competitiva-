import java.util.*;

public class TheJackpot {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while ((num = sc.nextInt()) != 0) {
            int[] arr = new int[num];
            int maximo = 0; 
            int var = 0;
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < num; i++) {
                var = Math.max(var + arr[i], arr[i]);
                maximo = Math.max(maximo, var);
            }
            if (maximo > 0) {
                System.out.printf("The maximum winning streak is %d.\n", maximo);
            } else {
                System.out.println("Losing streak.");
            }
        }
    }
}
      