package com.itmo.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleKick extends PhysicalMove {
    public DoubleKick() {
        super(Type.FIGHTING, 30, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon attackedPokemon, double damage){
        attackedPokemon.setMod(Stat.HP, (int) Math.round(damage) * -2);
    }

}




//    Type	FIGHTING
//    Category	Physical  Physical
//        Power	30
//        Accuracy	100
//        PP	30  (max. 48)
//        Makes contact?	Yes
//        Introduced	Generation 1
//        Effects
//        Double Kick deals damage and will strike twice (with 30 base power each time).
//        Each strike of Double Kick is treated like a separate attack:
