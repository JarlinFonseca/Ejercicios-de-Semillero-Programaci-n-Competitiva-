
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos > 0) {
            int casos2 = sc.nextInt();
            int arr[] = new int[casos2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int n = arr.length;
            int conta = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j+1] and arr[i] 
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        conta++;

                    }
                }
            }
            System.out.println("Optimal train swapping takes " + conta + " swaps.");

            casos--;
        }

    }
}
