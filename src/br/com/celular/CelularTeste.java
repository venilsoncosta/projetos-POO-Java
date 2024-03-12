package br.com.celular;

public class CelularTeste {
    public static void main(String[] args) {
        Celular louiseCelular = new Celular("Lg k10", 1200.0);
        Pessoa louise = new Pessoa("Louise", "96981372325", louiseCelular);

        Celular venilsonCelular = new Celular("Xiaomi redmi", 1000.0);
        Pessoa venilson = new Pessoa("Venilson", "83981372325", venilsonCelular);

        louise.enviarMensagem("ei", venilson);
        venilson.enviarMensagem("ei ei", louise);

    }
}
