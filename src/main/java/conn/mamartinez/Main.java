package conn.mamartinez;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Harley-Davidson", "Sportster", 2019, true);

        System.out.println("Información del Auto:");
        auto.imprimirInformacion();

        System.out.println("\nInformación de la Moto:");
        moto.imprimirInformacion();
    }
}