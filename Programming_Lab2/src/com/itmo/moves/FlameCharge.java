package com.itmo.moves;
import ru.ifmo.se.pokemon.*;


public class FlameCharge extends PhysicalMove {
    public FlameCharge() {
        super(Type.FIRE, 50, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon attackingPokemon) {
        attackingPokemon.setMod(Stat.SPEED, 1);
    }
}


//
//    Move data
//    Type	FIRE
//    Category	Physical  Physical
//        Power	50
//        Accuracy	100
//        PP	20  (max. 32)
//        Makes contact?	Yes
//        Introduced	Generation 5
//
//        Effects
//        Flame Charge deals damage and raises the user's Speed by one stage.
//
//        Stats can be raised to a maximum of +6 stages each.