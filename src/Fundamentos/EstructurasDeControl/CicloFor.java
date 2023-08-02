package Fundamentos.EstructurasDeControl;

public class CicloFor {
    public static void main(String[] args) {
        /**
         * El ciclo for requiere la siguientes sintaxis:
         * for (inicialización; condición; expresión de incremento) {   }
         *
         * Evalua mientras se cumpla la coondición
         */
        for (int i = 0; i < 15; i++){
            System.out.println("Esta es la posición del ciclo: " + i);
        }

        /**
         * Un uso muy comun es iterar en arreglos, como en el siguiente que se itera
         * con los nombres siguientes:
         *
         * @Nota: Una iteración en el contexto de programación se refiere a cada repetición de un
         * bucle o ciclo que se ejecuta dentro de un programa. En otras palabras, una iteración es
         * una vuelta o pasada de un bucle, durante la cual se repite un bloque de código
         * un número determinado de veces.
         */
        String [] nombres = {"Gustavo", "Maldonado", "Gonzalez"};
        for (int i = 0; i < nombres.length; i++){
            System.out.println("Elementos del array son: " + nombres[i]);
        }

        //Vamos a sumar los numeros del array siguiente con un ciclo for
        int [] numeros = {5, 8 ,9, 10, 6, 1};
        int sumaArray = 0;
        System.out.println("El valor de sumaArray ANTES del ciclo for es: " + sumaArray);
        for (int i = 0; i < numeros.length; i++){
            sumaArray = sumaArray + numeros[i];
        }
        System.out.println("El valor de sumaArray DESPUES del ciclo for es: " + sumaArray);
    }
}
