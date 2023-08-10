package Fundamentos.IO;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        /**
         * La clase escaner / Scanner es una de las mas importantes y utiles, ya que nos permite recibir
         * información por parte del usuario desde la consola
         * No olvidar que siempre que llamemos a estas clases debemos importar de java
         *
         * Podemos combinar lo que vimos anteriormente, el InputStream para entonces recibir información
         * de un archivo en lugar de con la consola, la clase Scanner nos permite recibir cadenas de texto y scannerNumeros
         *
         * Algo a tener en cuenta es que al momento que solicitamos información por el escaner, el programa se
         * queda "pausado" hasta recibir información para poder continuar su ejecución.
         */
        try {
            InputStream archivoTXT = new FileInputStream("ramaGustavMG.txt");
            Scanner scanner = new Scanner(archivoTXT);
        } catch (Exception e){
            System.out.println("Error.... " + e.getMessage());
        }
        /**
         * Solicitamos información al usuario como entero...
         * Sin embargo esto tiene un problema ya que no hay alguna restricción para el usuario para que solo pueda
         * ingresar numeros
         * El usuario puede ingresar otros caracteres y la consola lo va a recibir, el problema viene en que
         * el programa se muere...
         * Entoces que podemos hacer?
         * Podemos gestionar este error con un catch que este continuamente solicitando los numeros al usuario
         * MIENTRAS no ingrese valores validos
         * Esto porque en teoria estamos solicitando numeros para realizar alguna operación y mientras no recibamos
         * los parámetros que necesitemos nuestro programa no podrá trabajar
         * Entonces originalmente teniamos el código siguiente y lo modificaremos
         * Scanner scannerNumeros = new Scanner(System.in);
         *         System.out.println("Ingresa dos scannerNumeros");
         *         int num1 = scannerNumeros.nextInt();
         *         int num2 = scannerNumeros.nextInt();
         *         System.out.println("Los scannerNumeros son: " + num1 + " y " + num2);
         */

        int num1 = 0;
        int num2 = 0;
        boolean okNum = false;
        do {
            Scanner scannerNumeros = new Scanner(System.in);
            try {
                System.out.println("Ingresa dos numeros");
                num1 = scannerNumeros.nextInt();
                num2 = scannerNumeros.nextInt();
                okNum = true;
            } catch (InputMismatchException e){
                System.out.println("Numeros inválidos...");
            }
        } while (!okNum);


        System.out.println("Los scannerNumeros son: " + num1 + " y " + num2);
    }
}
