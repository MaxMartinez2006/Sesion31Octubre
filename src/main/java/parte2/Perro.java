package parte2;

interface Acciones {
    void caminar();
    void comer();
}

class Perro implements Acciones {
    public void caminar() {
        System.out.println("El perro está caminando.");
    }

    public void comer() {
        System.out.println("El perro está comiendo.");
    }
}

class Gato implements Acciones {
    public void caminar() {
        System.out.println("El gato está caminando.");
    }

    public void comer() {
        System.out.println("El gato está comiendo.");
    }
}
