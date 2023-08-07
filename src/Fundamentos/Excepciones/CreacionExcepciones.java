package Fundamentos.Excepciones;

import java.io.IOException;

public class CreacionExcepciones {
    public static void main(String[] args) {
        /**
         * Vamos a provocar una exepción aritmetica con una función que reciba 2 parametros y se dividan
         * y vamos a gestionar el error DENTRO de nuestra función...
         *
         * nosotros podemos para trabajar una excepción en particual en una linea o bloque de código
         * usamos el throw new tipoDeExcepcion();
         * La cual ya quedamos que puede ser artimetica de entrada o salida(IO)
         *
         * Ahora, nosotros tambien podemos indicar que una función/método es suceptible a arrojar una excepción
         * e indicamos esto con el throws de la siguiente manera:
         *      public static int dividir(int A, int B) throws IOException, ArithmeticException  { .... }
         *
         *  Al nosotros indicar que esta función puede dar un error, para invocarla tenemos que usar try y catch:
         *      try {
         *             dividir(50,0);
         *         } catch (Exception e){
         *             System.out.println("Esta es una excepción gestionada en main");
         *         }
         */
        divide(4,1);
        try {
            dividir(50,0);
        } catch (Exception e){
            System.out.println("Esta es una excepción gestionada en main");
        }
    }

    public static int divide(int A, int B){
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e){
            System.out.println("Esta división NO es posible");
        }
        return resultado;
    }

    public static int dividir(int A, int B) throws IOException {
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e){
            throw new IOException();
        }
        return resultado;
    }
}
