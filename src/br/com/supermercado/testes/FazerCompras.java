package br.com.supermercado.testes;

import br.com.supermercado.codigos.Carrinho;
import br.com.supermercado.codigos.Cartao;
import br.com.supermercado.codigos.Cliente;
import br.com.supermercado.codigos.Produto;

public class FazerCompras {
    public static void main(String[] args) {
        Cartao cartao1 = new Cartao(2000.0, 2000.0);
        Carrinho carrinho = new Carrinho();
        Cliente louise = new Cliente("Louise", cartao1, 5000.0);
        Produto arroz = new Produto("arroz", 3.45);
        Produto feijao = new Produto("feijao", 7.05);
        Produto acucar = new Produto("acucar", 4.65);

        carrinho.adicionarProduto(arroz);
        carrinho.adicionarProduto(acucar);
        carrinho.adicionarProduto(feijao);
        System.out.println(louise.getCartao().getSaldo());
        System.out.println();
        System.out.println("depois das compras dos tres produtos");
        louise.realizarCompra(carrinho);
        System.out.println(louise.getCartao().getSaldo());
    }
}
