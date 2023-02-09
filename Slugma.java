package lab2.mypoc;

import lab2.mymoves.SlugmaMoves.Facade;
import lab2.mymoves.SlugmaMoves.Harden;
import lab2.mymoves.SlugmaMoves.LavaPlum;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slugma extends Pokemon {
    public Slugma(java.lang.String name, int level) {
        super(name, level);
        super.setType(Type.FIRE);
        super.setStats(40, 40, 40, 70, 40, 40);

        Harden harden = new Harden(0,0);
        LavaPlum lavaPlum = new LavaPlum(75, 100);
        Facade facade = new Facade(70, 100);
        super.setMove(harden, lavaPlum, facade);
    }
}