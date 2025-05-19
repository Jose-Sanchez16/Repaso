package calculadoraed;

/**
 * Clase que proporciona operaciones aritméticas básicas.
 *
 * @author Tu nombre
 * @version 1.0
 * @since 2023-10-15
 */
public class calculadora {

    /**
     * Constructor por defecto de la clase Calculadora.
     */
    public calculadora() {
    }

    /**
     * Suma dos números enteros.
     *
     * @param a Primer sumando
     * @param b Segundo sumando
     * @return La suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a Minuendo
     * @param b Sustraendo
     * @return La diferencia entre a y b
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param dividendo Número a dividir
     * @param divisor Número que divide
     * @return Resultado de la división
     * @throws ArithmeticException Si el divisor es cero
     */
    public double dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("División por cero");
        }
        return (double) dividendo / divisor;
    }
}
