package com.itmo.moves;

import ru.ifmo.se.pokemon.*;

import java.util.Arrays;

public class SludgeBomb  extends SpecialMove {
            public SludgeBomb(){
                super(Type.POISON, 90, 100);
            }

    @Override
    protected void applyOppEffects(Pokemon attackedPokemon) {

        if (Math.random() <= 0.30 && !(Arrays.asList(attackedPokemon.getTypes()).contains( Type.POISON ) || Arrays.asList(attackedPokemon.getTypes()).contains( Type.STEEL ) )){
            Effect.poison(attackedPokemon);
        }
    }
}


//
//    Move data
//    Type	POISON
//    Category	Special  Special
//        Power	90
//        Accuracy	100
//        PP	10  (max. 16)
//        Makes contact?	No
//        Introduced	Generation 2
//
//        Effects
//        Sludge Bomb deals damage and has a 30% chance of poisoning the target.
//
//        Poison or Steel type Pokémon,
//        those with the ability Immunity or those behind a Substitute cannot be poisoned.