package Fundamentos.Excepciones;

import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        /**
         * Los errores nos evitan poder continuar la secuencia de nuestro código
         * los errores pueden presentarse por diversas razones, sin embargo hay algunos
         * que se puede englobar como los errores aritmeticos, tipo una división entre cero
         * o con numeros imaginarios o algo de este tipo que "no este considerado"
         *
         *              @NOTA: Exception es una clase!!!!
         *
         * Para poder gestionar lo errores o encontrar donde se dan tenemos la herramienta de los breakpoint
         * y el debugger, asi mismo la consola nos muestra cual es el error que se presenta para que podamos
         * "atraparlo" o identificarlo y entonces saber que hacer con este error
         *
         * Para trabajar con los errores debemos usar la construcción try & catch
         *try {
         *      Nosotros aqui ponemos el código sensible de errores o el que queremos evaluar y que podria fallar
         * }
         * catch....{
         *      Aqui vamos a decir que queremos hacer cuando se dispare el error y lo que ocurre en código es que
         *      se crea una "excepción", lo podemos ver como que la excepción es algo que se excluye de lo común
         *      y en este caso de programación necesitamos hacer que un error tenga una excepción o se excluya de
         *      nuestro flujo para que nuestro programa no se muera, entonces lo que hacemos es "cachar o recibir"
         *      el error, ya mencionamos que existen muchos tipos de errores y debemos trabajar con el tipo de
         *      error que se nos presenta, este error especifico nos lo debe dar la consola.
         * }
         * Ahora, nosotros debemos trabajar con el tipo de error especficio, pero en dado caso de que nosotros no
         * sepamos cual es el tipo de error, siempre podemos cachar todos o cualquier tipo de errror que se nos presente
         * de una forma generica indicando una exepción general ---> Exception e
         * entonces nuestro catch iria acompañado de este "indicador o código" de error y quedaria como...
         *
         * try { código }
         *      catch (Exception e) { .... }
         * Ahora si nosotros conocemos el tipo de error como podría ser un error aritmetico o un valor nulo
         * debemos indicar el código especifico, por ejemplo para errores aritmetico es --> (ArithmeticException e)
         *
         * try { código }
         *          catch (ArithmeticException e) { .... }
         *
         *                          @NOTA: Exception es una clase!!!!
         *
         * Debemos siempre identificar el error para hacer la excepcion, asi que usaremos el método de la clase
         * Exception para saber cual es la que se esta disparando, y el método es: getClass()
         * por lo que siguiendo el ejemplo inicial cuando no conoces la excepcion quedaria como e.getClass();
         * y entonces podemos imprimirla en consola.
         * Asi mismo, podemos hacer algo cuando se dispara la excepción, por ejemplo que si estamos dividiendo
         * y el divisor es 0 podemos forzar nuestro resultado por ejemplo a 0 o mostrar un mensaje en consola
         * que nos diga que esta operación no se puede realizar o lo que nosotros queramos
         *
         * Algo intereseante es que si nosotros YA sabes que exepciones vamos a tener por ejemplo ArithmeticException
         * podemos gestionar esta excepción y otras mas, o sea que podemos tener varios catch...
         *
         * try { código }
         *      catch (ArithmeticException e) { .... }
         *      catch (Exception e) { .... }
         *
         *   El try catch podria acabar asi, pero existe un último complemento y es el finally
         *   este finnaly se coloca al final final y se ejecuta haya o no haya un error
         *   en teoría debemos siempre gestionar nuestros errores asi que no habria razón para colocar
         *   un finally a menos que queramos indicar que se ha finalizado un proceso
         *
         *   try { código }
         *          catch (ArithmeticException e) { .... }
         *          catch (Exception e) { .... }
         *          finally { .... }
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 2 numeros");

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        try {
            int resultado = numA / numB;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Se ha presentado una exepción :c, es la siguiente: " + e.getClass());

        } catch (Exception e){
            System.out.println("Esto NO es una excepción aritmetica!!");
        } finally {
            System.out.println("Se ha finalizado el proceso, haya o no salido bien");
        }

        /**
         * Algo muy interesante de las excepciones es que nosotros podemos crear nuestras propias
         * excepciones si queremos trabajar con cosas especificas, para esto utilizamos las palabras reservadas:
         *
         *      throw y throws
         */
    }
}
