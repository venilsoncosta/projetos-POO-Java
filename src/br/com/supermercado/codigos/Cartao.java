package br.com.supermercado.codigos;

public class Cartao {
    private double limite;
    private double saldo;

    public Cartao(double limite, double saldo) {
        this.limite = limite;
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
