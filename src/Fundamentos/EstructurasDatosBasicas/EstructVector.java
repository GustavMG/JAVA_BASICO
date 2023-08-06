package Fundamentos.EstructurasDatosBasicas;

import java.util.Vector;

public class EstructVector {
    public static void main(String[] args) {
        /**
         * A los vectores NO le damos un tamaño inicial o final
         * la ventaja que nos da es precisamente esto ya que su dimensión se ajusta de acuerdo
         * a los datos que tengamos o vayamos ingresando.
         *
         * Aqui a diferencia de los arrays, no se le da como tipo de dato un PRIMITIVO
         * si no que le damos un DATO ENVOLVENTE, por ejemplo
         *  en lugar de un entero int le dariamos un Integer
         *
         *  Podemos pensar en los vectores como una evolución del array, una clase que trabaja con arrays
         *  ya que al usar y crear la clase Vector, por dentro estamos trabajando con arrays
         */
        //Asi declaramos un vector
        Vector<Integer> vector = new Vector();
        //Asi le ingresamos datos al vector, mediante su método, el cual recibe un parámetro
        vector.add(1);
        vector.add(2);
        vector.add(3);
        /**
         * Es importante hacer mención de algo que yo en su momento me pregunté
         * y es porque si hago un System.out.println de un array y de un vector el resultado NO es el mismo
         * O sea si nosotros imprimimos el array vamos a obtener unos datos ratos como podria ser [I@119d7047
         * y esto no es que sean datos aleatorios, aqui estamos viendo la DIRECCIÖN de memoria donde se esta
         * almacenando la información del array. si queremos entonces visualizar los datos debemos acceder
         * mediante sus indices con un ciclo o búcle o de forma manual [5]
         *
         * Ahora como podemos ver en los vectores, su hacemos el Systenm.out si obtenemos los datos que se han ingresado
         *      ¿Y esto porqe??
         *     Porque para los vectores, arraylist o linklist estamos usando CLASES de JAVA
         *     lo podemos ver con la importación
         *          import java.util.Vector;
         *     entonces más adelante cuando hagamos nuestras propias clases veremos que estaremos usando métodos
         *     personalizados y algunos métodos "por default" o de convención como lo son getters, setters y el que
         *     nos interesa para esta pauta es el toString();
         *     Este método lo que hace es devolvernos una representación legible en forma de cadena.
         *     en las clases y objetos de POO hablamos de los métodos "especiales" y ahi tenemos un poco mas de información
         *     Entonces este método toString(); es el que nos permite visualizar esta información aunque al imprimir
         *     con un System.out no nos pide invocar este método, sin embargo podriamos hacerlo de la siguiente manera:
         *     String string = vector.toString();
         *         System.out.println(string);
         *     Como vemos se declara una variable de tipo String que va almacenar el valor obtenido del método toString
         *     del objeto vector y ya despues imprimimos esta variable, si nos damos cuenta esto es más largo pero ambos
         *     realizan la misma acción.
         *     Y bueno el array al NO tratarse de una CLASE que estamos instanciando no contamos con este método por lo
         *     que tenemos que iterar para acceder a sus elementos, posiblemente podriamos crear una función que realice
         *     este código del toString(); para los arrays y sería interesante investigar en que implementaciones
         *     nos serviria el utilizar un toString personalizado para el array.
         */
        int[] arrayInt = {10, 20, 30, 40};
        System.out.println("Datos del array: " + arrayInt);
        System.out.println("Datos del vector: " + vector);
        String string = vector.toString();
        System.out.println(string);

        //Asi eliminamos elementos del vector, le tenemos que dar el INDICE a eliminar (como en el array)
        vector.remove(2);
        //Entonces como inicialmente teniamos 1, 2, 3 al darle el indice 2 nos va a eliminar el numero 3
        System.out.println(vector);

        /**
         * Los vectores tiene 2 propiedades mágicas
         * el tamaño y la capacidad y podemos saber estos valores con sus métodos preestablecidos
         * size() y capacity()
         *
         * Si nosotros en este punto invocamos estos dos métodos vamos a observar unos resultados
         * corramos el código para saber que resulta
         */
        System.out.println("Tamaño vector: " + vector.size() + " capacidad vector: " + vector.capacity());

        /**
         * El resultado de la impresión fue:
         *      Tamaño vector: 2 capacidad vector: 10
         * Ok, ahora vemos que el vector tiene un tamaño de 2, esto porque inicilmente le dimos 3 datos con add()
         * add(1), add(2) y add(3) y al imprimos obtvimos: [1, 2, 3]
         * y posteriormente eliminamos el dato del indice 2 con el método remove(2) y al imprimir obtuvimos: [1, 2]
         * por lo que despues de esta operación nuestro vector disminuyó de tamaño
         * Recordemos que internamente la clase Vector trabaja con arrays, supongo que por eso trabajamos con indices
         * entonces ya sabemos que los arrays de declaran con un tamaño especifico y este NO se puede cambiar
         * entonces lo que nosotros vemos como la capacidad del vector vendria siendo el tamaño que tiene el array
         * es decir que la clase Vector crea un array con capacidad [10] elementos y al ir ingresando datos
         * aumenta o disminuye el tamaño del vector siendo esto los elementos que tenga el array, quiero suponer que
         * internamente veriamos algo asi:
         *              [1, 2, ,null, null, null, null, null, null, null, null]
         * Tenemos 10 espacios que podemos utilizar pero solo tenemos 2 datos, y seria nuestra capacidad y nuestro
         * tamaño respectivamente.
         *
         *
         * Ahora, que pasa si nos pasamos de esta capacidad que tiene el vector....?
         * pongamos mas datos al vector e imprimamoslo....
         */
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);
        System.out.println("Tamaño vector: " + vector.size() + " capacidad vector: " + vector.capacity());

        /**
         * tuvimos como resultadi en consola lo siguiente:
         * [1, 2]
         * Tamaño vector: 2 capacidad vector: 10
         * [1, 2, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3]
         * Tamaño vector: 14 capacidad vector: 20
         *
         * parece ser que el vector aumenta su capacidad cuando esta se ve superada por lo que estamos trabajando
         * con un "array dinámico", internamente lo que pasa es que se crea un nuevo array con una capacidad mas grande
         * y los elementos del array original se copian al nuevo array y este ciclo se repite cada que superamos
         * la capacidad del vector
         * La ventaja es que no nos tenemos que preocupar por hacer este incremento ya que se hace automaticamente
         * ahora el problema que podriamos observar es que si un array es muuuuuuuuuuy grande y este se incrementa
         * aun más, por un momento vamos a ocupar mucha memoria para este proceso pq tendriamos duplicado la cantidad
         * de memoria necesarria ya que tendriamos el array original y el nuevo array donde se copiaran los datos
         * y si despues se eliminará el array original pero en un momento ocuparemos toda esta memoria.
         *
         * Ahora, tambien podemos limitar la capacidad de nuestro Vector al igual con el array
         * la clase Vector puede recibir parámetros, y el PRIMER parámetro que recibe es la initialCapacity
         * Vector(int initialCapacity)
         * Constructs an empty vector with the specified initial capacity and with its capacity increment equal to zero.
         * Vector<Integer> vector = new Vector<>(50);
         *
         * El segundo parámetro que admite el constructor es la capacidad de incremento, y esto lo que hará es que
         * al momento que se desborde por que se supere la capacidad, el vector aumentará en lo que hayamos designado
         * por ejemplo si la capacidad inicial es 1 y la capacidad de incremento es 15, cuando agregemos un segundo
         * dato nuestra capacidad del vector será 16 y al agregar el dato 17 la capacidad será 31.....
         * Vector(int initialCapacity, int capacityIncrement)
         * Constructs an empty vector with the specified initial capacity and capacity increment.
         * Vector<Integer> vector = new Vector<>(50, 15);
         *
         * @Nota: Recordar que si nos posicionamos en los parentesis y presionamos ctrl + espacio el IDE nos da las
         * sugerencias o los nombres y tipos de datos que puede recibir el contructor.
         */

        Vector<Integer> vector2 = new Vector<>(1,15);
        vector2.add(10);
        vector2.add(20);
        vector2.add(30);
        vector2.add(40);
        vector2.add(50);
        System.out.println("Tamaño vector2: " + vector2.size() + " capacidad vector2: " + vector2.capacity());

        /**
         * Podemos hacer una comparación de vector obteniendo un true o false con el metodo equals
         */
        boolean comparacionVectores = vector.equals(vector2);
        System.out.println("Los vectores son iguales?: " + comparacionVectores);
        System.out.println("");

        /**
         * Podemos iterar los vectores al igual que los arrays con los ciclos for
         */
        System.out.println("Iterando con ciclo for corto");
        for (int datoVector : vector2){
            System.out.println("Valor del vector es: " + datoVector);
        }
        System.out.println("Iterando con ciclo for convencional");
        for (int i = 0; i < vector2.size(); i++){
            System.out.println("Valor del vector en posición " + i + " es: " + vector2.get(i));
        }
        System.out.println("Vamos a iterar y eliminar ");
        for (int i = 0; i < vector2.size(); i++){
            if(i % 2 == 0) {
//                System.out.println("Dato eliminado " + i + " es: " + vector2.get(i));
                vector2.remove(i);
            }
            System.out.println("Valor del vector en posición " + i + " es: " + vector2.get(i));
        }
        System.out.println(vector2);
        /**
         * Esta eliminación es algo confusa pq lo que hacemos es eliminar y reasignar aumaticamente para cubrir
         * el espacio que se eliminó es por eso que nuestro array queda como: [20, 30, 50]en consola obtenemos:
         * y en consola vemos:
         * Valor del vector en posición 0 es: 10
         * Valor del vector en posición 1 es: 20
         * Valor del vector en posición 2 es: 30
         * Valor del vector en posición 3 es: 40
         * Valor del vector en posición 4 es: 50
         * Vamos a iterar y eliminar
         * Dato eliminado 0 es: 10
         * Valor del vector en posición 0 es: 20
         * Valor del vector en posición 1 es: 30
         * Dato eliminado 2 es: 40
         * Valor del vector en posición 2 es: 50
         */

        Vector<Integer> vector3 = new Vector<>(50);
        vector3.add(100);
        vector3.add(200);
        vector3.add(300);
        vector3.add(400);
        vector3.add(500);
        System.out.println("Tamaño vector3: " + vector3.size() + " capacidad vector3: " + vector3.capacity());
        /**
         * Algo interesante es que nosotros podemos "liberar" memoria reduciendo el tamaño del vector para que no
         * ocupe mas del necesario
         * esto lo hacemos con el metodo trimToSize();
         * Este método lo que hace es reducir la capacidad del vector al tamaño del vector por lo que al aplicar este
         * método capacidad = tamaño
         * Aunque igual aqui se tiene que hacer un nuevo vector y copiar los datos del antiguo al nuevo y podriamos
         * tambien ocasionar por un momento que se relentice nuestro porgrama.
         *
         * Es dificil pero si vamos a usar vectores debemos poner un valor aproximado del que vamos a usar
         * tambien no dar una capacidad inicial muuuy grande...
         */
        vector3.trimToSize();
        System.out.println("Aplicando el trimToSize();");
        System.out.println("Tamaño vector3: " + vector3.size() + " capacidad vector3: " + vector3.capacity());

        /*
        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Vector.html
        aqui podemos ver la documentación de java
         */
    }
}
