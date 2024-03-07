package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Monte {

    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        for(Naipe naipe: Naipe.values()){//pra cada naipe dentro desse array de naipes (a var naipe pega o valor dos naipes)
            for(int i = 0; i <= 13; i++){
                cartas.add(new Carta(i, naipe));
                
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta virar(){
        return cartas.remove(0);
    }

    

}
