package br.com.celular;

public class Pessoa {
    private String nome;
    private String numeroCelular;
    private Celular celular;

    public Pessoa(String nome, String numeroCelular, Celular celular) {
        this.nome = nome;
        this.numeroCelular = numeroCelular;
        this.celular = celular;
    }

    public void enviarMensagem(String texto, Pessoa pessoa){
        System.out.println("Mensagem enviada para " + pessoa.getNome());
        System.out.println(texto);
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public Celular getCelular() {
        return celular;
    }
}
