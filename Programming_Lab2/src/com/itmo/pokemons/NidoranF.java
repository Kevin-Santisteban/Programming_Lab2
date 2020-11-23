package com.itmo.pokemons;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.*;
import com.itmo.moves.*;

public class NidoranF extends  Pokemon{
    public NidoranF(String name, int level){
        super(name, level);
        setType(Type.POISON);
        //HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED
        setStats(55,47,52,40,40,41);
        setMove(new AerialAce(), new SludgeBomb());
    }

}