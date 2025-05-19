package calculadoraed;

/**
 * Clase principal para probar la calculadora.
 *
 * @author Juan Pérez
 * @version 1.0
 * @since 2023-10-15
 */
public class Main {

    /**
     * Método principal que ejecuta pruebas de la calculadora.
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.println("Suma: 5 + 3 = " + calc.sumar(5, 3));
        System.out.println("Resta: 5 - 3 = " + calc.restar(5, 3));

        try {
            System.out.println("División: 10 / 2 = " + calc.dividir(10, 2));
            System.out.println("División: 5 / 0 = " + calc.dividir(5, 0));
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
