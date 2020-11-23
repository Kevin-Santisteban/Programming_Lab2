package com.itmo.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.itmo.moves.*;
public class Nidorina extends NidoranF {
    public Nidorina(String name, int level){
        super(name, level);
        setType(Type.POISON);
        //HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED
        setStats(70,62,67,55,55,56);

        setMove(new AerialAce(), new SludgeBomb(), new Crunch());

    }

}