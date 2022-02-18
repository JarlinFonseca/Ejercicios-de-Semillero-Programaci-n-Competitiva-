import java.util.*;
public class AtaqueZombie {
    static class Punto implements Comparable<Punto>{
        int x,y;
        Punto(){
            x=0;
            y=0;
        }

        Punto(int puntoX,int puntoY){
            x=puntoX;
            y=puntoY;
        }

        double distancia(Punto q){
            double dx =(this.x-q.x)*(this.x-q.x);
            double dy =(this.y-q.y)*(this.y-q.y);
            return Math.sqrt(dx+dy);
        }

        @Override
        public int compareTo(Punto q) {
            if(this.x>q.x)return 1;
            if(this.x<q.x)return -1;

            if(this.y>q.y)return 1;
            if(this.y<q.y)return -1;
            return 0;
        }
    }
    static Punto po;
    static class zombie implements Comparable<zombie>{
        Punto o;
        double distance;

        public zombie(Punto p){
            o=p;
            distance=o.distancia(po);
        }

        @Override
        public int compareTo(zombie otra) {
            if(distance>otra.distance)return 1;
            if(distance<otra.distance)return -1;
            return this.o.compareTo(otra.o);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numZombies=sc.nextInt();
        int puntoXInicial=sc.nextInt();
        int puntoYInicial=sc.nextInt();
        po= new Punto(puntoXInicial,puntoYInicial);
        ArrayList<zombie> zomb= new  ArrayList<>();

        while(numZombies-->0){
            puntoXInicial=sc.nextInt();
            puntoYInicial=sc.nextInt();
            Punto a=new Punto( puntoXInicial, puntoYInicial);
            zombie z= new zombie(a);
            zomb.add(z);
        }

        Collections.sort(zomb);
        for(int i=0; i<zomb.size();i++){
            System.out.println(zomb.get(i).o.x+" "+zomb.get(i).o.y);
        }

    }
}
