package Fundamentos.VariablesYTiposDatos;

public class ConstantesNumericas {
    /**
     * En Java, las constantes son variables cuyos valores no cambian a lo largo de la ejecución del programa y se
     * declaran utilizando la palabra clave final
     */
    public static final int NUMERO_MAXIMO = 100;
    public static final double PI = 3.14159;
    public static final float GRAVEDAD = 9.81f;

    public static final int[] ARREGLO_NUMEROS = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        int edad = 25;
        if (edad <= NUMERO_MAXIMO) {
            System.out.println("Eres joven");
        } else {
            System.out.println("Eres mayor");
        }
        System.out.println("El valor de PI es: " + PI);
        System.out.println("La aceleración de la gravedad es: " + GRAVEDAD);

        System.out.println("Arreglo de números:");
        for (int num : ARREGLO_NUMEROS) {
            System.out.print(num + " ");
        }
    }
}

