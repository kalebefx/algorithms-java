package recursion;

public class Principal {

    public static int somar(int n){
        if(n == 1) return 1;          // caso-base
        return n + somar(n - 1);      // chamada recursiva
    }

    public static void main(String[] args){
        System.out.println(somar(5)); // 15
    }
}