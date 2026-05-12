# Bucket Sort

Algoritmo de ordenação que distribui os elementos em "baldes" (intervalos), ordena cada balde individualmente e concatena tudo de volta em sequência.

## Como funciona

1. **Distribuição** — cada elemento é jogado em um balde com base no seu valor
2. **Ordenação** — cada balde é ordenado internamente
3. **Concatenação** — os baldes são unidos de volta no array original, em ordem

## Implementação

```java
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static void main(String[] args) {
        int quantidadesDeBaldes = 4;
        ArrayList<Integer>[] baldes = new ArrayList[quantidadesDeBaldes];
        int[] lista = {12, 32, 45, 2, 4, 87, 69};

        // 1. Inicializa os baldes
        for (int i = 0; i < quantidadesDeBaldes; i++) {
            baldes[i] = new ArrayList<>();
        }

        // 2. Distribui os elementos nos baldes
        for (int i = 0; i < lista.length; i++) {
            int indiceBalde = lista[i] / 25;
            baldes[indiceBalde].add(lista[i]);
        }

        // 3. Ordena cada balde
        for (int i = 0; i < quantidadesDeBaldes; i++) {
            Collections.sort(baldes[i]);
        }

        // 4. Concatena os baldes de volta no array
        int posicao = 0;
        for (int i = 0; i < quantidadesDeBaldes; i++) {
            for (int j = 0; j < baldes[i].size(); j++) {
                lista[posicao] = baldes[i].get(j);
                posicao++;
            }
        }
    }
}
```

## Exemplo passo a passo

Array inicial: `{12, 32, 45, 2, 4, 87, 69}`

| Balde | Intervalo | Elementos |
|-------|-----------|-----------|
| 0     | 0 – 24    | 12, 2, 4  |
| 1     | 25 – 49   | 32, 45    |
| 2     | 50 – 74   | 69        |
| 3     | 75 – 99   | 87        |

Após ordenar cada balde e concatenar: `[2, 4, 12, 32, 45, 69, 87]` ✅

## Complexidade

| Caso       | Complexidade |
|------------|--------------|
| Médio      | O(n + k)     |
| Pior caso  | O(n²)        |

Onde `n` é o número de elementos e `k` é o número de baldes.

O pior caso ocorre quando todos os elementos caem no mesmo balde, forçando a ordenação interna a ser O(n²).

## Quando usar

- Dados numéricos distribuídos em um intervalo conhecido
- Quando a distribuição dos dados é relativamente uniforme
- Não é indicado para listas grandes com valores muito concentrados