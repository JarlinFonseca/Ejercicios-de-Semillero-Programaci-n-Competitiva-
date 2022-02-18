import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class JINJIN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        while (casos > 0) {
            Queue<String> fila1 = new LinkedList<String>();
            Queue<String> fila2 = new LinkedList<String>();
            int cantidadNinos = sc.nextInt();
            int cantidadInstrucciones = sc.nextInt();
            String[] nombres = new String[cantidadNinos];
            int[] cant = new int[cantidadInstrucciones];

            for (int i = 0; i < nombres.length; i++) {
                nombres[i] = sc.next();
                fila1.add(nombres[i]);

            }
            for (int i = 0; i < cant.length; i++) {
                cant[i] = sc.nextInt();

            }
            for (int x = 0; x < cant.length; x++) {
                if (cant[x] == 1 && !fila1.isEmpty()) {
                    fila2.add(fila1.poll());
                } else if (cant[x] == 2 && !fila2.isEmpty()) {
                    fila1.add(fila2.poll());
                }
            }
            if (!fila1.isEmpty()) {

                while (!fila1.isEmpty()) {

                    String filaOne = fila1.poll();
                    if (fila1.size() != 0) {
                        System.out.print(filaOne + " ");
                    } else {
                        System.out.print(filaOne);
                    }

                }
                System.out.println();
            } else {
                System.out.println("-");
            }
            if (!fila2.isEmpty()) {

                while (!fila2.isEmpty()) {

                    String filaTwo = fila2.poll();
                    if (fila2.size() != 0) {
                        System.out.print(filaTwo + " ");
                    } else {
                        System.out.print(filaTwo);
                    }

                }
                System.out.println();
            } else {
                System.out.println("-");
            }
            casos--;
        }
    }
}

                    