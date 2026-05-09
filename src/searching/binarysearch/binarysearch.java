package searching.binarysearch;

public class binarysearch {
    public static void main(String[] args){

        int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int numeroEscolhido = 13;
        int inicio = 0;
        int fim = vetor.length -1;
        int tentativas = 0;

        while (inicio <= fim){

            tentativas++;

            int meio = (inicio + fim)/2;

            System.out.println("Meio atual: " + vetor[meio]);

            if (vetor[meio] == numeroEscolhido){

                System.out.println("Número encontrado!");
                System.out.println("Posição: " + meio);
                System.out.println("Tentativas: " + tentativas);

                break;

            } else if(vetor[meio] < numeroEscolhido){

                inicio = meio + 1;

            } else {

                fim = meio - 1;
            }
        }
    }
}
