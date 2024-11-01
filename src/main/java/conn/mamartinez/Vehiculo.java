package conn.mamartinez;

// Clase base Vehiculo
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Método para imprimir la información del vehículo
    public void imprimirInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio);
    }
}

// Subclase Auto
class Auto extends Vehiculo {
    private int numeroPuertas;

    // Constructor
    public Auto(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    // Método para imprimir la información del auto
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Número de Puertas: " + numeroPuertas);
    }
}

// Subclase Moto
class Moto extends Vehiculo {
    private boolean tieneSidecar;

    // Constructor
    public Moto(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    // Método para imprimir la información de la moto
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}




