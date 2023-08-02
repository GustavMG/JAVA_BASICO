package Fundamentos.Funciones;

public class SobrecargaFuncionCalcular {
    /**
     * La sobrecarga permite duplicar funciones/métodos siempre y cuando tengan DIFERENTES numero o tipo de parámetros
     */
    public static void main(String[] args) {
//        Calculadora calculadora = new Calculadora();

        int resultado1 = sumar(5, 3);
        float resultado2 = sumar(2.5f, 3.8f);
        int resultado3 = sumar(1, 2, 3);

        System.out.println("Resultado 1: " + resultado1); // Resultado 1: 8
        System.out.println("Resultado 2: " + resultado2); // Resultado 2: 6.3
        System.out.println("Resultado 3: " + resultado3); // Resultado 3: 6
    }

    // Método para sumar dos enteros
    static int sumar(int a, int b) {
        return a + b;
    }

    // Método para sumar dos números flotantes
    static float sumar(float a, float b) {
        return a + b;
    }

    // Método para sumar tres enteros
    static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}