package datastructures.stack;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Pilha pilha = new Pilha();
        boolean rodando = true;
        while (rodando){
            System.out.println("""
                    1 : Adicionar item
                    2 : Remover item
                    3 : Olhar topo da pilha
                    4 : Ver pilha
                    5 : Fechar programa
                    """);
            int escolha = input.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Digite um item para adicionar na pilha: ");
                    String itemAdicionado = input.next();
                    pilha.push(itemAdicionado);
                    break;
                case 2:
                    if(pilha.pilhaVazia()){
                        System.out.println("Pilha vazia");
                    } else {
                        pilha.pop();
                    }
                    break;
                case 3:
                    if(pilha.pilhaVazia()){
                        System.out.println("Pilha vazia");
                    } else {
                        pilha.peek();
                    }
                    break;
                case 4:
                    pilha.IxibirPilha();
                    break;
                case 5:
                    System.out.println("Fechando o programa");
                    rodando = false;
                    break;
            }
        }


    }
}
