package Fundamentos.Funciones;

public class FuncionesAritmeticas {
    public static void main(String[] args) {
        //Suma con parámetros de entrada
        int resultadoSuma = suma(50,200);
        //Podemos reutilizar el extracto del código en la función e ir asignando los resultados retornados en variables
        int resultadoSuma2 = suma(10,115);
        int resultadoSuma3 = suma(900,5);
        int resultadoSuma4 = suma(80,45);
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la suma es: " + resultadoSuma2);
        System.out.println("El resultado de la suma es: " + resultadoSuma3);
        System.out.println("El resultado de la suma es: " + resultadoSuma4);
    }
    static int suma(int num1, int num2) {
        System.out.println("Valores de entrada son a: " + num1 + " b: " + num2);
        System.out.println(" ");
        return num1 + num2;
    }
}
