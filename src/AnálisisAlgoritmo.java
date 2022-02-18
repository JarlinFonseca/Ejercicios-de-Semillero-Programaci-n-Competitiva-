
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
public class AnálisisAlgoritmo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int casos = sc.nextInt();

            int[] nums = new int[casos];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            int iNumeroMayor, iPosicion;
            iNumeroMayor = nums[0];
            iPosicion = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > iNumeroMayor) {
                    iNumeroMayor = nums[i];
                    iPosicion = i;
                }
            }

            int suma = 0;
            for (int i = 0; i < nums.length; i++) {
                suma += nums[i];
            }

            if(iNumeroMayor==1){
             System.out.println("O(n)");
         
            } else if(suma==0){
                System.out.println("O(1)");
            }else {
                System.out.println("O(n^" + iNumeroMayor + ")");
            }
        }

    }
}
