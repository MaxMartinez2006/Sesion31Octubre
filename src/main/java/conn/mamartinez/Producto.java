package conn.mamartinez;

public class Producto {

    // Atributos privados
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    // Constructor
    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Métodos getter y setter para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    // Método para actualizar la cantidad disponible
    public void actualizarCantidad(int cantidad) {
        this.cantidadDisponible += cantidad; // Puedes sumar o restar dependiendo de la operación
    }

    // Método para calcular el valor total de la existencia del producto
    public double calcularValorTotal() {
        return precio * cantidadDisponible;
    }

    // Método para imprimir la información del producto
    public void imprimirInformacion() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio +
                ", Cantidad Disponible: " + cantidadDisponible +
                ", Valor Total de Existencia: $" + calcularValorTotal());
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1500.00, 10);
        producto.imprimirInformacion();

        // Actualizando cantidad disponible
        producto.actualizarCantidad(5);
        producto.imprimirInformacion();
    }
}
