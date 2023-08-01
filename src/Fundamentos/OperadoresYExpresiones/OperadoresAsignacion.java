package Fundamentos.OperadoresYExpresiones;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int x = 10; // Se asigna el valor 10 a la variable x

        int a = 5;
        a += 3; // Equivale --> a = a + 3, resultado: a = 8

        int b = 10;
        b -= 4; // Equivale --> b = b - 4, resultado: b = 6

        int c = 3;
        c *= 2; // Equivale --> c = c * 2, resultado: c = 6

        int d = 15;
        d /= 3; // Equivale --> d = d / 3, resultado: d = 5

        int e = 12;
        e %= 5; // Equivale --> e = e % 5, resultado: e = 2

        //Operadores de incremento y decremento
        int aumentoEntero = 10;
        System.out.println(aumentoEntero);
        aumentoEntero++;
        aumentoEntero++;
        System.out.println(aumentoEntero);
        aumentoEntero--;
        System.out.println(aumentoEntero);

    }
}
