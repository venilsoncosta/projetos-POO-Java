package br.com.supermercado.codigos;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private Cartao cartao;
    private double salario;
    private Carrinho carrinho;

    public Cliente(String nome, Cartao cartao, double salario) {
        this.nome = nome;
        this.cartao = cartao;
        this.salario = salario;
        this.carrinho = new Carrinho();
    }

    public void realizarCompra(Produto produto){
        if(this.cartao.getSaldo() >= produto.getPreco()){
            this.cartao.setSaldo(this.cartao.getSaldo() - produto.getPreco());
        }
        else {
            System.out.println("Saldo insufiente");
        }
    }

    public void realizarCompra(Carrinho carrinho) {
        double precoTotal = carrinho.calcularPrecoTotal();

        if (cartao.getSaldo() >= precoTotal) {
            cartao.setSaldo(cartao.getSaldo() - precoTotal);
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void adicionarProdutosAoCarrinho(Produto produto){
        carrinho.adicionarProduto(produto);
    }

    public String getNome() {
        return nome;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}
