package com.itmo.moves;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove {
    public Crunch() {
        super(Type.DARK, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon attackedPokemon) {
        if (Math.random() <= 0.2) {
            attackedPokemon.setMod(Stat.DEFENSE, -1);
        }
    }
}





//
//    Move data
//    Type	DARK
//    Category	Physical  Physical
//        Power	80
//        Accuracy	100
//        PP	15  (max. 24)
//        Makes contact?	Yes
//        Introduced	Generation 2
//
//        Effects
//        Crunch deals damage and has a 20% chance of lowering the target's Defense by one stage.
//
//        Stats can be lowered to a minimum of -6 stages each.