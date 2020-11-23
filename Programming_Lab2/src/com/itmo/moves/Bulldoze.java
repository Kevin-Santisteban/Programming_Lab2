package com.itmo.moves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove{
    public Bulldoze() {
        super(Type.GROUND, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon attackedPokemon) {
            attackedPokemon.setMod(Stat.SPEED, -1);

    }
}



//
//    Move data
//    Type	GROUND
//    Category	Physical  Physical
//        Power	60
//        Accuracy	100
//        PP	20  (max. 32)
//        Makes contact?	No
//        Introduced	Generation 5
//
//        Effects
//        Bulldoze deals damage and lowers the target's Speed by one stage.
//
//        Stats can be lowered to a minimum of -6 stages each.