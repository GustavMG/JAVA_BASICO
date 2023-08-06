package Fundamentos.EstructurasDatosBasicas;

import java.util.ArrayList;

public class EstructArrayList {
    public static void main(String[] args) {
        /**
         * Tanto Vector como ArrayList son clases que implementan la interfaz List en Java
         * y proporcionan una implementación dinámica de un array.
         * ArrayList es una implementación dinámica de un array en Java que permite almacenar y manipular
         * colecciones de elementos de manera flexible.
         * Es una estructura de datos muy utilizada debido a su facilidad de uso y su capacidad de cambiar
         * su tamaño según sea necesario.
         *
         * Los arrayList vienen mejor que los Vectores asi que optemos por usar estos
         * @Nota: pendiente investigar las ventajas entre sí
         *
         * Es importante saber que un ArrayList es una IMPLEMENTACIÓN de la interface List
         * y que es similiar al vector.
         *
         * Una de las diferencias destacables con el vector es que ArrayList no cuenta con un metodo para la capacidad
         * el incremento de este array dinámico se hace en un 50% a diferencia del vector que crece al doble
         * entonces la capacidad la veriamos asi:
         *          CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 50%)
         *
         *   leer documentación de java de las listas
         *   https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html
         *   Esto pq de la interface List derivan muchas subclases
         */
        //Asi declaramos un arrayList
        ArrayList<String> lista = new ArrayList<String>();
        /**
         * Asi le ingresamos datos al ArrayList, mediante su método, el cual recibe un parámetro
         * Como podemos observar se hace igual que con los vectores
         */
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");
        //El contenido se muestra de igual manera que en un vector
        System.out.println("Contenido: " + lista);

        /**
         * Aqui usamos el mismo método para eliminar elementos
         * .remove()
         * Aqui como estamos trabajando con string debemos buscar la coincidencia con el que haya
         * un objeto que exista en nuestra lista o el indice
         * Como trabajaremos por el momento con String vamos a buscar los valores con esa coincidencia
         * de cadena, asi que por ejemplo para eliminar el "Elemento C" podemos hacer de 2 formas:
         *
         * 1. Mediante su indice lista.remove(2)
         * 2. Mediante la coincidencia del objeto lista.remove("Elemento C")
         *
         * Considero que la busqueda o el ordenamiento es lo ideal para estas listas ya que si trabajamos con
         * Strings en el ejemplo que queramos buscar usuarios por medio de su correo registrado seria mejor una lista.
         */
        lista.remove("Elemento C");
        System.out.println("Contenido: " + lista);

        //Podemos recorrer con ciclos for como en los vectores
        System.out.println("Impresión de la lista con ciclo for corto");
        for (String nombre : lista){
            System.out.println(nombre);
        }
        System.out.println("Impresión de la lista con ciclo for largo");
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        //Vamos a convertir nuestra lista en un array y como no sabemos la longitud exacta le damos el tamaño de la lista
        String[] array = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++){
            array[i] = lista.get(i);
        }
        System.out.println("Impresión del array con los datos de la lista");
        for (String dato : array){
            System.out.println(dato);
        }

        /**
         * Existe una manera de recorrer una lista que convertimos en array
         * para esto debemos ir a la clase de las clases, la mas alta la cual es Object
         *
         * Lo que hacemos es asignar al objeto la conversion de lista a array: lista.toArray();
         * y para poder mostrar los datos debemos invocar el método toString(); del que ya habiamos
         * hablando con anteriordad, el método "especial" que tienen las clases
         * Este método lo que hace es devolvernos una representación legible en forma de cadena.
         * en las clases y objetos de POO hablamos de los métodos "especiales" y ahi tenemos un poco mas de información
         * Entonces este método toString(); es el que nos permite visualizar esta información....
         */
        System.out.println("Impresión del array con los datos con la clase Object");
        for (Object arrayObjeto : lista.toArray()){
            System.out.println(arrayObjeto.toString());
        }
    }
}
