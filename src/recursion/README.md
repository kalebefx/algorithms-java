# Recursion

Implementação de algoritmos utilizando **recursão** em Java.

## Sobre

Recursão é uma técnica de programação onde um método chama a si mesmo para resolver um problema menor até atingir uma condição de parada.

Ela é muito utilizada em algoritmos que envolvem:

- Divisão de problemas
- Estruturas em árvore
- Algoritmos de ordenação
- Busca
- Matemática computacional

## Como funciona

Todo algoritmo recursivo possui dois elementos fundamentais:

### 1. Caso base
É a condição que interrompe a recursão, evitando chamadas infinitas.

Exemplo:

```java
if(n == 1) return 1;
```

### 2. Chamada recursiva
É quando o método chama a si mesmo com um problema menor.

Exemplo:

```java
return n + somar(n - 1);
```

## Exemplo implementado

Soma recursiva dos números até `n`.

Entrada:

```java
somar(5)
```

Processo:

```txt
5 + 4 + 3 + 2 + 1
```

Saída:

```txt
15
```