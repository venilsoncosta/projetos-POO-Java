package br.com.cassino.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    private List<Integer> numerosEscolhidos;

    public Usuario(){
        this.numerosEscolhidos = new ArrayList<>();
    }

    public void escolherNumeros(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha 5 números de 0 a 100");
        for(int i = 0; i < 5; i++){
            int numero = entrada.nextInt();
            numerosEscolhidos.add(numero);
        }
    }

    public List<Integer> getNumerosEscolhidos() {
        return numerosEscolhidos;
    }
}
