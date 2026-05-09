package sorting_algorithms.selectionsort;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
    int[] lista = {59, 32, 45, 7, 12};

    for( int i = 0; i < lista.length; i ++){
        int menorIndice = i;
        for(int j = i + 1; j < lista.length; j++){
            if(lista[j] < lista[menorIndice]){
                menorIndice = j;
            }
        }
        int temp = lista[i];           // guarda o valor de i
        lista[i] = lista[menorIndice]; // coloca o menor em i
        lista[menorIndice] = temp;     // coloca o valor antigo de i onde era o menor
        System.out.println(Arrays.toString(lista));
    }
}
}
