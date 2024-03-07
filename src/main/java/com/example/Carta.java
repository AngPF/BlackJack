package com.example;

public class Carta {
    
    private int numero;
    private Naipe naipe;//ele é um enum, mas quando vamos usar o enum criamos um tipo tbm
    private final String[] NUMEROS = 
    {"", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 

    
    //quando vamos criar um obj carta chamamos o construtor, 
    //pq é nele que está os parametros que vamos utilizar e é ele quem cria o obj
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }


    public String imagePath(){
        return "classic-cards/" + NUMEROS[numero] + naipe + ".png";
    }


    public int getNumero() {
        return numero;
    }


    public Naipe getNaipe() {
        return naipe;
    }

    //não precisa de set pq nada dessa classe será alterada

}
