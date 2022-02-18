
import java.util.*;

public class Palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        while (casos-- > 0) {

            String cadena = sc.nextLine();

            cadena = cadena.replaceAll("[^\\dA-Za-z]", "").toLowerCase();

            if (esPalindromo(cadena)) {
                System.out.println("Palindromo");
            } else {
                System.out.println("No Palindromo");
            }

        }
    }

    public static boolean esPalindromo(String cadena) {
        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida.equals(cadena);
    }
}
