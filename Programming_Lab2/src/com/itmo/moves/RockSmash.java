package com.itmo.moves;

import ru.ifmo.se.pokemon.*;

public class RockSmash  extends PhysicalMove {
    public RockSmash(){
        super(Type.FIGHTING, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon attackedPokemon) {
        if (Math.random() <= 0.5){
            attackedPokemon.setMod(Stat.DEFENSE, -1);
        }
    }
}



//
//    Type	FIGHTING
//    Category	Physical  Physical
//        Power	40
//        Accuracy	100
//        PP	15  (max. 24)
//        Makes contact?	Yes
//        Introduced	Generation 2
//Effects
//        Rock Smash deals damage and has a 50% chance of lowering the target's Defense by one stage.
//

