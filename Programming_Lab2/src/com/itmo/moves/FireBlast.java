package com.itmo.moves;
import  ru.ifmo.se.pokemon.*;

import java.util.ArrayList;
import java.util.Arrays;

public class FireBlast extends SpecialMove{
        public FireBlast(){
            super(Type.FIRE, 110, 85);
        }
    protected void applyOppEffects(Pokemon attackedPokemon) {

        if (Math.random() <= 0.1 && !(Arrays.asList(attackedPokemon.getTypes()).contains( Type.FIRE ) )){
            Effect.burn(attackedPokemon);
        }
    }
}






//
//    Move data
//    Type	FIRE
//    Category	Special  Special
//        Power	110
//        Accuracy	85
//        PP	5  (max. 8)
//        Makes contact?	No
//        Introduced	Generation 1
//
//        Effects
//        Fire Blast deals damage and has a 10% chance of burning the target.
//
//        Fire type Pokémon, those with the ability Water Veil or those behind a Substitute cannot be burned.