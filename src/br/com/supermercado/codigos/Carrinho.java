package br.com.supermercado.codigos;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularPrecoTotal() {
        double precoTotal = 0.0;

        for (Produto produto : produtos) {
            precoTotal += produto.getPreco();
        }

        return precoTotal;
    }
}