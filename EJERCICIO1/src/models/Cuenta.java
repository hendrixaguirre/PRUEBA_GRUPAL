package models;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, double saldoInicial, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial >=0 ? saldoInicial : 0;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("El depósito se ha realizado correctamente!");
        } else {
            System.out.println("El monto ingresado es inválido!");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto ingresado es inválido!");
        } else if (monto > saldo) {
            System.out.println("Los fondos son insuficientes para realizar el retiro!");
        } else {
            saldo -= monto;
            System.out.println("El retiro se ha realizado correctamente!");
        }
    }





}
