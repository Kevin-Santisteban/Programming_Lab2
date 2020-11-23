package com.itmo.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.itmo.moves.*;

public class Salandit extends Pokemon {
    public Salandit(String name, int level){
        super(name, level);
        setType(Type.POISON, Type.FIRE);
        //HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED
        setStats(48,44,40,71,40,77);
        setMove(new DragonRage(), new FlameCharge(), new FireBlast());
    }

}
