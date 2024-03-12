package br.com.celular;

public class Celular {
    private String modelo;
    private double preco;
    private boolean ligado = false;

    public Celular(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public void ligarCelular(){
        this.ligado = true;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isLigado() {
        return ligado;
    }
}
