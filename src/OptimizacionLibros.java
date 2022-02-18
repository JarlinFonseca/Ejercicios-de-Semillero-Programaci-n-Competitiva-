/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class OptimizacionLibros {

    static int cantidadLibros;
    static int cantidadDinero;
    static int memo[][];
    static int valoresLibros[] = new int[1000];
    static int costosLibros[] = new int[1000];
    static int inf = 1000000000;

    static int f(int idx, int w) {

        if (w < 0) {
            return -inf;
        }
        if (idx >= cantidadLibros) {
            return 0;
        }
        if (memo[idx][w] != -1) {
            return memo[idx][w];
        }
        int ans = Math.max(f(idx + 1, w), f(idx + 1, w - valoresLibros[idx]) + costosLibros[idx]);
        memo[idx][w] = ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        while (casos > 0) {
             memo();
            
            cantidadDinero = sc.nextInt();
            int numeroLibrerias = sc.nextInt();

            int ind1 = 0;
            int ind2 = 0;
            while (numeroLibrerias-- > 0) {
               
            

                int libros = sc.nextInt();
                int libros2 = libros;
                 
                while (libros-- > 0) {
                     valoresLibros[ind1] = sc.nextInt();
                 
                    ind1++;

                }
                while (libros2-- > 0) {

                      costosLibros[ind2] = sc.nextInt();
                    ind2++;
                }

            }
            
            cantidadLibros = ind1;
            

            System.out.println(f(0, cantidadDinero));
            casos--;
        }
        }
    
    static void memo() {
        memo = new int[1000+5][1000+5];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                memo[i][j] = -1;
            }
        }
    }

    }

    

