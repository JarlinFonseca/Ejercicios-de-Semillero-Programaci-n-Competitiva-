
import java.util.Scanner;

public class PartidoAmistoso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos > 0) {
            int francia = sc.nextInt();
            int Colombia = sc.nextInt();
            if (Colombia > francia) {
                System.out.println("ganamos");
            } else if (francia > Colombia) {
                System.out.println("perdimos");
            } else {
                System.out.println("casi ganamos");
            }
            casos--;
        }

    }

}
