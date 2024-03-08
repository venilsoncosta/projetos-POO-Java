package br.com.cassino.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loteria {
    private final List<Integer> numerosSorteados;

    public Loteria(){
        this.numerosSorteados = new ArrayList<>();
    }

    public void sortearNumeros() {
        for (int i = 0; i < 5; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = (int) (Math.random() * 101);
            } while (numerosSorteados.contains(numeroAleatorio));

            numerosSorteados.add(numeroAleatorio);
        }
        Collections.sort(numerosSorteados);
        System.out.println("Números sorteados: " + numerosSorteados);
    }

    public int compararNumeros(List<Integer> numerosUsuario){
        int numerosCorretos = 0;
        for(int numero : numerosUsuario){
            if(numerosSorteados.contains(numero)){
                numerosCorretos++;
            }
        }
        return numerosCorretos;
    }


}
