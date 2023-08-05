package Fundamentos.EstructurasDatosBasicas;

public class EstructArray {
    public static void main(String[] args) {
        /**
         * Declaramos nuestro array de manera similar a como declaramos variables
         * debemos especificar el tipo de dato como puede ser int, char, String, Long, double, etc
         * los simbolos [ ] nos indican que es un array
         * le ponemos un nombre a nuestro array
         * y por ultimo le hacemos una asignación, esta asignación puede ser de 2 formas
         * la primera es declarar un array vacío y especificamos la LONGITUD o la cantidad de elementos
         * que tendrá este array de la misma manera que realizamos una isntancia, por ejemplo:
         *      new mismoTipoDeDato [ ] y entre los corchetes ponemos la longitud, esto lo hacemos cuando
         *  vamos a tener un array dinámico donde NO SABEMOS cuales datos va a tener, esto no suele usarse
         *  casi siempre se llenan con párametro pre establecidos pero si podriamos recibir ciertos datos
         *
         *  Ejemplo de la declaración de enteros:
         *  int[] arrayEnteros = new int[10]
         *  Aqui estamos declarando un array que tendrá 10 elementos los cuales desconocemos
         *
         *  Ahora, si nosotros conocemos los elemntos podemos declararlos directamente y no necesitamos establecer
         *  la longitud del array pq se define automaticamente con los datos que tiene
         *  Algo MUY IMPORTANTE es que una vez declarado e inicializado un array NO PODEMOS MODIFICAR LA CANTIDAD
         *  DE ELEMENTOS, lo que podemos hacer es modificar el elemento del arreglo accediendo mediante su indice
         *  y modificando con EL MISMO TIPO DE DATO que se declaró el array.
         *  Si quisieramos aumentar los elementos del array tendriamos que realizar copias del mismo y otras cosillas
         *
         */
        int[] arrayUno = new int[5];

        /**
         * Podemos saber la longitud de este array y trabajar con este dato de forma parecida a las cadenas String
         * de igual manera se tiene la palabra 'length', aqui la diferencia es que en un String length es un método,
         * por lo que se requiere invocar como cualquier metodo() siendo .length();
         * en cambio en los array's length es UNA PROPIEDAD, no se invoca si no que se accede .length
         */

        String[] nombres ={
                "Gustavo",
                "Juanito",
                "Pedrito"
        };

        System.out.println("La longitud del array usando su propiedad '.length' es: " + nombres.length);

        /**
         * Algo con lo que trabajaremos mucho es con recorrer o iterar sobre los arreglos
         * hay mas de 1 manera de hacer esto y su uso dependerá de que necesitemos hacer jeje
         *
         * La primera es con un ciclo for como vimos anteriormente:
         * for (inicialización; condición; expresión de incremento) {
         *     // Código a repetir mientras la condición sea verdadera
         * }
         * Aqui podemos conocer el indice que estamos trabajando ya que lo declaramos e inicializamos
         * este indice nos puede servir para hacer muchas cosas como los ejemplos que hicimos para
         * invertir las cadenas de texto.
         *
         * La segunda forma es iterar con un for pero con la forma corta o for each:
         * for (tipoDeElemento elemento : arreglo o colección) {
         *     // Código a ejecutar para cada elemento del arreglo o colección
         * }
         *  Esta segunda forma es interesante y nos da la ventaja de que nos ahorramos código
         *  PERO aqui no manejamos indices, solo iteramos y cada elemento del arreglo se asigna a una
         *  variable temporal.
         */
        System.out.println("Impresión con ciclo for");
        for (int i = 0; i < nombres.length; i++){
            System.out.println("Nombre en la posición " + i + " es: " + nombres[i]);
        }
        System.out.println("");

        System.out.println("Impresión con ciclo for each");
        for (String nombre : nombres){
            System.out.println("Nombre sin saber la posición es: " + nombre);
        }

        /**
         * Hasta ahora hemos trabajado con array de tipo vector
         * Ahora trabajemos con los arrays de mas de 1 dimension
         *
         * La declaración es parecida, colocamos la cantidad de corchetes [] dependiendo de las dimensiones
         * por ejemplo un array bidimensional seria de la siguiente manera
         *  int[][] arrayBidimensional = new int[2][4]
         * En donde el primer corchete indica las filas y el segundo las columnas
         * para esto podemos ver una hoja de excel para visualizar filas y columnas
         * creo que lo común es trabajar con arrays de 1 y 2 dimensiones, creo que para trabajar con más
         * podria ser con operaciones matematicas de matrices o para trabajar con una matriz
         * de colores para un modelo 3D de una imagen.
         * Cada color podría representarse con tres componentes: rojo, verde y azul (RGB).
         * Bueno, siguiendo con array bidimensional seria:
         * arrayBidimensional [filas] [columnas]
         */
        System.out.println("Aqui inicia los Arrays Bidimensionales");
        System.out.println("Array no inicializado");
        // 2 filas X 4 columnas
        int arrayBidi [][] = new int[2][4];
        arrayBidi [0][0] = 1;
        arrayBidi [0][1] = 2;
        arrayBidi [0][2] = 3;
        arrayBidi [0][3] = 4;

        arrayBidi [1][0] = 10;
        arrayBidi [1][1] = 20;
        arrayBidi [1][2] = 30;
        arrayBidi [1][3] = 40;

        System.out.println("Recorremos el array bidimensional");
        for (int i = 0; i < arrayBidi.length; i++){
//            System.out.println("Valor de i: " + i);
            for(int j = 0; j < arrayBidi[i].length; j++){
//                System.out.println("Valor de j: " + j);
                System.out.println("Dato del array en la posición: " + "[" + i + "]"+ "[" + j +"]" + " es " + arrayBidi[i][j]);
            }
        }

        System.out.println("Array inicializado");
        // 2 filas X 4 columnas
        int arraBidiConDatos [][] = {
                {10, 20, 30, 40},
                {100, 200, 300, 400}
        };
        for (int i = 0; i < arraBidiConDatos.length; i++){
            for(int j = 0; j < arraBidiConDatos[i].length; j++){
                System.out.println("Dato del array en la posición: " + "[" + i + "]"+ "[" + j +"]" + " es " + arraBidiConDatos[i][j]);
            }
        }
    }
}
