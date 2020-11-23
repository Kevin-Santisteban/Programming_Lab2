package com.itmo.pokemons;
import com.itmo.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Nidoqueen extends Nidorina {
    public Nidoqueen(String name, int level){
        super(name, level);
        setType(Type.POISON);
        //HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED
        setStats(90,92,87,75,85,76);

        setMove(new AerialAce(), new SludgeBomb(), new Crunch(), new Bulldoze());

    }

}