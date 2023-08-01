package Fundamentos.OperadoresYExpresiones;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /**
         * Los operadores lógicos se utilizan para combinar valores booleanos y nos devuelven un
         * 		 resultado evrdadero, falso o nulo
         * 		 
         * 		 && --> and (Y)
         * 		 || --> or (O)	(el caracter sale con alt+124
         * 		  ! --> not (No)
         */

        int a = 5;
        int b = 3;

        System.out.println("and: (a == b) && (a > b) resultado: " + ((a == b) && (a > b)));
        System.out.println("or con not: (!(a == b) && (a > b)) resultado: " + (!(a == b) && (a > b)));
        System.out.println("or: (a == b) || (a > b) resultado: " + ((a == b) || (a > b)));
    }
}
