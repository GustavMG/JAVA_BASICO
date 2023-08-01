package Fundamentos.OperadoresYExpresiones;

public class OperadoresComparacion {
    public static void main(String[] args) {
        /**
         * Operadores relacionales
         *
         * 		 == compara si un operando es igual a otro
         * 		 !0 diferente a
         * 		 < mayor que
         * 		 > menor que
         * 		 <= mayor o igual que
         * 		 >= menor o igual que
         */

        int a = 5;
        int b = 10;

        System.out.println("Datos a:" + a + " y b:" + b);
        boolean resultadoIgual = a == b; // resultado será false
        System.out.println("a == b: " + resultadoIgual);

        boolean resultadoDiferente = a != b; // resultado será true
        System.out.println("a != b: " + resultadoDiferente);

        boolean resultadoMayor = a > b; // resultado será false
        System.out.println("a > b: " + resultadoMayor);

        boolean resultadoMenor = a < b; // resultado será true
        System.out.println("a < b: " + resultadoMenor);

        boolean resultadoMayorOIgual = a >= b; // resultado será false
        System.out.println("a >= b: " + resultadoMayorOIgual);

        boolean resultadoMenorOigual = a <= b; // resultado será true
        System.out.println("a <= b: " + resultadoMenorOigual);

    }
}
