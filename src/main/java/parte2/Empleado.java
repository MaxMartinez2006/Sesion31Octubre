package parte2;

interface Beneficios {
    int calcularVacaciones();
}

abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();
    abstract void mostrarDetalles();
}

class EmpleadoPermanente extends Empleado implements Beneficios {
    public EmpleadoPermanente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase * 1.2;  // Salario con bono
    }

    public int calcularVacaciones() {
        return 20;  // Días de vacaciones
    }

    public void mostrarDetalles() {
        System.out.println("Empleado Permanente: " + nombre + ", Salario: " + calcularSalario());
    }
}

class EmpleadoContratado extends Empleado {
    public EmpleadoContratado(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarDetalles() {
        System.out.println("Empleado Contratado: " + nombre + ", Salario: " + calcularSalario());
    }
}
