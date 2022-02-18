
import java.util.*;

public class CheckTheCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer[]> peonB = new ArrayList<Integer[]>();
        ArrayList<Integer[]> peonW = new ArrayList<Integer[]>();
        ArrayList<Integer[]> torre = new ArrayList<Integer[]>();
        ArrayList<Integer[]> alfil = new ArrayList<Integer[]>();
        ArrayList<Integer[]> caballo = new ArrayList<Integer[]>();

        peonW.add(new Integer[]{-1, -1});
        peonW.add(new Integer[]{1, -1});
        peonB.add(new Integer[]{-1, 1});
        peonB.add(new Integer[]{1, 1});

        caballo.add(new Integer[]{2, 1});
        caballo.add(new Integer[]{2, -1});
        caballo.add(new Integer[]{-2, 1});
        caballo.add(new Integer[]{-2, -1});
        caballo.add(new Integer[]{1, 2});
        caballo.add(new Integer[]{1, -2});
        caballo.add(new Integer[]{-1, 2});
        caballo.add(new Integer[]{-1, -2});

        for (int i = 1; i <= 7; i++) {
            torre.add(new Integer[]{0, i});
        }
        for (int i = 1; i <= 7; i++) {
            torre.add(new Integer[]{0, -i});
        }
        for (int i = 1; i <= 7; i++) {
            torre.add(new Integer[]{i, 0});
        }
        for (int i = 1; i <= 7; i++) {
            torre.add(new Integer[]{-i, 0});
        }

        for (int i = 1; i <= 7; i++) {
            alfil.add(new Integer[]{i, i});
        }
        for (int i = 1; i <= 7; i++) {
            alfil.add(new Integer[]{-i, -i});
        }
        for (int i = 1; i <= 7; i++) {
            alfil.add(new Integer[]{i, -i});
        }
        for (int i = 1; i <= 7; i++) {
            alfil.add(new Integer[]{-i, i});
        }

        ArrayList<Integer[]> reina = new ArrayList<Integer[]>(torre);
        reina.addAll(alfil);

        int numeroJuegos = 1;
        while (true) {

            char[][] tablero = new char[8][8];
            boolean empty = true;
            for (int i = 0; i < 8; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < 8; j++) {
                    tablero[i][j] = line.charAt(j);
                    if (tablero[i][j] != '.') {
                        empty = false;
                    }
                }
            }

            if (empty) {
                break;
            }

            String side = "no";
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    char piezas = tablero[i][j];
                    if (piezas == '.' || piezas == 'K' || piezas == 'k') {
                        continue;
                    }

                    char objetivo;
                    String objetivoSide;
                    if (Character.isUpperCase(piezas)) {
                        objetivo = 'k';
                        objetivoSide = "black";
                    } else {
                        objetivo = 'K';
                        objetivoSide = "white";
                    }

                    ArrayList<Integer[]> movimientos = new ArrayList<Integer[]>();
                    if (piezas == 'P') {
                        movimientos = peonW;
                    }
                    if (piezas == 'p') {
                        movimientos = peonB;
                    }
                    if (piezas == 'N' || piezas == 'n') {
                        movimientos = caballo;
                    }
                    if (piezas == 'R' || piezas == 'r') {
                        movimientos = torre;
                    }
                    if (piezas == 'B' || piezas == 'b') {
                        movimientos = alfil;
                    }
                    if (piezas == 'Q' || piezas == 'q') {
                        movimientos = reina;
                    }

                    for (int move = 0; move < movimientos.size(); move++) {
                        try {
                            Integer[] coordenadas = movimientos.get(move);
                            int x = coordenadas[0];
                            int y = coordenadas[1];

                            char pieza = tablero[i + y][j + x];

                            if (pieza == objetivo) {
                                side = objetivoSide;
                                break;
                            }

                            if (pieza != '.' && pieza != objetivo) {

                                if (piezas == 'P' || piezas == 'p' || piezas == 'N' || piezas == 'n') {
                                    continue;
                                } else {

                                    move = ((move / 7) + 1) * 7 - 1;
                                }
                            }

                        } catch (Exception e) {

                            if (piezas == 'P' || piezas == 'p' || piezas == 'N' || piezas == 'n') {
                                continue;
                            } else {
                                move = ((move / 7) + 1) * 7 - 1;
                            }
                        }
                    }
                    if (side != "no") {
                        break;
                    }
                }

                if (side != "no") {
                    break;
                }
            }

            System.out.printf("Game #%d: %s king is in check.\n", numeroJuegos, side);
            numeroJuegos++;

            sc.nextLine();
        }
    }

}
