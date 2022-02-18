
import java.util.*;

public class MainFunz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String frase = sc.next();
            char[] carac = frase.toCharArray();
            TreeSet<Character> tree = new TreeSet<>();
            for (int i = 0; i < carac.length; i++) {
                tree.add(carac[i]);
            }
            char[] c = new char[tree.size()];
            int j = 0;
            for (Character i : tree) {
                c[j] = i;
                j++;
            }
            String[] x = new String[c.length];
            for (int i = 0; i < c.length; i++) {
                x[i] = Character.toString(c[i]) + Character.toString(c[i]) + Character.toString(c[i]);
            }

            boolean vef = false;
            for (int i = 0; i < x.length; i++) {

            }
            String s = "bbb" + "#" + frase;
            int arre[] = z_function(s);

            for (int t = 0; t < arre.length; t++) {
                if (arre[t] == 3) {
                    vef = true;
                }
            }
            if (vef) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }

    static int[] z_function(String ss) {
        StringBuilder s = new StringBuilder(ss);
        int n = s.length();
        int[] z = new int[n];
        for (int i = 1, x = 0, y = 0; i < n; i++) {
            z[i] = Math.max(0, Math.min(z[i - x], y - i + 1));
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                x = i;
                y = i + z[i];
                z[i]++;
            }

        }
        return z;
    }
}
