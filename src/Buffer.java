
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.PrintWriter;

public class Buffer {

    
    static int sumaRecursiva(int numero){
        if(numero==1)return 1;
        else return numero+ sumaRecursiva(numero-1);
       
    }
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner();
        PrintWriter pr = new PrintWriter(System.out);

        while (sc.hasNext()) {
            long persona1 = Long.parseLong(sc.next());
            long tio = Long.parseLong(sc.next());
            long problemPersona1 = Long.parseLong(sc.next());
            int diasAlcanzar = 0;
            int aux = 1;
            while (tio <= problemPersona1) {
                tio += aux;
                problemPersona1 += persona1;
                diasAlcanzar++;
                aux++;

            }
            pr.println(diasAlcanzar);
            pr.flush();
        }
        pr.close();
    }

    static class Scanner {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        int spaces = 0;

        public String nextLine() throws IOException {
            if (spaces-- > 0) {
                return "";
            } else if (st.hasMoreTokens()) {
                return new StringBuilder(st.nextToken("\n")).toString();
            }
            return br.readLine();
        }

        public String next() throws IOException {
            spaces = 0;
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public boolean hasNext() throws IOException {
            while (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) {
                    return false;
                }
                if (line.equals("")) {
                    spaces = Math.max(spaces, 0) + 1;
                }
                st = new StringTokenizer(line);
            }
            return true;
        }
    }
}
