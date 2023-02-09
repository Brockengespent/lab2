package lab2.mypoc;

import lab2.mymoves.LaprasMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lapras extends Pokemon {
    public Lapras(java.lang.String name, int level) {
        super(name, level);
        super.setType(Type.WATER, Type.ICE);
        super.setStats(130, 85, 80, 85, 95, 60);

        Psychic psychic  = new Psychic(90, 100);
        Swagger swagger = new Swagger(0, 85);
        AncientPower ancientPower = new AncientPower(60, 80);
        Thunder thunder= new Thunder(60,80);
        super.setMove(psychic, swagger, ancientPower, thunder);
    }
}
