package ConceptosAvanzados.Recursion;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        //
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Factorial recursivo: " + factorialRecursivo(5));
        System.out.println("Factorial funcional: " + factorialFuncional(5));
    }
    public static int factorial(int num){
        int resultado = 1;
        for(int i = 1; i <= num; i++){
            resultado = resultado * i;
        }
        return resultado;
    }

    public static int factorialRecursivo(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial(num -1);
    }

    public static int factorialFuncional(int num){
        return IntStream.rangeClosed(1, num)
                .reduce(1, (a, b) -> a * b);
    }
}
