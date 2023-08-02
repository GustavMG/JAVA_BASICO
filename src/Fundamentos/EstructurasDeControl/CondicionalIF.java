package Fundamentos.EstructurasDeControl;

import java.util.Scanner;

public class CondicionalIF {
    public static void main(String[] args) {
        /**
         * Existen 3 formas de usar condicionales de if
         *
         * if
         * if - else
         * if - else if
         */

        //if
        int edad = 19;
        boolean esMayor = edad >= 18;

        System.out.println("Aqui verificamos UNICAMENTE con un If si la persona es mayor de edad(18 años)");
        if(edad > 18) System.out.println("Eres mayor de edad, puedes ingresar");

        if(esMayor){
            System.out.println("Eres mayor de edad, puedes ingresar");
        }
        System.out.println(" ");

        //if - else
        System.out.println("Aqui verificamos si es o no con un If - else si la persona es mayor de edad(18 años)");
        if(edad > 18){
            System.out.println("Eres mayor de edad, puedes ingresar");
        } else{
            System.out.println("Eres menor de edad, lo sentimos pero NO puedes ingresar");
        }
        System.out.println(" ");

        //if - else if
        System.out.println("Comparación de Dias (CamelCase)");
        String dia = "Martes";

        //Ejemplo comparar
        boolean resultadoCompararNum = (5 == 5);
        boolean resultado = dia.equals("Martes"); //Nos da true o false

        if(dia.equals("Lunes")){
            System.out.println("Primer dia de la semanita");
        } else if(dia.equals("Martes")){
            System.out.println("Martes de 2x1 en cafecito del oxxo");
        } else if(dia.equals("Miercoles")){
            System.out.println("Ya es Miercoles");
        }

        System.out.println(" ");
        System.out.println("Programa para calcular la hora");
        //Esto es si queremos poner la hora asignando el valor directamente a la variable
        //int hora = 13;
        /**
         * Utilizamos el escaner para solicitar al usuario que ingrese un dato en consola con un System.in
         * esto es lo contrario a lo que usualmente usamos para mostrar datos en consola, es decir el System.out
         */
        Scanner valorIngresado = new Scanner(System.in);

        System.out.println("Por favor, ingresa una hora en un formato de 24hrs");

        int hora = valorIngresado.nextInt();

        if(hora>=0 && hora<= 23) {
            System.out.println("Hora ingresada correctamente");
            if(hora>= 7 && hora <=11) {
                System.out.println("Buenos dias solecito");
            } else if(hora>12 && hora<=18) {
                System.out.println("Buenas tardes, que calor hace");
            } else if(hora>=19 && hora <24) {
                System.out.println("Buenas noches, a dormir");
            } else {
                System.out.println("Es de madrugada, NO es bueno desvelarse");
            }
        }
        else {
            System.out.println("Hora mal ingresada");
        }

        valorIngresado.close();    //Cierra escaner
    }
}
