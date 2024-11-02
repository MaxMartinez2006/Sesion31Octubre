package parte2;

abstract class FiguraGeometrica {
    abstract double calcularArea();
}

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends FiguraGeometrica {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }
}
