package Fundamentos.EstructurasDeControl;

public class CicloForEach {
    public static void main(String[] args) {
        /**
         * El ciclo For Each es una forma simplificada de iterar sobre elementos de un array o una colección
         * Este bucle se utiliza cuando se desea recorrer todos los elementos de un arreglo o una colección
         * sin la necesidad de utilizar un índice explícito como la sintaxis comun array[i].
         *
         * Utiliza la siguiente sintaxis:
         * for (tipoDeElemento elemento : arreglo o colección) {
         *     // Código a ejecutar para cada elemento del arreglo o colección
         * }
         */

        String[] nombres = {"Gustavo", "Juanito", "Fulanito"};

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        int [] numeros = {5, 8 ,9, 10, 6, 1};
        int sumaArray = 0;
        for(int numero : numeros){
            sumaArray += numero;
        }
        System.out.println("La sumatoria total es: " + sumaArray);
    }
}
