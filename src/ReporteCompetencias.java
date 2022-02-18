import java.util.*;
public class ReporteCompetencias{
    
    static class Semillero implements Comparable <Semillero>{
        String nombre;
        int puntos;
        public Semillero(String nombre, int puntos){
            this.nombre=nombre.substring(0,nombre.length());
            this.puntos=puntos;
        }

        @Override
        public int compareTo(Semillero otro) {
            if(this.puntos>otro.puntos){
                return -1;
            }else if(this.puntos<otro.puntos){
                return 1;
            }else{
                return this.nombre.compareTo(otro.nombre);
            }
        }

        public String toString(){
            String rta = this.nombre+" "+puntos;
            return rta;
        }
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

            int casos=sc.nextInt();
            ArrayList <Semillero> grupos= new ArrayList<>();

            while(casos>0){
                String nom=sc.next();
                String[] parts = nom.split("->");
                String part1 = parts[0]; 
                String part2 = parts[1];

                String[] competencias = part2.split(";");
                ArrayList<Integer> pal = new ArrayList<>();
                for(int i = 0; i < competencias.length; i++){ 
                    pal.add(Integer.parseInt(competencias[i]));
                }
                int suma=0;
                for(int i = 0; i < pal.size(); i++){ 
                    suma+=pal.get(i);
                }
                Semillero z= new Semillero(part1,suma);
                grupos.add(z);           
                casos--;
            }
            Collections.sort(grupos);
            for (int i = 0; i <grupos.size() ; i++) {
                System.out.println(grupos.get(i));
            }

        }
    }
}