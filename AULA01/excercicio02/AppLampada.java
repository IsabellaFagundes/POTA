package excercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class AppLampada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //recebe o numero de lampadas
        int numeroLampadas;
        ArrayList<Lampada> corredor = new ArrayList<>(); //Corredor recebe um array comm o tamanho do numero de lampadas

        System.out.println("Quantas lampadas?");
        numeroLampadas = entrada.nextInt();

        for (int i = 0; i < numeroLampadas; i++) { //criar uma nova lampada
            corredor.add(new Lampada());
        }

        for (int caminhada = 1; caminhada <= numeroLampadas; caminhada++) {
            for (int lampada = 1; lampada <= numeroLampadas; lampada++) {
                if(lampada % caminhada == 0) {
                    // lampada - 1, pois a primeira lampada está na posição 0 do Array
                    corredor.get(lampada-1).acionar();
                }
            }
        }

        for (Lampada lampada : corredor) {
            System.out.print(lampada.getEstado() + " ");
        }

        entrada.close();
    }
}
