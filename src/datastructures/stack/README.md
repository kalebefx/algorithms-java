# Pilha (Stack)

Estrutura de dados linear que segue o princípio **LIFO** (Last In, First Out) — o último elemento inserido é o primeiro a ser removido.

## Casos de uso reais

- Histórico de navegação (botão voltar do browser)
- Ctrl+Z em editores de texto
- Chamadas recursivas na memória da JVM
- Avaliação de expressões matemáticas

## Implementação

### Pilha.java

```java
import java.util.ArrayList;
import java.util.List;

public class Pilha {
    List<String> lista = new ArrayList<>();

    // Adiciona elemento no topo
    public void push(String itemAdicionado) {
        lista.add(itemAdicionado);
    }

    // Remove elemento do topo
    public void pop() {
        lista.removeLast();
    }

    // Espia o topo sem remover
    public void peek() {
        System.out.println(lista.getLast());
    }

    // Verifica se a pilha está vazia
    public boolean pilhaVazia() {
        return lista.isEmpty();
    }

    // Exibe todos os elementos
    public void exibirPilha() {
        System.out.println(lista);
    }
}
```

### Principal.java

```java
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pilha pilha = new Pilha();
        boolean rodando = true;

        while (rodando) {
            System.out.println("""
                    1 : Adicionar item
                    2 : Remover item
                    3 : Olhar topo da pilha
                    4 : Ver pilha
                    5 : Fechar programa
                    """);

            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite um item para adicionar na pilha: ");
                    String itemAdicionado = input.next();
                    pilha.push(itemAdicionado);
                    break;
                case 2:
                    if (pilha.pilhaVazia()) {
                        System.out.println("Pilha vazia!");
                    } else {
                        pilha.pop();
                    }
                    break;
                case 3:
                    if (pilha.pilhaVazia()) {
                        System.out.println("Pilha vazia!");
                    } else {
                        pilha.peek();
                    }
                    break;
                case 4:
                    pilha.exibirPilha();
                    break;
                case 5:
                    System.out.println("Fechando o programa");
                    rodando = false;
                    break;
            }
        }
    }
}
```

## Métodos

| Método | Descrição | Retorno |
|--------|-----------|---------|
| `push(item)` | Adiciona elemento no topo | void |
| `pop()` | Remove elemento do topo | void |
| `peek()` | Exibe o elemento do topo sem remover | void |
| `pilhaVazia()` | Verifica se a pilha está vazia | boolean |
| `exibirPilha()` | Exibe todos os elementos | void |

## Exemplo de uso

```
Pilha inicial: []

push("A") → [A]
push("B") → [A, B]
push("C") → [A, B, C]

peek()    → C  (topo, sem remover)
pop()     → [A, B]
pop()     → [A]
```

## Complexidade

| Operação | Complexidade |
|----------|--------------|
| push     | O(1)         |
| pop      | O(1)         |
| peek     | O(1)         |

Todas as operações são O(1) pois acessam apenas o topo da pilha.