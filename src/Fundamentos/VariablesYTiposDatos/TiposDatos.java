package Fundamentos.VariablesYTiposDatos;

public class TiposDatos {
    public static void main(String[] args) {
        /**
         * Los datos que Java maneja son Primitivos y de Objeto
         * Entre los primitivos podemos ver:
         * - Números enteros (byte,short, int, long).
         * - Números reales (float, double).
         * - Carácter (char).
         * - Booleano o lógico (boolean).
         *
         * Nota: El bit es la Unidad MINIMA de información que manejan las computadoras, son valores de 0 y de 1 UNICAMENTE
         * Nota2: un dato de tipo carácter se puede escribir entre comillas simples, por ejemplo 'a', o también indicando su valor Unicode, por ejemplo '\u0061'
         */

        //Datos primitivos
        //1. Numericos enteros
        byte datoByte = 100;// Tamaño: 8bits ValMin: -128 ValMax: 127

        short datoShort = 16000; // Tamaño: 16bits ValMin: -32768 ValMax: 32767

        int datoInt = 1000000; // Tamaño: 64bits ValMin: -9223372036854775808 ValMax: 9223372036854775807

        //1.1 Numericos decimales
        double datoDouble = 1600000d; // Tamaño: 64bits ValMin: -1.79769313486232e308 ValMax: 1.79769313486232e308
        float datoFloat = 16000f; // Tamaño: 32bits ValMin: -3.402823e38 ValMax: 3.402823e38

        //2. Booleanos
        boolean datoBooleano; //Tamaño: 1bit ValMin: 0 ValMax: 1
        datoBooleano = true; //Esto es un 1
        datoBooleano = false;//Esto es un 0

        //3. Texto
        char datoChar = 'G'; // Tamaño: 16bits ValMin: '\u0000' ValMax: '\uffff'

    }
}
