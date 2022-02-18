/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Main {

    public static void main(String[] args) {
//        for (int i = 0,Ax=0; i < 3; Ax+=2,i++)   System.out.println(Ax);

        int A[] = {23, 34, 45, 56, 23, 79, 89, 93, 23, 109};

//        System.out.println(cif(1000));
//System.out.println(hallarPotencia(3, 3));
        //System.out.println(hallarResiduo(4, 2));
//            System.out.println(busquedaBinaria(A, 0, 10, 100));
//        System.out.println(calcularSumaPares(A,10));
//        System.out.println(hallarCantidadVeces(A,10,23));
//        System.out.println(calcularResiduo(20, 7));
        System.out.println(calcularR(20, 7));
//System.out.println(cacularCifrasRecursion(1255));
//System.out.println(calcularProducto(20,10000));

    }
    
    public static void billetes(int cant) {
		
			int billete100=cant/100000;
			cant-=(billete100*100000);
			int billete50=(cant/50000);
			cant-=(billete50*50000);
			int billete20=cant/20000;
			cant-=(billete20*20000);
			int billete10=cant/10000;
			cant-=(billete10*10000);
			int billete5=cant/5000;
			cant-=(billete5*5000);
			int billete2=cant/2000;
			cant-=(billete2*2000);
			int billete1=cant/1000;
			cant-=(billete1*1000);
}

    static int cacularCifrasRecursion(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + cacularCifrasRecursion(n / 10);

    }

    static int hallarPotencia(int x, int n) {

        int rta = 1;
        while (n > 0) {
            rta *= x;
            n--;
        }
        return rta;
    }

    static int hallarResiduo(int m, int n) {
        int rta;
        rta = m % n;
        return rta;

    }

    static int calcularResiduo(int m, int n) {
        while (m >= n) {
            m = m - n;
        }
        return m;
    }

    static int calcularR(int m, int n) {
        if (m < n) return m;
        
        return calcularR(m - n, n);
    }
    
   static int  calcularProducto(int a, int b){
if(a==0||b==0) return 0;
if(a==1) return b;
if(b==1) return a;
return   a+calcularProducto(a, b-1);

}
   
    int producto (int a,int b){
        if (b==1) {
            return a;
        }
        if (b>1) {
          return a + producto(a,b-1);
        }
    return 0;
    }


    static int cif(int n) {
        int cc;
        cc = 1;
        while (n >= 10) {
            cc = cc + 1;
            n = n / 10;
        }
        return cc;
    }

    static boolean busquedaBinaria(int A[], int ini, int fin, int x) {
        //n es igual a fin-ini+1
        int m;
        while (ini <= fin) {
            m = (ini + fin) / 2;
            if (A[m] == x) {
                return true;
            }

            //else
            if (x < A[m]) {
                fin = m - 1;
            } else {
                ini = m + 1;
            }

        }
        return false;

    }

    static int calcularSumaPares(int A[], int n) {
        int suma = 0;
        int i = 0;
        while (i < n) {
            if (i % 2 == 0) {
                suma += A[i];
            }
            i++;
        }
        return suma;
    }

    static int hallarCantidadVeces(int A[], int n, int x) {
        int contador = 0;
        int i = 0;
        while (i < n) {
            if (A[i] == x) {
                contador++;
            }
            i++;

        }
        return contador;
    }

}
