package conn.mamartinez;

public class Empresa {

        private String nombreEmpresa;
        private Direccion direccion; // Composición

        // Constructor
        public Empresa(String nombreEmpresa, Direccion direccion) {
            this.nombreEmpresa = nombreEmpresa;
            this.direccion = direccion;
        }

        // Métodos getter
        public String getNombreEmpresa() {
            return nombreEmpresa;
        }

        public Direccion getDireccion() {
            return direccion;
        }

        // Método para mostrar los detalles completos de la empresa
        public void mostrarDetalles() {
            System.out.println("Nombre de la Empresa: " + nombreEmpresa);
            direccion.mostrarDireccion();
        }

        // Ejemplo de uso
        public static void main(String[] args) {
            Direccion direccion = new Direccion("Av. Siempre Viva 123", "Springfield", "12345");
            conn.mamartinez.Empresa empresa = new conn.mamartinez.Empresa("Tecnologias Innovadoras S.A.", direccion);

            empresa.mostrarDetalles();
        }
    }

