package datastructures.stack;
import java.util.ArrayList;
import java.util.List;

public class Pilha {
    List<String> lista = new ArrayList<>();

    public void push(String itemAdicionado){
        lista.add(itemAdicionado);
    }
    public void pop(){
        lista.removeLast();
    }
    public void peek(){
        System.out.println(lista.getLast());
    }

    public boolean pilhaVazia(){
        return lista.isEmpty();
    }

    public void IxibirPilha(){
        System.out.println(lista);
    }
}
