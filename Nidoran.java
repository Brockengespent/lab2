package lab2.mypoc;

import lab2.mymoves.NidoranMoves.IceBeam;
import lab2.mymoves.NidoranMoves.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoran extends Pokemon {
    public Nidoran(java.lang.String name, int level) {
        super(name, level);
        super.setType(Type.POISON);
        super.setStats(55, 47, 52, 40, 40, 41);

        IceBeam iceBeam= new IceBeam(90, 100);
        TailWhip tailWhip= new TailWhip(0,0);
        super.setMove(iceBeam, tailWhip);
    }
}
