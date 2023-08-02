package Fundamentos.Funciones;

public class FuncionesAritmeticas {
    public static void main(String[] args) {
        //Suma con parámetros de entrada
        int resultadoSuma = suma(50,200);
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println(" ");
    }
    static int suma(int num1, int num2) {
        System.out.println("Valores de entrada son a: " + num1 + " b: " + num2);
        return num1 + num2;
    }
}
