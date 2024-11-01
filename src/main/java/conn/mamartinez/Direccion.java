package conn.mamartinez;

public class Direccion {

    private String calle;
    private String ciudad;
    private String codigoPostal;

    // Constructor
    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    // Métodos getter
    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    // Método para mostrar los detalles de la dirección
    public void mostrarDireccion() {
        System.out.println("Dirección: " + calle + ", " + ciudad + ", " + codigoPostal);
    }
}

// Clase Empresa

