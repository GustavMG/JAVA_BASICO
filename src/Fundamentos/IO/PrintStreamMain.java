package Fundamentos.IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamMain {
    public static void main(String[] args) {
        /**
         *Nosotros estamos acostumbrados a utilizar un System.out.println("Texto a imprimir en consola");
         * para mostrar datos en consola ya que es lo más sencillo, sin embargo porque asi...? es la unica manera
         * de mostrar/escribir datos/información?
         * Para empezar debemos considerar que el out --> e sun PrintStream
         * Es entendible como vimos anteriormente que el "inverso" del System.in, que es para leer/obtener datos,
         * sería el System.out el cual realmente es una clase "PrintStream" la cual como toda clase que queremos usar
         * debemos instanciar... para generar datos a partir de algo, lo cual puede ser desde consola o desde algun
         * archivos que leamos
         * la clase es ---> public static final java.io.PrintStream out
         * Y tenemos diversos métodos:
         * PrintStream.println(),
         * PrintStream.println(boolean),
         * PrintStream.println(char), PrintStream.println(char[]),
         * PrintStream.println(double),PrintStream.println(float),
         * PrintStream.println(int), PrintStream.println(long),
         * PrintStream.println(Object),
         * PrintStream.println(String), Console.charset(), Charset.defaultCharset()
         * Como en la mayoría de las clases de java,debemos importar la libreria!
         *
         * @Nota: No olvidarse de trabajar con las execepciones para el manejo de errores, en el PrintStream
         * se puede dar el caso que no encontremos el archivos asi que debemos trabajar con: FileNotFoundException
         */
        System.out.println("Imprimiendo en consola con el método .println('')");
        /**
         * Ahora, como dijimos usualmente usamos nuestro PrintStream usualmente para mostrar información en consola
         * tratemos de hacer algo diferente, escribamos información en un archivo txt
         * para esto usamos el método propio de PrintStream, insertaremos texto con el método .println("");
         *   info.println("Este texto se ha creado en el archivo txt --> infoPrintStream.txt");
         *   info.println("Utilizando la clas PrintStream");
         * Despues de insertar este texto por primer vez lo vamos a comentar ya que si no se escribiría cada
         * que ejecutemos el programa y bueno, en este caso no queremos esto
         */
        try {
            PrintStream info = new PrintStream("infoPrintStream.txt");
            //Aqui ya hemos ingresado texto, es por eso que lo comentamos...
//            info.println("Este texto se ha creado en el archivo txt --> infoPrintStream.txt");
//            info.println("Utilizando la clas PrintStream");
        } catch (FileNotFoundException e){
            System.out.println("Error" + e.getMessage());
        }


    }
}
