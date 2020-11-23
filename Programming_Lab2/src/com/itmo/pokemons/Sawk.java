package com.itmo.pokemons;
import com.itmo.moves.DoubleKick;
import com.itmo.moves.KarateChop;
import com.itmo.moves.Leer;
import com.itmo.moves.RockSmash;
import ru.ifmo.se.pokemon.*;
import com.itmo.moves.*;
//#539
//#level 17
public class Sawk extends  Pokemon{
    public Sawk(String name, int level){
        super(name, level);
        setType(Type.FIGHTING);
        //HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED
        setStats(75,125,75,30,75,85);
        setMove(new KarateChop(), new RockSmash(), new DoubleKick(), new Leer());
    }

}
