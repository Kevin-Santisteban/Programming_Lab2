package com.itmo.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.itmo.moves.*;
public class Salazzle extends Salandit {
    public Salazzle(String name, int level){
        super(name, level);
        setType(Type.POISON, Type.FIRE);
        //HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED
        setStats(60,64,60,111,60,117);

        setMove(new DragonRage(), new FlameCharge(), new FireBlast(), new Pound());

    }

}
