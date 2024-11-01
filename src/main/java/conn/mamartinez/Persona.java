package conn.mamartinez;

public class Persona {
        // Atributos privados
        private String nombre;
        private int edad;
        private String genero;

        // Constructor
        public Persona(String nombre, int edad, String genero) {
            this.nombre = nombre;
            this.edad = edad;
            this.genero = genero;
        }

        // Métodos getter
        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public String getGenero() {
            return genero;
        }

        // Métodos setter
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        // Método para imprimir la información de la persona
        public void imprimirInformacion() {
            System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero);
        }



        // Ejemplo de uso
        public static void main(String[] args) {
            Persona persona = new Persona("Max Martinez", 18, "Masculino");
            persona.imprimirInformacion();
        }
    }

