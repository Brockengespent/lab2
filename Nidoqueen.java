package lab2.mypoc;

import lab2.mymoves.NidoranMoves.Growl;
import lab2.mymoves.NidoranMoves.IceBeam;
import lab2.mymoves.NidoranMoves.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoqueen extends Nidorina {
    public Nidoqueen(java.lang.String name, int level) {
        super(name, level);
        super.setType(Type.POISON, Type.GROUND);
        super.setStats(90, 92, 87, 75, 85, 76);

        IceBeam iceBeam= new IceBeam(90, 100);
        TailWhip tailWhip= new TailWhip(0,0);
        Growl growl=new Growl(0,0);
        super.setMove(iceBeam, tailWhip, growl);
    }
}
