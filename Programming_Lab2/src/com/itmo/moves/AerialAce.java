package com.itmo.moves;


import ru.ifmo.se.pokemon.*;



public class AerialAce extends PhysicalMove{
    public AerialAce(){
        super(Type.FLYING, 60, 100);

    }
//    @Override
//    protected void applyOppDamage(Pokemon attackedPokemon, double damage){
//        if(attackedPokemon.getCondition())
//    }

//    @Override
//    protected void applyOppEffects(Pokemon attackedPokemon){
//        attackedPokemon.setMod(Stat.EVASION, -1);
//    }

}



//
//    Move data
//    Type	FLYING
//    Category	Physical  Physical
//        Power	60
//        Accuracy	∞
//        PP	20  (max. 32)
//        Makes contact?	Yes
//        Introduced	Generation 3
//
//        Effects
//        Aerial Ace deals damage and ignores changes to the Accuracy and Evasion stats. However,
//        it will not hit Pokémon during the invulnerable stage of Bounce, Dig, Dive, Fly,
//        Shadow Force or Sky Drop.