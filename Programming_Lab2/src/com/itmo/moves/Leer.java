package com.itmo.moves;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {
    public Leer(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon attackedPokemon){
        attackedPokemon.setMod(Stat.DEFENSE, -1);
    }
}

//
//    Move data
//    Type	NORMAL
//    Category	Status  Status
//        Power	—
//        Accuracy	100
//        PP	30  (max. 48)
//        Makes contact?	No
//        Introduced	Generation 1
//        Effects
//        Leer lowers the target's Defense by one stage.
//
//        Stats can be lowered to a minimum of -6 stages each.