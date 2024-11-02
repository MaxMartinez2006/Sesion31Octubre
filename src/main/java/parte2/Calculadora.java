package parte2;

class Calculadora {
    public int sumar(int a, int b) {
        System.out.println("Sumando dos enteros:");
        return a + b;
    }

    public double sumar(double a, double b) {
        System.out.println("Sumando dos doubles:");
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        System.out.println("Sumando tres enteros:");
        return a + b + c;
    }
}
