package Fundamentos.Funciones;

public class Funciones {
    public static void main(String[] args) {

        //Opción 1: Función sin parámetros y sin tipo de retorno
        showMenu();

        //Opción 2: Función sin párametros y CON tipo de retorno
        System.out.println(getMenu());

        //Opción 3: Función con parámetros y SIN tipo de retorno
        imprimirSaludoBuenosDias("GustavMG");

        //Opción 4: Función con prámetros y CON tipo de retorno
        String saludo = obtenerSaludo("GustavMG");
        System.out.println(saludo);
    }

    static String obtenerSaludo(String nombre) {
        return "Hola " + nombre + " (con retorno)\n";
    }

    static void imprimirSaludoBuenosDias(String nombre) {
        System.out.println("Hola " + nombre + " (sin retorno)\n");
    }

    static void showMenu(){
        //Los modificadores de acceso lo vemos mas a detalle en la programación orientada a objetos.

        System.out.println("Bienvenido a mi e-commerce de coches:");
        System.out.println("1. Ver modelos disponibles");
        System.out.println("2. Comprar auto");
        System.out.println("3. Salir del menú");
        System.out.println(" ");
    }

    static String getMenu(){
        return "Bienvenido a mi e-commerce de coches: \n 1. Ver modelos disponibles....... \n";

    }
}
