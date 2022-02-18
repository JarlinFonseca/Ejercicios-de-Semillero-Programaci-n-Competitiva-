
import java.util.*;

public class FreeFire {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- > 0) {
            ArrayList<Punto> puestos = new ArrayList<>();
            int cantSillas = sc.nextInt();
            int cantPosRouter = sc.nextInt();
            int radio = sc.nextInt();
            while (cantSillas-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                Punto silla = new Punto(x, y);
                puestos.add(silla);
            }
            Router[] routers = new Router[cantPosRouter];
            for (int i = 0; i < cantPosRouter; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                Router r = new Router(x, y, radio);
                routers[i] = r;
            }
            Router rta = routers[0];

            for (int i = 1; i < cantPosRouter; i++) {
                if (rta.obtenerCantidadJugadores(puestos) < routers[i].obtenerCantidadJugadores(puestos)) {
                    rta = routers[i];
                }
            }
            System.out.println(rta.p.toString() + " " + rta.obtenerCantidadJugadores(puestos));
        }

    }

    static class Punto {

        private int x;
        private int y;

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double euclidianDistance(Punto o) {
            double dx = (x - o.x) * (x - o.x);
            double dy = (y - o.y) * (y - o.y);
            return Math.sqrt(dx + dy);
        }

        public String toString() {
            String str = this.x + " " + this.y;
            return str;
        }
    }

    static class Router {

        Punto p;
        int radio;

        public Router(int x, int y, int radio) {
            p = new Punto(x, y);
            this.radio = radio;
        }

        public int obtenerCantidadJugadores(ArrayList<Punto> sillas) {
            int cantidad = 0;
            for (int i = 0; i < sillas.size(); i++) {
                if (p.euclidianDistance(sillas.get(i)) <= radio) {
                    cantidad++;
                }
            }
            return cantidad;
        }
    }
}
