package lab2.mypoc;

import lab2.mymoves.SlugmaMoves.Facade;
import lab2.mymoves.SlugmaMoves.Harden;
import lab2.mymoves.SlugmaMoves.LavaPlum;
import lab2.mymoves.SlugmaMoves.ShellSmash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Magcargo extends Slugma {
    public Magcargo(java.lang.String name, int level) {
        super(name, level);
        super.setType(Type.FIRE, Type.ROCK);
        super.setStats(60, 50, 120, 90, 80, 30);

        Harden harden = new Harden(0,0);
        LavaPlum lavaPlum = new LavaPlum(75, 100);
        Facade facade = new Facade(70, 100);
        ShellSmash shellSmash= new ShellSmash(0,0);
        super.setMove(harden, lavaPlum, facade, shellSmash);
    }
}
