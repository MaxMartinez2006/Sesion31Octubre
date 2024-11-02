package parte2;

class CuentaBancaria {
    protected double saldo;

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }
}

class CuentaAhorros extends CuentaBancaria {
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}

class CuentaCorriente extends CuentaBancaria {
    private double sobregiro;

    public CuentaCorriente(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public void retirar(double monto) {
        if (monto <= saldo + sobregiro) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
