package com.example;

public class Computador extends Jogador{
   
   
   // aqui estamos sobrescrevendo o metodo que está na classe do jogador, pois pode ocorrer o polimorfismo, 
   //que é quando o mesmo método pode agir de forma diferente dependendo da classe
  //esse @ significa que a intenção pe sobrescrever um método
  /*
  -- Jeito "errado"
    @Override
  public boolean parou() {
    if (this.getPontos() > 16) {
        return true;
    }else{
        return false;
    }
  }
  */
  
  @Override
  public boolean parou() {
    return getPontos() > 16;
  }



  
}
