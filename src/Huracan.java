import java.util.*;
public class Huracan {

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

        @Override
        public int compareTo(Punto q) {
            if(this.x>q.x)return 1;
            if(this.x<q.x)return -1;

            if(this.y>q.y)return 1;
            if(this.y<q.y)return -1;
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Punto> listaPuntos= new  ArrayList<>();

        while(sc.hasNext()){
            int pX=sc.nextInt();
            int pY=sc.nextInt();
            Punto p = new Punto(pX,pY);

            listaPuntos.add(p);

        }
        Collections.sort(listaPuntos);
        for(int i=0; i<listaPuntos.size();i++){
            System.out.println(listaPuntos.get(i).x+" "+listaPuntos.get(i).y);
        }

    }
}
