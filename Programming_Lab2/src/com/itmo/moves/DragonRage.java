package com.itmo.moves;

import ru.ifmo.se.pokemon.*;

public class DragonRage extends SpecialMove {
    public DragonRage(){
        super(Type.DRAGON,0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon attackedPokemon) {
            attackedPokemon.setMod(Stat.HP, 40);

    }
}


//    Type	DRAGON
//    Category	Special  Special
//        Power	—
//        Accuracy	100
//        PP	10  (max. 16)
//        Makes contact?	No
//        Introduced	Generation 1

//        Effects
//        Dragon Rage always deals 40 HP damage to the target, regardless of typing. It has no additional effect.
//
