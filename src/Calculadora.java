public class Calculadora {

    // suma de enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // suma de double
    public double sumar(double a, double b) {
        return a + b;
    }

    // resta de enteros
    public int restar(int a, int b) {
        return a - b;
    }

    // resta de double
    public double restar(double a, double b) {
        return a - b;
    }

    // multiplicacion de enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // multiplicacion de double
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // division de enteros
    public int dividir(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("No se puede dividir por cero");
        return a / b;
    }

    // division de double
    public double dividir(double a, double b) {
        if (b == 0.0)
            throw new ArithmeticException("No se puede dividir por cero");
        return a / b;
    }
}
