package com.itmo.battles;
import com.itmo.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class PokemonBattle {

    public static void main(String[] args) {

        Battle battle = new Battle();

        Pokemon p1 = new Salazzle("Wild", 1);
        Pokemon p2 = new Nidorina("Angry", 1);
        Pokemon p3 = new Sawk("Mad", 1);

        Pokemon p4 = new Nidoqueen("Sad", 1);
        Pokemon p5 = new Salandit("Fast", 1);
        Pokemon p6 = new NidoranF("Happy", 1);

        battle.addAlly(p1);
        battle.addAlly(p2);
        battle.addAlly(p3);

        battle.addFoe(p4);
        battle.addFoe(p5);
        battle.addFoe(p6);
        battle.go();
    }
}
