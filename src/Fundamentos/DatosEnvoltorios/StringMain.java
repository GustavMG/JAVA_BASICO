package Fundamentos.DatosEnvoltorios;

public class StringMain {
    public static void main(String[] args) {
        /**
         * La ventaja que nos da usar clases envolventes de los tipos primitivos es que ya cuentan con métodos
         * que podemos invocar sin preocuparnos por desarrollar este código, algunos ejemplos son:
         *          lengt()
         *         startsWhith(" ")
         *         ensdWith(" ")
         *         indexOf(" ")
         *         subString(1,5)
         *         trim()
         *         equals()
         *         compareTo
         */
        //Podemos declarar una cadena de texto con el tipo String, nombre que querramos y la asignación =
        String cadena = "Mensaje DE TEXTo";

        //Podemos saber la longitud de una cadena ya que existe un método llamado length();
        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es: " + cadenaLen);

        //Podemos convertir nuestras cadenas en mayusculas o minisculas
        String cadenaMayusc = cadena.toUpperCase();
        String cadenaMinusc = cadena.toLowerCase();
        System.out.println("La cadena --> " + cadena + " <-- ahora es: " + cadenaMayusc);
        System.out.println("La cadena --> " + cadena + " <-- ahora es: " + cadenaMinusc);

        /**
         * Vamos a determinar si una cadena de texto INICIA o NO CON una palabra especifica
         * nuestro resultado sera un SI o un NO, es decir true o false
         * para esto usaremos el método startsWith();
         */
        boolean cadenaStartsWith = cadena.startsWith("Men");
        if(cadenaStartsWith){
            System.out.println("Empieza con lo que estoy buscando");
        } else {
            System.out.println("No empieza con lo que quiero");
        }

        /**
         * Asi como podemos evaluar que una cadena empiece con lo que estoy buscando
         * tambien podemos identificar si la cadena termina con lo que estoy buscando
         * para esto utilizamos el método endsWith();
         */
        boolean cadenaEndsWith = cadena.endsWith("To");
        if(cadenaEndsWith){
            System.out.println("Termina con lo que estoy buscando");
        } else {
            System.out.println("No termina con lo que quiero");
        }

        /**
         * Trabajaremos mucho con la iteración de String's
         * para esto usamos un metodo llamado charAt(i) el cual nos va a permitir saber el caracter
         * de la cadena en la posición que designemos como parámetro de entrada del método
         * esto nos devuelve un dato primitivo tipo char por lo que debemos crear una variable de
         * este tipo para almacenarlo.
         */
        char letra = cadena.charAt(0);
        System.out.println("Carcater es: " + letra);

        //Usaremos un ciclo for para iterar el texto
        for (int i = 0; i < cadenaLen; i++){
            char letraEnFor = cadena.charAt(i);
            System.out.println(letraEnFor + " ");
        }

        /**
         * Un ejercicio muy habitual de realizar es la inversión de cadenas de texto
         * intentemos varias manera de hacer la inversión de: "Hola GustavMG" con un ciclo for y un caracter
         */
        String cadenaAInvertir = "Hola GustavMG";
        String cadenaInvertida = "";
        /**
         * Creamos un arreglo de caracteres para poder almacenar cada caracter de la cadena
         * para no escribir manualmnete la longitud de este arreglo usaremos el método length del string
         * para hacer una dependencia de que el tamaño del arreglo sea la longitud de la cadena
         * sin importar cuantos caracteres tenga
         * Lo que haremos ademas de imprimir la cadena de texto al reves es almacenar este texto al reves
         * por lo que declaramos un contador que ire sumando por cada iteración.
         */
        char[] arrayCadenaInvertida = new char[cadenaAInvertir.length()];
        //
        int contador = 0;
        /**
         * Aqui lo que haremos es "invertir" el funcionamiento "común" del ciclo for
         * ya que usualmente declaramos nuestra variable en 0 y vamos aumentando
         * en este caso iremos DECREMENTANDO, por lo que nuestro contador i debe iniciar con la longitud
         * apara que podamos restar y llegar hasta cero 0
         * Es importantisimo recordar que en el caso de los arreglos tenemos una longitud y una cantidad de posiciones
         * y son diferentes, por ejemplo un array[10] cuenta con 10 elementos, como vimos anteriormente si nosotros
         * aplicamos el método length(); vamos a tener como resultado un 10, sin embargo
         * al momento de trabajar con los arrays trabajamos con posiciones y la PRIMERA posición es el 0
         * es decir que teniendo 10 elementos vamos a tener 10 posiciones, que iniciara en 0 y teminará en 9
         * int arrayNumeros = new array[10];
         * arrayNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
         * Aqui decimos que el array contendra 10 elementos y los declaramos
         * ahora para accesar a cada uno seria a traves del indice o posicion, el primer elemento seria el 0
         * array[0] = 1, array[1] = 2, array[2] = 3, ....... array[7] = 8, array[8] = 9, array[9] = 10,
         * Comentamos que es importantisimo pq si nosotros tratamos de acceder a una posición que no existe
         * como por ejemplo array[10] vamos a tener un error de compilación pq estariamos tratando de ingresar
         * a un dato que NO existe, pq con array[10] tratariamos de leer un dato 11 el cual NO existe
         */
        System.out.println("Impresión iterando con ciclo for desde la ultima posición hasta la primera");
        for(int i = cadenaAInvertir.length() - 1; i >= 0; i--){
            /**
             * Como mencionamos, vamos a trabajar en retroceso, esto igual nos ocasiona un "problema" y es que
             * la longitud siempre será la cantidad de elementos que existen y nosotros vamos a iterar con
             * sus indices por lo que se daría el caso de entrar a una posición inexistente como mencionamos
             * arriba si la cadena tiene 10 elementos significa que .length nos dara = 10 y en
             * la primera iteración se dara el caso: array[i] = array[10] y esto es un error ya que la ULTIMA
             * posición a la que se podría entrar es array[9]
             * Para solucionar esto es sencillo, unicamente restamos 1 a esta longitud en la declaración de 1
             * El siguiente "problema que tenemos es que usualmente trabajariamos mientras i sea mayor a 0
             * pero como le primer indice del arreglo es array[0], nunca se daría este caso si lo mantenemos asi
             * entonces debemos decirle al ciclo for que el limite o el funcionamiento sera hasta que i sea
             * MENOR O IGUAL para que asi SI tome en consideración al 0 en las iteraciones.
             * y ya con el acumulador i-- vamos restando hasta llegar a 0
             */
            char letraCadenaInvertida = cadenaAInvertir.charAt(i); //Asignamos el caracter de la posición i en la variable
            /**
             * Aqui es donde vamo a crear o almacenar nuestra cadena invertida
             * aqui SI necesitamos ir trabajando desde la primera posición del array hasta la ultima para
             * almacenar los caracteres, entonces necesitamos que la posición inicial sea en 0 y vaya aumentando
             * 1, 2, 3.... hasta la longitud final de la cadena.
             * Para esto previamente declaramos un contador inicializado en cer0 el cual aumenta con cada iteración
             * es por eso que mientras el ciclo for esta restando++, el contador va aumentando++
             * Es igual importante mencionar y no olvidar que nuestro programa funciona de manera secuencial
             * por lo que el orden es IMPORTANTISIMO, primero hacemos la asignación en la posición del contador y
             * despues lo aumentamos
             * Si nosotros aumentaramos primero entonces la primera iteracion seria array[1] en lugar de array[0]
             * y eso haria que perdamos un dato
             */
            arrayCadenaInvertida[contador] = letraCadenaInvertida;
            contador++;
            /**
             * Esta es otra manera de hacerlo mediante una concatenación o algo parecido a un operador de asignación +=
             */
            cadenaInvertida = cadenaInvertida + letraCadenaInvertida;
            System.out.print(letraCadenaInvertida); //Imprimimos el caracter de la posición i
        }
        System.out.println(" ");

        System.out.println("Impresión de cadena invertida iterando en el array de tipo char");
        for(char letraCadena : arrayCadenaInvertida){
            System.out.print(letraCadena);
        }
        System.out.println(" ");

        System.out.println("Impresión de cadena invertida concatenando caracteres en un String");
        System.out.println(cadenaInvertida);
        System.out.println(" ");

        System.out.println("Impresión de cade invertida asigando el array de tipo char a un objeto tipo String");
        String cadenaInvertidaString = new String(arrayCadenaInvertida);
        System.out.println(cadenaInvertidaString);
    }
}
