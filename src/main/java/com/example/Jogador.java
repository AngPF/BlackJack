package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    
    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>(); //sempre q criar um atributo do tipo referencia é recomendado ja instanciar
    private boolean parou = false;

    // ja colocamos os valores em cima, então podemos usar o construtor padrão

    public void receberCarta(Carta carta){
        cartas.add(carta);
        pontos += carta.getNumero();
    }

    public void parar(){
        parou = true;
    }

    public int getPontos() {
        return pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public boolean parou() {
        return parou;
    }

    

}
