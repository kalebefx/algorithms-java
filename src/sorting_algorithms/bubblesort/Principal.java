package sorting_algorithms.bubblesort;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args){
        int[] lista = {12,32,45,2,4,87,69};

        for (int i = 0; i < lista.length; i++){
            for (int j = 0; j < lista.length - 1; j++){

                if( lista[j] > lista[j+1]){
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                    System.out.println(Arrays.toString(lista));
                }
            }
        }
    }
}
