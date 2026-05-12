package sorting_algorithms.bucketsort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {
        int quantidadesDeBaldes = 4;
        ArrayList<Integer>[] baldes = new ArrayList[4];
        int[] lista = {12, 32, 45, 2, 4, 87, 69};

        for (int i = 0; i < quantidadesDeBaldes; i++) {
            baldes[i] = new ArrayList<>();
        }
        for ( int i = 0;i <  lista.length; i++){
            int indiceBalde = lista[i] / 25;
            baldes[indiceBalde].add(lista[i]);
        }
        for ( int i = 0; i < quantidadesDeBaldes; i++){
            Collections.sort(baldes[i]);
        }
        int posicao = 0;

        for (int i = 0; i < quantidadesDeBaldes ; i++){

            for (int j = 0; j < baldes[i].size(); j++){
                lista[posicao] = baldes[i].get(j);
                posicao++;
                System.out.println(Arrays.toString(lista));
            }
        }
    }
}
