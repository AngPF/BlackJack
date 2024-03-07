package com.example;

public class Jogo{

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new  Computador();

    public Jogo(){
        monte.embaralhar();
    }

    public Carta distribuirCartaParaJogador(Jogador jogador){
        // early return

        if(jogador.parou()) return null;
       
        var carta = monte.virar();
        jogador.receberCarta(carta);
        return carta;
    }

    public boolean acabou(){

        var osDoisJogadoresPararam = jogador.parou() && computador.parou();
        var alguemEstourou = jogador.getPontos() > 21 || computador.getPontos() > 21;

        return osDoisJogadoresPararam || alguemEstourou;
    }

    public String resultado(){

        var pontuacaoIgual = jogador.getPontos() == computador.getPontos();
        var computadorEstourou = computador.getPontos() > 21;
        var jogadorEstourou = jogador.getPontos() > 21;
        var osDoisEstouraram = jogadorEstourou && computadorEstourou;
        var jogadorTemMaisPontos = jogador.getPontos() > computador.getPontos();

        if (pontuacaoIgual || osDoisEstouraram) return "Empatou";
        if (jogadorTemMaisPontos && !jogadorEstourou || computadorEstourou) return "Você Ganhou";
        return "Você Perdeu";
    }

}