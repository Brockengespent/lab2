package lab2;

import lab2.mypoc.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {
    // https://pokemondb.net/pokedex/lapras
    //https://pokemondb.net/pokedex/slugma
    // https://pokemondb.net/pokedex/magcargo
    // https://pokemondb.net/pokedex/nidoran-f
    // https://pokemondb.net/pokedex/nidorina
    // https://pokemondb.net/pokedex/nidoqueen

    public static void main(String[] args) {
        Battle b = new Battle();
        Magcargo magcargo= new Magcargo("Маша", 1);
        Lapras lapras= new Lapras("", 1);
        Nidoqueen nidoqueen= new Nidoqueen("", 1);
        Nidoran nidoran= new Nidoran("", 1);
        Nidorina nidorina = new Nidorina("", 1);
        Slugma slugma = new Slugma("", 1);
        b.addAlly(magcargo);
        b.addAlly(nidoqueen);
        b.addAlly(nidoran);
        b.addFoe(lapras);
        b.addFoe(nidorina);
        b.addFoe(slugma);
        b.go();

    }
    public static boolean chance(double d){
        return d> Math.random();
    }

}

