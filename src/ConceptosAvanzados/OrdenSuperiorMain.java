package ConceptosAvanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OrdenSuperiorMain {
    public static void main(String[] args) {
        /**
         * Instanciamos nuestra clase FuncionesOrdenSuperior para poder usar sus métodos
         */
        FuncionesOrdenSuperior funcionPruebas = new FuncionesOrdenSuperior();
        funcionPruebas.pruebas();
        System.out.println("");

        /**
         * Ventaja principal de usar la programación funcional y funciones lambdas?
         * La reducción y obtimización de código...
         */
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juanito");
        nombres.add("Miguelito");
        nombres.add("Panchito");
        nombres.add("Chucho");
        nombres.add("Pepito");
        nombres.add("Fulanito");

        System.out.println("1. Usando un for each convencional");
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        System.out.println("");
        /**
         * Podemos hacer la impresión u obtención de los datos de nuestra lista mediante el uso de la
         * programación funcional, para esto nos apoyamos del método .stream()
         * Cuando se llama al método .stream() en una colección, como un ArrayList, se crea un flujo que
         * representa los elementos contenidos en esa colección. Este flujo permite realizar operaciones de
         * procesamiento, filtrado, transformación y más, de una manera más funcional y declarativa.
         */
        System.out.println("2. Usando una función lambda");
        nombres.stream().forEach(x -> System.out.println(x));
        System.out.println("");

        /**
         * Una de las cosas mas comunes de usar programación funcional y en concreto stream() son los MAPEOS
         * el map permite transformar cada elemento de un flujo en otro valor usando una función específica.
         * Esta operación crea un nuevo flujo que contiene los resultados de aplicar la función a cada
         * elemento del flujo original.
         *
         * @Nota: El stream nos hace el for automatico pero una vez que se consume nuestro stream ya NO podemos
         * utilizarlo
         *
         * La forma corta de usar nuestro Stream seria:
         *      Stream<String> nombresStream= nombres.stream().map(x -> "Hola, " + x.toUpperCase());
         * Tambien tenemos la forma larga que la pondremos pq a fin de cuentas es una función solo que expresada
         * de otra manera:
         *      Stream<String> nombresStream= nombres.stream()
         *                 .map((x) -> {
         *                     return "Hola, " + x.toUpperCase();
         *                 });
         *
         */
        System.out.println("3. Usando el stream con un foreach y el método toUpperCase()");
        Stream<String> nombresStream= nombres.stream().map((x) -> "Hola, " + x.toUpperCase());
        nombresStream.forEach(x -> System.out.println(x));
        System.out.println("");

        /**
         * Existen 3 operaciones que son comunmente utilizadas con los Stream y son el map, filter y reduce que
         * se utilizan ampliamente para transformar y procesar datos de manera declarativa y eficiente.
         *
         * Aqui de principio esramos usando la función .map para iterar sobre todos los elementos y convertirlos
         * en mayusculas y posteriormente usamos .filter, quien recibe los parametro de la función map como entrada,
         * para filtrar los elementos que comienzan con "P", podria ser cualquier otra condición que sea compatible
         * con nuestro tipo elemento, recordemos que las clases envolventes como String, Integer, Double, etc, tienen
         * sus propios métodos.
         */
        System.out.println("4. Usando map & filter");
        Stream<String> nombresFiltrados= nombres.stream()
                .map((x) -> x.toUpperCase())
                .filter((x) -> x.startsWith("P"));
        nombresFiltrados.forEach(x -> System.out.println(x));
        System.out.println("");

        System.out.println("5. Filtro con enteros");
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream numerosStream = Arrays.stream(numeros);
        IntStream numerosPares = numerosStream.filter((x) -> x % 2 == 0);
        /**
         * @Nota: Recordemos que los Stream SOLO SE PUEDEN CONSUMIR una vez, estamos consumiendo en un principio
         * al filtrar los elementos pares por lo que debemos crear otra variable del mismo tipo InStream para
         * poder trabajar y hacer otra iteración que en este caso es para imprimir los datos en consola.
         */
        numerosPares.forEach(x -> System.out.println(x));

        System.out.println("6. Usando filter & reduce");
        int[] numeros2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream numerosStream2 = Arrays.stream(numeros);
//        Integer numerosReduce = numerosStream2.filter((x) -> x % 2 == 0).reduce(0, (x, y) -> {
//            System.out.println("El valor de x es: " + x + " y el valor de y es: " + y);
//            return x + y;
//        });
//        Integer numerosReduce = numerosStream2
//                .map((x) -> x * 2)
//                .filter((x) -> x % 2 == 0)
//                .reduce(0, (x, y) -> {
//            System.out.println("El valor de x es: " + x + " y el valor de y es: " + y);
//            return x + y;
//        });
        //Forma Funcional o declarativa
        Integer numerosReduce = numerosStream2
                .map((x) -> x * 2)
                .filter((x) -> x % 2 == 0)
                .reduce(0, (x, y) -> x + y);

        //Forma imperativa
        int sumaTotal = 0;
        for(int numero : numeros2){
            numero = numero * 2;
            if(numero % 2 != 0){
                continue;
            }
            sumaTotal += numero;
        }
        System.out.println("Mi suma de pares con numerosReduce es: " + numerosReduce + " y con for: " + sumaTotal);
    }
}
