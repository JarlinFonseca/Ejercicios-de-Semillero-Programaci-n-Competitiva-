
import java.util.*;

public class Scrabble {

    //metodo para calcular el numero de veces que se repite un caracter en un String
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posicion siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }

//metodo para eliminar los caracteres repetidos de un String(Funciona bien si ordenas la palabra)
    public static String removeSpaces(String palabra) {
        String palabraSinRepetidas = "";
        for (int i = 0; i < palabra.length(); i++) {
            if (i == 0) {
                palabraSinRepetidas = "" + palabra.charAt(i);
            } else {
                if (palabra.charAt(i - 1) != palabra.charAt(i)) {
                    palabraSinRepetidas += palabra.charAt(i);
                }
            }
        }
        return palabraSinRepetidas;
    }

//metodo recursivo para hallar factorial de un numero
    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String frase = sc.next();
            char[] arre = frase.toCharArray();
            Arrays.sort(arre);
            String unir = "";
            for (int i = 0; i < arre.length; i++) {
                unir += arre[i];

            }
            String removida = removeSpaces(unir);
            char[] remo = removida.toCharArray();
            int num[] = new int[remo.length];
            for (int i = 0; i < remo.length; i++) {
                num[i] = contarCaracteres(frase, remo[i]);
            }
            int mulOp = 1;
            for (int z = 0; z < num.length; z++) {
                mulOp *= factorial(num[z]);
            }

            int operacionFinal = factorial(8) / mulOp;
            System.out.println(operacionFinal);

        }
    }

}
