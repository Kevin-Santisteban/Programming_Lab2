package com.itmo.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class KarateChop extends PhysicalMove {
    public KarateChop() {
        super(Type.FIGHTING, 50, 100);
    }

}


//    Move data
//    Type	FIGHTING
//    Category	Physical  Physical
//        Power	50
//        Accuracy	100
//        PP	25  (max. 40)
//        Makes contact?	Yes
//        Introduced	Generation 1
//        Effects
//        Karate Chop deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄24).